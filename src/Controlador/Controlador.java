package Controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;

import javax.management.modelmbean.ModelMBean;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionDAO.*;
import Modelo.OpcionTablaDestino;
import Modelo.Relacion;
import Vista.*;
import Modelo.RelacionCampos;

public class Controlador {

	private daoConexionSQL conexion;

	private String CadenaConexionDestino = "";

	// VEntanas del sistema
	private ConfiguracionConexion configuracionConexion;

	private RelacionCampSQL RelacionCampSQL;

	private RelacionCampDBF RelacionCampDBF;

	private RelacionCampExcel RelacionCampExcel;

	private ResumenTraspaso ResumenTraspaso;

	// Variables para el traspaso

	private String ejercicio;

	private int digitosCuentas;

	private int digitosGrupos;

	private String almacenDestino;

	private String tipoTablaOrigen;

	// ARRAYS Y OBJETOS DATOS PARA SER UTILIZADOS DURANTE LA EJECUCION DE LA
	// APLICACION

	ArrayList<OpcionTablaDestino> tablasDestino;
	private RelacionCampos relacionCampos = new RelacionCampos();


	// Objetos DAO o CRUD de la base de datos
//		private SancionDAO sancionDAO; 

	public Controlador() {
		// Creamos las ventanas de la aplicaci�n
		configuracionConexion = new ConfiguracionConexion();
		//RelacionCampSQL = new RelacionCampSQL();
		RelacionCampDBF = new RelacionCampDBF();
		RelacionCampExcel = new RelacionCampExcel();
		ResumenTraspaso = new ResumenTraspaso();
		conexion = new daoConexionSQL(this);

		configuracionConexion.controlador(this);
		//RelacionCampSQL.setControlador(this);
		RelacionCampDBF.setControlador(this);
		RelacionCampExcel.setControlador(this);

	}

	public void inciarPrograma() {
		configuracionConexion.setVisible(true);
	}

	public void cerrarVentanaDBF() {
		RelacionCampDBF.setVisible(false);
	}

	public void cerrarVentanaExcel() {
		RelacionCampExcel.setVisible(false);
	}

	public void cerrarVentanaSQL() {
		RelacionCampSQL.setVisible(false);
	}

	public void setConexionDestino(String cadenaConexion, String usuario, String contrasena) {
		conexion.setCadenaConexionDestino(cadenaConexion);
		conexion.setUsuarioDestino(usuario);
		conexion.setContrasenaDestino(contrasena);

	}

	public void testConexionDestino() {
		conexion.testConexionDestino();
	}

	public void setConexionOrigen(String cadenaConexion, String usuario, String contrasena) {
		conexion.setCadenaConexionOrigen(cadenaConexion);
		conexion.setUsuarioOrigen(usuario);
		conexion.setContrasenaOrigen(contrasena);

	}

	public void testConexionOrigen() {
		conexion.testConexionOrigen();
	}

	public void controlSeleccionOrigen(JRadioButton SQL, JRadioButton DBF, JRadioButton Excel) {
		String valorSeleccionado = "SQL";
		if (SQL.isSelected()) {
			valorSeleccionado = "SQL";
		}

		if (DBF.isSelected()) {
			valorSeleccionado = "DBF";
		}

		if (Excel.isSelected()) {
			valorSeleccionado = "Excel";
		}

		System.out.println(valorSeleccionado);

		switch (valorSeleccionado) {
		case "SQL":
			configuracionConexion.getTextServidorOrigen().setEnabled(true);
			configuracionConexion.getTextUsuarioOrigen().setEnabled(true);
			configuracionConexion.getTextClaveOrigen().setEnabled(true);
			configuracionConexion.getTextNombreBD().setEnabled(true);
			configuracionConexion.getBtnProbarConexionOrigen().setEnabled(true);

			configuracionConexion.getTextRutaDBF().setEnabled(false);
			configuracionConexion.getBtnFicheroDBF().setEnabled(false);

			configuracionConexion.getTextRutaExcel().setEnabled(false);
			configuracionConexion.getBtnFicheroExcel().setEnabled(false);
			break;
		case "DBF":
			configuracionConexion.getTextServidorOrigen().setEnabled(false);
			configuracionConexion.getTextUsuarioOrigen().setEnabled(false);
			configuracionConexion.getTextClaveOrigen().setEnabled(false);
			configuracionConexion.getTextNombreBD().setEnabled(false);
			configuracionConexion.getBtnProbarConexionOrigen().setEnabled(false);

			configuracionConexion.getTextRutaDBF().setEnabled(false);
			configuracionConexion.getBtnFicheroDBF().setEnabled(true);

			configuracionConexion.getTextRutaExcel().setEnabled(false);
			configuracionConexion.getBtnFicheroExcel().setEnabled(false);
			break;
		case "Excel":
			configuracionConexion.getTextServidorOrigen().setEnabled(false);
			configuracionConexion.getTextUsuarioOrigen().setEnabled(false);
			configuracionConexion.getTextClaveOrigen().setEnabled(false);
			configuracionConexion.getTextNombreBD().setEnabled(false);
			configuracionConexion.getBtnProbarConexionOrigen().setEnabled(false);

			configuracionConexion.getTextRutaDBF().setEnabled(false);
			configuracionConexion.getBtnFicheroDBF().setEnabled(false);

			configuracionConexion.getTextRutaExcel().setEnabled(false);
			configuracionConexion.getBtnFicheroExcel().setEnabled(true);
			break;
		}
	}

