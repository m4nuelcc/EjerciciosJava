package V220_TRANSACIONES_BBDD;

import java.sql.*;

public class V220_CON_TRANSACIONES_BBDD2 {

	public static void main(String[] args) {
		
		Connection miConexion=null;
	
		try{					
			
			miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root", "root");	
			
			// inicio transacion en bloque
			
			miConexion.setAutoCommit(false);
			
			miConexion.commit();
			
			//----------------------------------
					
			Statement miStatement =miConexion.createStatement();
			
		    String instruccionSql_1="INSERT INTO clientes (CODIGOCLIENTE, EMPRESA, DIRECCION) VALUES ('CT84', 'EJEMPLO', 'P BOTANICO')";
			    
		    miStatement.executeUpdate(instruccionSql_1);
			    
		    String instruccionSql_2="INSERT INTO pedidos (NUMERODEPEDIDO, CODIGOCLIENTE,FECHADEPEDIDO) VALUES('82', 'CT84', '11/03/2000')";
			    
		    miStatement.executeUpdate(instruccionSql_2);
		    				    
		    System.out.println("Datos INSERTADOS correctamente");
				
		}catch(Exception e){
			
				
			System.out.println("ERROR EN LA INSERCION DE DATOS!!");
				
			try {
				
				//si da error vuelve a punto partida y no graba nada
				
				miConexion.rollback();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			e.printStackTrace();	
				
				
			}

		}

	}

