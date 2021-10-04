package V220_TRANSACIONES_BBDD;

import java.sql.*;

public class V220_SIN_TRANSACIONES_BBDD {

	public static void main(String[] args) {
	
		try{					
			
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root", "root");				
			
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="INSERT INTO clientes (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'PAATATAAAS')";
			    
		    miStatement.executeUpdate(instruccionSql_1);
			    
		    String instruccionSql_2="INSERT INTO pedidos (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";
			    
		    miStatement.executeUpdate(instruccionSql_2);
		    				    
		    System.out.println("Datos INSERTADOS correctamente");
				
		}catch(Exception e){
				
			System.out.println("ERROR EN LA INSERCION DE DATOS!!");
				
			
			e.printStackTrace();	
				
				
			}

		}

	}

