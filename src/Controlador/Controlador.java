package Controlador;

import Vista.ConfiguracionConexion;

public class Controlador {

	// VEntanas del sistema
		private ConfiguracionConexion configuracionConexion;
		
		
		// Objetos DAO o CRUD de la base de datos
//		private SancionDAO sancionDAO; 
		
		public Controlador() {
			// Creamos las ventanas de la aplicaci�n
			configuracionConexion = new ConfiguracionConexion();
			
			
			
			// Dando acceso al controlador desde las vistas
			configuracionConexion.setControlador(this);

			
			
			// Creamos los objetos DAO
//			sancionDAO = new SancionDAO();
//			infractoresDAO = new InfractoresDAO();
		}
	
	public void inciarPrograma() {
		configuracionConexion.setVisible(true);
	}
	
	
}