	public void rellenaComboTablasOrigen() {
		ArrayList<String> tablas = null;

		switch (tipoTablaOrigen) {
		case "Tablas":
			tablas = conexion.devuelveTablasOrigen();
			break;
		case "Vistas":
			tablas = conexion.devuelveVistasOrigen();
			break;
		}

		DefaultComboBoxModel modelo = new DefaultComboBoxModel();

		for (int i = 0; i < tablas.size(); i++) {
			modelo.addElement(tablas.get(i));
		}

		RelacionCampSQL.getComboBoxOrigen().setModel(modelo);

	}

	public void rellenaComboTablasDestino(String tipoOrigen) {
		OpcionTablaDestino tabla;
		tablasDestino = new ArrayList<>();

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Agentes");
		tabla.setValorSwitch("Agentes");
		tabla.setTabla("AGENTG");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Almacenes");
		tabla.setValorSwitch("Almacenes");
		tabla.setTabla("ALMACE");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Articulos");
		tabla.setValorSwitch("Articulos");
		tabla.setTabla("ARTICU");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Asientos");
		tabla.setValorSwitch("Asientos");
		tabla.setTabla("APUN22");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Bancos clientes");
		tabla.setValorSwitch("BancosClientes");
		tabla.setTabla("DATBAN");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Bancos proveedores");
		tabla.setValorSwitch("BancosProveedores");
		tabla.setTabla("DATBAN");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Bancos empresa");
		tabla.setValorSwitch("BancosEmpresa");
		tabla.setTabla("BANCOS");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Clientes");
		tabla.setValorSwitch("Clientes");
		tabla.setTabla("CLIENT");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Contactos clientes");
		tabla.setValorSwitch("ContactosClientes");
		tabla.setTabla("CONTAC");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Contactos proveedores");
		tabla.setValorSwitch("ContactosProveedores");
		tabla.setTabla("CONTAC");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Cuentas contables");
		tabla.setValorSwitch("CuentasContables");
		tabla.setTabla("CUENTA");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Direcciones clientes");
		tabla.setValorSwitch("DireccionesClientes");
		tabla.setTabla("DIRECC");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Direcciones proveedores");
		tabla.setValorSwitch("DireccionesProveedores");
		tabla.setTabla("DIRECC");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Facturas emitidas");
		tabla.setValorSwitch("FacturasEmitidas");
		tabla.setTabla("FACEMI");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Facturas recibidas");
		tabla.setValorSwitch("FacturasRecibidas");
		tabla.setTabla("FACREC");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Familias");
		tabla.setValorSwitch("Familias");
		tabla.setTabla("FAMILI");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Formas de pago");
		tabla.setValorSwitch("FormasPago");
		tabla.setTabla("FORPAG");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Marcas articulos");
		tabla.setValorSwitch("MarcasArticulos");
		tabla.setTabla("MARART");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Previsiones");
		tabla.setValorSwitch("Previsiones");
		tabla.setTabla("EFECTO");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Proveedores");
		tabla.setValorSwitch("Proveedores");
		tabla.setTabla("PROVEE");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Stocks");
		tabla.setValorSwitch("Stocks");
		tabla.setTabla("ALMA01");
		tablasDestino.add(tabla);

		tabla = new OpcionTablaDestino();
		tabla.setDescripcion("Subfamilias articulos");
		tabla.setValorSwitch("SubfamiliasArticulos");
		tabla.setTabla("SUBFAM");
		tablasDestino.add(tabla);
		JComboBox comboTablasDestino = null;

		switch (tipoOrigen) {
		case "SQL":
			comboTablasDestino = RelacionCampSQL.getComboBoxDestino();
			break;
		case "DBF":

			break;
		case "Excel":

			break;

		default:
			break;
		}

		DefaultComboBoxModel modelo = new DefaultComboBoxModel();
		for (int i = 0; i < tablasDestino.size(); i++) {
			modelo.addElement(tablasDestino.get(i).getDescripcion());
		}

		comboTablasDestino.setModel(modelo);
	}

