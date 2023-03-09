package Test;

import java.util.ArrayList;
import java.util.Iterator;

import ConexionDAO.daoConexionSQL;

public class test {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		//DECLARACION DE VARIABLES NECESARIAS PARA LA CONEXION E INICIALIZACION DE LA CLASE daoConexionSQL
		daoConexionSQL conexion = new daoConexionSQL();
		
		String servidorOrigen = "TECNICO-PC%SQLEXPRESS";
		String [] partesConexionOrigen = servidorOrigen.split("%");
		
		String ipServidorOrigen = partesConexionOrigen[0];
		String instanciaOrigen = partesConexionOrigen[1];
		String usuarioOrigen = "sa";
		String claveOrigen = "ew#211218";
		String nombreBD = "2022LD";
		
		String servidor = "TECNICO-PC%GPBUSINESS";
		String [] partesConexion = servidor.split("%");
		
		String ipServidorDestino = partesConexion[0];
		String instanciaDestino = partesConexion[1];
		String usuarioDestino = "sa";
		String claveDestino = "Fsgpsql00";
		String empresa = "01";
		
		String cadenaConexionDestino = "jdbc:jtds:sqlserver://" + ipServidorDestino + ";instance=" + instanciaDestino + ";DatabaseName=GpBusiness" + empresa;

		
		String cadenaConexionOrigen = "jdbc:jtds:sqlserver://" + ipServidorOrigen + ";instance=" + instanciaOrigen + ";DatabaseName=[" + nombreBD+"]";
		
		
		conexion.setCadenaConexionDestino(cadenaConexionDestino);
		conexion.setCadenaConexionOrigen(cadenaConexionOrigen);
		
		conexion.setUsuarioDestino(usuarioDestino);
		conexion.setUsuarioOrigen(usuarioOrigen);
		
		conexion.setContrasenaDestino(claveDestino);
		conexion.setContrasenaOrigen(claveOrigen);
		
		
		//DEFINICION DE PRUEBAS DE USO DE LAS FUNCIONES
		String oriOrdes = "Origen";
		String nombreTabla = "clientes";
		
		ArrayList<String> columnas = conexion.devuelveColumnasTabla(nombreTabla, oriOrdes);
		
		for (int i = 0; i < columnas.size(); i++) {
			System.out.println(columnas.get(i));
		}

	}

}
