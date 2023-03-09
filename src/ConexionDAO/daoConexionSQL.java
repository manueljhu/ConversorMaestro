package ConexionDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Controlador.Controlador;

public class daoConexionSQL {
	private Controlador miControlador;

	private String cadenaConexionDestino;
	private String usuarioDestino;
	private String contrasenaDestino;

	private String cadenaConexionOrigen;
	private String usuarioOrigen;
	private String contrasenaOrigen;

	public daoConexionSQL(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public daoConexionSQL() {
		
	}

	public void testConexionDestino() {
		Connection cn = null;
		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			cn = DriverManager.getConnection(cadenaConexionDestino, usuarioDestino, contrasenaDestino);

			JOptionPane.showMessageDialog(null, "Conexión establecida correctamente.", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos destino:\n " + e + ".",
					"Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void testConexionOrigen() {
		Connection cn = null;
		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			cn = DriverManager.getConnection(cadenaConexionOrigen, usuarioOrigen, contrasenaOrigen);

			JOptionPane.showMessageDialog(null, "Conexión establecida correctamente.", "Aviso",
					JOptionPane.INFORMATION_MESSAGE);

		} catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos origen:\n " + e + ".",
					"Aviso", JOptionPane.ERROR_MESSAGE);
		}
	}

	public ArrayList<String> devuelveTablasOrigen() {
		System.out.println(cadenaConexionOrigen);
		Connection cn = null;
		ArrayList<String> tablas = new ArrayList<>();
		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			cn = DriverManager.getConnection(cadenaConexionOrigen, usuarioOrigen, contrasenaOrigen);

		} catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos origen:\n " + e + ".",
					"Aviso", JOptionPane.ERROR_MESSAGE);
		}

		// SELECT
		String sentencia = "SELECT TABLE_NAME AS name FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='BASE TABLE' ORDER BY TABLE_NAME";

		try {

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);

			while (rs.next()) {
				tablas.add(rs.getString("name"));
			}

			rs.close();
			st.close();
			cn.close();
			//// System.out.println("Desconectado");
		} catch (Exception e) {

			System.out.println("Error al recuperar datos " + e);
		}

		return tablas;
	}

	public ArrayList<String> devuelveVistasOrigen() {
		Connection cn = null;
		ArrayList<String> vistas = new ArrayList<>();
		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			cn = DriverManager.getConnection(cadenaConexionOrigen, usuarioOrigen, contrasenaOrigen);

		} catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos origen:\n " + e + ".",
					"Aviso", JOptionPane.ERROR_MESSAGE);
		}

		// SELECT
		String sentencia = "SELECT TABLE_NAME AS name FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_TYPE='VIEW' ORDER BY TABLE_NAME";

		try {

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);

			while (rs.next()) {
				vistas.add(rs.getString("name"));
			}

			rs.close();
			st.close();
			cn.close();
			//// System.out.println("Desconectado");
		} catch (Exception e) {

			System.out.println("Error al recuperar datos " + e);
		}

		return vistas;
	}

	public ArrayList<String> devuelveColumnasTabla(String nombreTabla, String oriOrDes) {
		Connection cn = null;
		ArrayList<String> columnas = new ArrayList<>();
		String sentencia = "SELECT COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME='" + nombreTabla + "'";
		try {

			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			if (oriOrDes.equals("Origen")) {
				cn = DriverManager.getConnection(cadenaConexionOrigen, usuarioOrigen, contrasenaOrigen);

			}else if (oriOrDes.equals("Destino")) {
				cn = DriverManager.getConnection(cadenaConexionDestino, usuarioDestino, contrasenaDestino);

			}

		} catch (Exception e) {
			// System.out.println(e);
			// e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error al intentar conectar con la base de datos origen:\n " + e + ".",
					"Aviso", JOptionPane.ERROR_MESSAGE);
		}
		try {

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(sentencia);

			while (rs.next()) {
				columnas.add(rs.getString("COLUMN_NAME"));
			}

			rs.close();
			st.close();
			cn.close();
			//// System.out.println("Desconectado");
		} catch (Exception e) {

			System.out.println("Error al recuperar datos " + e);
		}
		
		
		
		return columnas;
	}

	public String getCadenaConexionDestino() {
		return cadenaConexionDestino;
	}

	public void setCadenaConexionDestino(String cadenaConexionDestino) {
		this.cadenaConexionDestino = cadenaConexionDestino;
	}

	public String getUsuarioDestino() {
		return usuarioDestino;
	}

	public void setUsuarioDestino(String usuarioDestino) {
		this.usuarioDestino = usuarioDestino;
	}

	public String getContrasenaDestino() {
		return contrasenaDestino;
	}

	public void setContrasenaDestino(String contrasenaDestino) {
		this.contrasenaDestino = contrasenaDestino;
	}

	public String getCadenaConexionOrigen() {
		return cadenaConexionOrigen;
	}

	public void setCadenaConexionOrigen(String cadenaConexionOrigen) {
		this.cadenaConexionOrigen = cadenaConexionOrigen;
	}

	public String getUsuarioOrigen() {
		return usuarioOrigen;
	}

	public void setUsuarioOrigen(String usuarioOrigen) {
		this.usuarioOrigen = usuarioOrigen;
	}

	public String getContrasenaOrigen() {
		return contrasenaOrigen;
	}

	public void setContrasenaOrigen(String contrasenaOrigen) {
		this.contrasenaOrigen = contrasenaOrigen;
	}

}