	public void rellenaTablaOrigen(String tipoOrigen) {
		String nombreTabla = RelacionCampSQL.getComboBoxOrigen().getSelectedItem().toString();

		ArrayList<String> columnas = conexion.devuelveColumnasTabla(nombreTabla, "Origen");

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Campos Origen");

		String[] fila = new String[1];

		for (Iterator iterator = columnas.iterator(); iterator.hasNext();) {
			String nombreColumna = (String) iterator.next();
			fila[0] = nombreColumna;
			modelo.addRow(fila);

		}

		switch (tipoOrigen) {
		case "SQL":
			RelacionCampSQL.getTableColumOrigen().setModel(modelo);
			break;
		case "DBF":

			break;
		case "Excel":

			break;

		default:
			break;
		}

	}

	public void rellenaTablaDestino(String tipoOrigen) {
		int indexTabla = RelacionCampSQL.getComboBoxDestino().getSelectedIndex();
		String nombreTabla = tablasDestino.get(indexTabla).getTabla();

		ArrayList<String> columnas = conexion.devuelveColumnasTabla(nombreTabla, "Destino");

		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Campos Destino");

		String[] fila = new String[1];

		for (Iterator iterator = columnas.iterator(); iterator.hasNext();) {
			String nombreColumna = (String) iterator.next();
			fila[0] = nombreColumna;
			modelo.addRow(fila);

		}

		switch (tipoOrigen) {
		case "SQL":
			RelacionCampSQL.getTableColumDestino().setModel(modelo);
			break;
		case "DBF":

			break;
		case "Excel":

			break;

		default:
			break;
		}

	}

