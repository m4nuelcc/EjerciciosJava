package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conexion {
	
	Connection miConexion = null;
	
	public Conexion() {
		
		
	}
	
	public Connection daneConexion() {
		
		try {
			
		miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
				"root");
		
		System.out.println("Conexion Correcta");
		
		}catch(Exception e) {
			
			
		}
		return miConexion;
		
		
	}

	

	
}
