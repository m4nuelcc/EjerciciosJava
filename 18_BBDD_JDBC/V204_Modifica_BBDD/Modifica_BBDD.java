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

package V204_Modifica_BBDD;

import java.sql.*;

public class Modifica_BBDD {

	public static void main(String[] args) {

		try {

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false",
					"root", "root");

			Statement miStatement = miConexion.createStatement();

			// ---------INSERTAR UN NUEVO REGISTRO------------------------------

			String insertSql = "INSERT INTO Productos (CODIGOARTICULO, NOMBREARTICULO, PRECIO) VALUES ('AR42', 'botijo', 55)";

			miStatement.executeUpdate(insertSql);

			System.out.println("Datos insertados Correctamente");

			// -----------ACTUALIZAR UN REGISTRO-------------------------------
			
			String UpdateSql = "UPDATE Productos SET PRECIO=PRECIO*2 WHERE CODIGOARTICULO='AR42'";

			miStatement.executeUpdate(UpdateSql);

			System.out.println("Datos actualizado Correctamente");
			
			//---------------BORRAR UN REGISTRO---------------------------------
			
			String deleteSql = "DELETE FROM Productos WHERE CODIGOARTICULO='AR42'";

			miStatement.executeUpdate(deleteSql);

			System.out.println("Datos borrados Correctamente");
			
			
		} catch (Exception e) {

			System.out.println("Error de conexion");

			e.printStackTrace();

		}

	}

}
