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

package V202_BBDD_JDBC;

import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {

		try {

			// 1. CREAR CONEXION  ?useSSL=false PARA DECIRLE QUE NO TIENE SSL

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root", "root");

			// 2. CREAR OBJETO STATEMENT

			Statement miStatement = miConexion.createStatement();

			// 3 EJECUTAR SQL en ResulSet tenemos la consulta

			//ResultSet miRresulset = miStatement.executeQuery("SELECT * FROM PRODUCTOS");
			ResultSet miRresulset = miStatement.executeQuery("SELECT * FROM Productos");

			// 4 LEER EL RESULTSET

			while (miRresulset.next()) {

				System.out.println(miRresulset.getString("NOMBREARTICULO") + " "
						+ miRresulset.getString("CODIGOARTICULO") + " " + miRresulset.getDouble("PRECIO")+ " " + miRresulset.getDate("FECHA"));
			}

		} catch (Exception e) {

			System.out.println("Error de conexion");

			e.printStackTrace();

		}

	}

}
