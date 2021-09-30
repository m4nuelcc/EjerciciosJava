package V218_Proc_Almecenado;

import java.sql.*;



public class ConsultaClientes {

	public static void main(String[] args) {
		
		

		try {
			
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
					"root");
			
			CallableStatement miSentencia = miConexion.prepareCall("{call MUESTRA_CLIENTES}");
			
			ResultSet resultado = miSentencia.executeQuery();
			
			while (resultado.next()) {
				
				System.out.println(resultado.getString(1) + " " + resultado.getString(2) + " " + resultado.getString(3) );
				
			}
			
			resultado.close();
			
			System.out.println("Conexion Correcta");
			
			}catch(Exception e) {
				
				
			}
		

	}

}
