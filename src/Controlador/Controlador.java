package Controlador;

import Vista.ConfiguracionConexion;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import ConexionDAO.*;

public class Controlador {

	private daoConexionSQL conexion;

	private String CadenaConexionDestino = "";

	// VEntanas del sistema
	private ConfiguracionConexion configuracionConexion;

	// Objetos DAO o CRUD de la base de datos
//		private SancionDAO sancionDAO; 

	public Controlador() {
		// Creamos las ventanas de la aplicaci�n
		configuracionConexion = new ConfiguracionConexion();
		conexion = new daoConexionSQL(this);

		configuracionConexion.setMiControlador(this);

		// Creamos los objetos DAO
//			sancionDAO = new SancionDAO();
//			infractoresDAO = new InfractoresDAO();
	}

	public void inciarPrograma() {
		configuracionConexion.setVisible(true);
	}

	public void setConexionDestino(String cadenaConexion, String usuario, String contrasena) {
		conexion.setCadenaConexionDestino(cadenaConexion);
		conexion.setUsuarioDestino(usuario);
		conexion.setContrasenaDestino(contrasena);
		conexion.testConexionDestino();
	}

	public void setConexionOrigen(String cadenaConexion, String usuario, String contrasena) {
		conexion.setCadenaConexionOrigen(cadenaConexion);
		conexion.setUsuarioOrigen(usuario);
		conexion.setContrasenaOrigen(contrasena);
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

}
