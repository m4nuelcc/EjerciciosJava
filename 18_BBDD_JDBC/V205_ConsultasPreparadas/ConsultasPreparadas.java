//+----------------+------+------+-----+---------+-------+
//| Field          | Type | Null | Key | Default | Extra |
//+----------------+------+------+-----+---------+-------+
//| CODIGOARTICULO | text | YES  |     | NULL    |       |
//| SECCION        | text | YES  |     | NULL    |       |
//| NOMBREARTICULO | text | YES  |     | NULL    |       |
//| PRECIO         | text | YES  |     | NULL    |       |
//| FECHA          | text | YES  |     | NULL    |       |
//| IMPORTADO      | text | YES  |     | NULL    |       |
//| PAISDEORIGEN   | text | YES  |     | NULL    |       |
//| FOTO           | text | YES  |     | NULL    |       |
//+----------------+------+------+-----+---------+-------+

package V205_ConsultasPreparadas;

import java.sql.*;

public class ConsultasPreparadas {

	public static void main(String[] args) {

		try {

			// 1. CREAR LA CONEXION

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false",
					"root", "root");

			// 2. PREPARAR LA CONSULTA

			PreparedStatement miSentencia = miConexion.prepareStatement(
					"SELECT NOMBREARTICULO, SECCION, PAISDEORIGEN FROM Productos WHERE SECCION=? AND PAISDEORIGEN=?");

			// 3. ESTABLECER PARAMETROS DE CONSULTA

			miSentencia.setString(1, "deportes");

			miSentencia.setString(2, "ESPAÑA");

			// 4 EJECUTAR Y RECORRER CONSULTA

			ResultSet rs = miSentencia.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString(3) + " " + rs.getString(2) + " " + rs.getString(1) 	);

			}
			
			rs.close();
			
			//REUTILIZACION CONSULTA SQL
			
			System.out.println("\n SEGUNDA CONSULTA");
			
			miSentencia.setString(1, "CERAMICA");

			miSentencia.setString(2, "CHINA");

			// 4 EJECUTAR Y RECORRER CONSULTA

			rs = miSentencia.executeQuery();

			while (rs.next()) {

				System.out.println(rs.getString(3) + " " + rs.getString(2) + " " + rs.getString(1) 	);

			}
			
			rs.close();
			
			

		} catch (Exception e) {

			System.out.println("Error de conexion");

			e.printStackTrace();

		}

	}

}