	public void traspasoCamposEntreTablas(String origenDatos, int tipo) {
		JTable tableColumOrigen = null;
		JTable tableColumDestino = null;
		JTable tableRelacionCampos = null;

		DefaultTableModel cabeceraRelacion;

		String columnaOrigen = "";
		String columnaDestino = "";

		int ultimaFilaRelacion = 0;

		switch (origenDatos) {
		case "SQL":
			tableColumOrigen = RelacionCampSQL.getTableColumOrigen();
			tableColumDestino = RelacionCampSQL.getTableColumDestino();
			tableRelacionCampos = RelacionCampSQL.getTableRelacionCampos();
			cabeceraRelacion = (DefaultTableModel) tableRelacionCampos.getModel();
			ultimaFilaRelacion = tableRelacionCampos.getRowCount() - 1;
			break;
		case "DBF":
			break;
		case "Excel":
			break;
		default:
			tableColumOrigen = null;
			tableColumDestino = null;
			tableRelacionCampos = null;
			cabeceraRelacion = null;
			ultimaFilaRelacion = 0;
			break;
		}

		ArrayList<Relacion> relacion = relacionCampos.getRelacionColumnas();

		ultimaFilaRelacion = tableRelacionCampos.getRowCount() - 1;

		switch (tipo) {
		/**
		 * Cuando pulsamos el boton para mover de la tableColumOrigen hacia la
		 * tableRelacionCampos
		 */
		case 1:
			try {

				if (tableRelacionCampos.getSelectedRowCount() > 0) {
					columnaOrigen = (String) tableColumOrigen.getValueAt(tableColumOrigen.getSelectedRow(),
							tableColumOrigen.getSelectedColumn());

					Relacion filaRelacion = relacion.get(tableRelacionCampos.getSelectedRow());

					if (filaRelacion.getCampoDestino().equals("")) {
						filaRelacion.setCampoOrigen(columnaOrigen);
						filaRelacion.setCampoDestino("");
						filaRelacion.setCampoOrigenRelleno(true);
						filaRelacion.setCampoDestinoRelleno(false);

						refrescarTablaRelacion(tableRelacionCampos);
					} else {
						filaRelacion.setCampoOrigen(columnaOrigen);
						filaRelacion.setCampoOrigenRelleno(true);

						refrescarTablaRelacion(tableRelacionCampos);
					}

				} else {
					columnaOrigen = (String) tableColumOrigen.getValueAt(tableColumOrigen.getSelectedRow(),
							tableColumOrigen.getSelectedColumn());
					System.out.println(columnaOrigen);

					Relacion filaRelacion = new Relacion();
					filaRelacion.setCampoOrigen(columnaOrigen);
					filaRelacion.setCampoDestino("");
					filaRelacion.setCampoOrigenRelleno(true);
					filaRelacion.setCampoDestinoRelleno(false);
					relacion.add(filaRelacion);

					refrescarTablaRelacion(tableRelacionCampos);
				}

			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Error al determinar el traspaso de datos de Origen\n " + e + ".",
						"Aviso", JOptionPane.ERROR_MESSAGE);
			}

			break;
		/**
		 * Cuando pulsamos el boton para mover de la tableColumDestino hacia la
		 * tableRelacionCampos
		 */
		case 2:
			try {
				if (relacion.size() == 1) {
					columnaDestino = (String) tableColumDestino.getValueAt(tableColumDestino.getSelectedRow(),
							tableColumDestino.getSelectedColumn());
					relacion.get(ultimaFilaRelacion).setCampoDestino(columnaDestino);
					refrescarTablaRelacion(tableRelacionCampos);

				} else {

					if (devuelveNFilasColumnaDestinoVacias(tableRelacionCampos) > 1) {
						if (tableRelacionCampos.getSelectedRowCount() != 0) {
							columnaDestino = (String) tableColumDestino.getValueAt(tableColumDestino.getSelectedRow(),
									tableColumDestino.getSelectedColumn());

							relacion.get(tableRelacionCampos.getSelectedRow()).setCampoDestino(columnaDestino);

							refrescarTablaRelacion(tableRelacionCampos);
						} else {
							JOptionPane.showMessageDialog(null,
									"No se ha seleccionado ninguna fila de la columna relacion\n ", "Aviso",
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						columnaDestino = (String) tableColumDestino.getValueAt(tableColumDestino.getSelectedRow(),
								tableColumDestino.getSelectedColumn());

						if (relacion.get(devuelvePosicionColumnaDestinoVacia(tableRelacionCampos)).getCampoDestino()
								.equals("")) {
							relacion.get(devuelvePosicionColumnaDestinoVacia(tableRelacionCampos))
									.setCampoDestino(columnaDestino);
						}

						refrescarTablaRelacion(tableRelacionCampos);

					}

				}

			} catch (Exception e) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(null, "Error al determinar el traspaso de datos de Destino\n " + e + ".",
						"Aviso", JOptionPane.ERROR_MESSAGE);
			}

			break;
		}

	}

	public void refrescarTablaRelacion(JTable tablaRelacion) {
		DefaultTableModel modelo = new DefaultTableModel();

		modelo.addColumn("Columna Origen");
		modelo.addColumn("Columna Destino");

		String[] fila;
		for (int i = 0; i < relacionCampos.getRelacionColumnas().size(); i++) {

			Relacion filaRelacion = relacionCampos.getRelacionColumnas().get(i);

			fila = new String[2];
			fila[0] = filaRelacion.getCampoOrigen();
			fila[1] = filaRelacion.getCampoDestino();

			modelo.addRow(fila);

		}

		tablaRelacion.setModel(modelo);
	}

	public int devuelveNFilasColumnaDestinoVacias(JTable relacion) {
		int filaVacia = 0;
		for (int i = 0; i < relacionCampos.getRelacionColumnas().size(); i++) {
			if (relacionCampos.getRelacionColumnas().get(i).getCampoDestino().equals("")) {
				filaVacia++;
			}
		}
		return filaVacia;
	}

