package Controlador;

import java.util.ArrayList;
import java.util.Iterator;

import javax.management.modelmbean.ModelMBean;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import ConexionDAO.*;
import Modelo.OpcionTablaDestino;
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
		RelacionCampSQL = new RelacionCampSQL();
		RelacionCampDBF = new RelacionCampDBF();
		RelacionCampExcel = new RelacionCampExcel();
		ResumenTraspaso = new ResumenTraspaso();
		conexion = new daoConexionSQL(this);

		configuracionConexion.controlador(this);
		RelacionCampSQL.setControlador(this);
		RelacionCampDBF.setControlador(this);
		RelacionCampExcel.setControlador(this);

		// Creamos los objetos DAO
//			sancionDAO = new SancionDAO();
//			infractoresDAO = new InfractoresDAO();
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
		JTable tableColumOrigen;
		JTable tableColumDestino;
		JTable tableRelacionCampos;
		
		DefaultTableModel cabeceraRelacion;
		
		String columnaOrigen = "";
        String columnaDestino = "";
        
        int ultimaFilaRelacion;
		
		switch(origenDatos) {
		case "SQL":
			tableColumOrigen =  RelacionCampSQL.getTableColumOrigen();
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
			cabeceraRelacion= null;
			ultimaFilaRelacion = 0;
			break;
		}
		
		
		switch(tipo) {
		/**Cuando pulsamos el boton para mover de la tableColumOrigen hacia la tableRelacionCampos*/
		case 1:
			
			
			break;
		/**Cuando pulsamos el boton para mover de la tableColumDestino hacia la tableRelacionCampos*/
		case 2:
			break;
		}
		
		
		
		
	}

	public void vistaSQL() {
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