	public int devuelvePosicionColumnaDestinoVacia(JTable relacion) {
		int filaVacia = 0;

		for (int i = 0; i < relacionCampos.getRelacionColumnas().size(); i++) {
			if (relacionCampos.getRelacionColumnas().get(i).getCampoDestino().equals("")) {
				filaVacia = i;

			}
		}

		return filaVacia;
	}

	public void borrarRelacionSeleccionada(String tipo) {
		JTable tableRelacionCampos = null;
		switch (tipo) {
		case "SQL":
			tableRelacionCampos = RelacionCampSQL.getTableRelacionCampos();
			break;
		case "DBF":

			break;
		case "Excel":

			break;
		}

		ArrayList<Relacion> relacion = relacionCampos.getRelacionColumnas();
		

		if (tableRelacionCampos.getRowCount() > 0) {
			if (tableRelacionCampos.getSelectedRowCount() == 1) {
				relacion.remove(tableRelacionCampos.getSelectedRow());
			} else {
				JOptionPane.showMessageDialog(RelacionCampSQL, "No se ha seleccionado ninguna relación.", "Aviso",
						JOptionPane.INFORMATION_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(RelacionCampSQL, "No existen relaciones para borrar.", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
		}

		refrescarTablaRelacion(tableRelacionCampos);

	}
	
	public void borrarRelaciones(String tipo) {
		JTable tableRelacionCampos = null;
		switch (tipo) {
		case "SQL":
			tableRelacionCampos = RelacionCampSQL.getTableRelacionCampos();
			break;
		case "DBF":

			break;
		case "Excel":

			break;
		}
		
		ArrayList<Relacion> relacion = relacionCampos.getRelacionColumnas();
		
		if (tableRelacionCampos.getRowCount()>0) {
			relacion.clear();
			
		}else {
			JOptionPane.showMessageDialog(RelacionCampSQL, "No existen relaciones para borrar.", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);
		}
		refrescarTablaRelacion(tableRelacionCampos);
	}

	public void guardarFicheroRelacion(String ruta, String origen) {
		FileWriter fichero = null;
		PrintWriter pw = null;

		JComboBox tablaOrigen;
		JComboBox tablaDestino;

		JRadioButton actualizar;
		JRadioButton insertar;

		JCheckBox vaciarDestino;

		switch (origen) {
		case "SQL":
			tablaOrigen = RelacionCampSQL.getComboBoxOrigen();
			tablaDestino = RelacionCampSQL.getComboBoxDestino();
			actualizar = RelacionCampSQL.getRdbtnActualizar();
			insertar = RelacionCampSQL.getRdbtnInsertar();
			vaciarDestino = RelacionCampSQL.getChckbxVaciarDestino();
			
			relacionCampos.setTablaOrigen(tablaOrigen.getSelectedItem().toString());
			relacionCampos.setTablaDestino(tablaDestino.getSelectedItem().toString());
			
			if (actualizar.isSelected())  {
				relacionCampos.setTipoOperacion("Actualizar");
			} else if (insertar.isSelected()) {
				relacionCampos.setTipoOperacion("Insertar");				
			}
			
			relacionCampos.setVaciarDestino(vaciarDestino.isSelected());
			
			
			break;
		case "DBF":
			break;
		case "Excel":
			break;
		}

		try {
			fichero = new FileWriter(ruta);
			pw = new PrintWriter(fichero);
			
			pw.println("TabOri:"+relacionCampos.getTablaOrigen());
			pw.println("TabDes:"+relacionCampos.getTablaDestino());
			pw.println("TipOpe:"+relacionCampos.getTipoOperacion());
			pw.println("VacDes:"+relacionCampos.isVaciarDestino());
			
			ArrayList<Relacion> rel = relacionCampos.getRelacionColumnas();
			for(int i = 0; i < rel.size(); i++) {
				pw.println(rel.get(i).getCampoOrigen()+"-"+rel.get(i).getCampoDestino());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} finally {
			try {
				if(fichero != null) {
					fichero.close();
				}
			}catch(Exception e2) {
				System.out.println(e2);
			}
		}
	}

	public void leerFichero(String ruta, String tipoOrigenDatos) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		relacionCampos = new RelacionCampos();
		
		JComboBox tablaOrigen;
		JComboBox tablaDestino;

		JRadioButton actualizar;
		JRadioButton insertar;

		JCheckBox vaciarDestino;

		

		try {
			archivo = new File(ruta);
			if (!archivo.exists()) {
				
			}else{
				fr = new FileReader(archivo);
				br = new BufferedReader(fr);
				
				String linea;
				Relacion relacioncolumna;
				ArrayList<String> lineas = new ArrayList<>();
				
				while ((linea = br.readLine())!= null) {
					lineas.add(linea);
				}
				for (int i = 0; i < lineas.size(); i++) {
					String lineaLeida = lineas.get(i);
					
					if (i>=0 && i<3) {
						String id = lineaLeida.substring(0,7);
						String valor = lineaLeida.substring(7, lineaLeida.length());
						switch (id) {
						case "TabOri:":
							if (!valor.equals("")) {
								relacionCampos.setTablaOrigen(valor);
							}
							break;
						case "TabDes:":
							if (!valor.equals("")) {
								relacionCampos.setTablaDestino(valor);
							}
							break;
						case "TipOpe:":
							if (!valor.equals("")) {
								relacionCampos.setTipoOperacion(valor);
							}
							break;
						case "VacDes:":
							if (!valor.equals(valor)) {
								relacionCampos.setVaciarDestino(Boolean.parseBoolean(valor));
							}
							
						}	
					} else {
						String [] partes = lineaLeida.split("-");
						relacioncolumna = new Relacion();
						
						if (!partes[0].equals("")) {
							relacioncolumna.setCampoOrigen(partes[0]);
							relacioncolumna.setCampoOrigenRelleno(true);
							}
						
						if (!partes[1].equals(partes[1])) {
							relacioncolumna.setCampoDestino(partes[1]);
							relacioncolumna.setCampoOrigenRelleno(true);
						}
						relacionCampos.getRelacionColumnas().add(relacioncolumna);
					}
				}
			} 
			
			switch (tipoOrigenDatos) {
			case "SQL":
				tablaOrigen = RelacionCampSQL.getComboBoxOrigen();
				tablaDestino = RelacionCampSQL.getComboBoxDestino();
				actualizar = RelacionCampSQL.getRdbtnActualizar();
				insertar = RelacionCampSQL.getRdbtnInsertar();
				vaciarDestino = RelacionCampSQL.getChckbxVaciarDestino();
				
				tablaOrigen.setSelectedItem(relacionCampos.getTablaOrigen());
				tablaDestino.setSelectedItem(relacionCampos.getTablaDestino());
				
				if (relacionCampos.getTipoOperacion().equals("Actualizar")) {
					actualizar.setSelected(true);
					insertar.setSelected(false);
				}else if (relacionCampos.getTipoOperacion().equals("Insertar")) {
					actualizar.setSelected(false);
					insertar.setSelected(true);
				}
				
				/*relacionCampos.setTablaOrigen(tablaOrigen.getSelectedItem().toString());
				relacionCampos.setTablaDestino(tablaDestino.getSelectedItem().toString());*/
				
				break;
			case "DBF":
				break;
			case "Excel":
				break;
			
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void vistaSQL() {
		relacionCampos = new RelacionCampos();
		RelacionCampSQL = new RelacionCampSQL();
		RelacionCampSQL.setControlador(this);
		RelacionCampSQL.setVisible(true);
	}

	public void vistaDBF() {
		RelacionCampDBF.setVisible(true);
	}

	public void vistaExel() {
		RelacionCampExcel.setVisible(true);
	}

	public String getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}

	public int getDigitosCuentas() {
		return digitosCuentas;
	}

	public void setDigitosCuentas(int digitosCuentas) {
		this.digitosCuentas = digitosCuentas;
	}

	public int getDigitosGrupos() {
		return digitosGrupos;
	}

	public void setDigitosGrupos(int digitosGrupos) {
		this.digitosGrupos = digitosGrupos;
	}

	public String getAlmacenDestino() {
		return almacenDestino;
	}

	public void setAlmacenDestino(String almacenDestino) {
		this.almacenDestino = almacenDestino;
	}

	public String getTipoTablaOrigen() {
		return tipoTablaOrigen;
	}

	public void setTipoTablaOrigen(String tipoTablaOrigen) {
		this.tipoTablaOrigen = tipoTablaOrigen;
	}

}
