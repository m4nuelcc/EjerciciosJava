package V220_TRANSACIONES_BBDD;

import java.sql.*;

import javax.swing.JOptionPane;

public class V221_CON_TRANSACIONES_BBDD3 {

	public static void main(String[] args) {

		Connection miConexion = null;

		try {

			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
					"root");

			// inicio transacion en bloque

			miConexion.setAutoCommit(false);

			// miConexion.commit();

			// ----------------------------------

			Statement miStatement = miConexion.createStatement();

			String instruccionSql_1 = "DELETE FROM Productos WHERE PAISDEORIGEN='ITALIA'";

			String instruccionSql_2 = "DELETE FROM Productos WHERE PRECIO>300";

			String instruccionSql_3 = "UPDATE Productos SET PRECIO=PRECIO*1.15";

			boolean ejecutar = ejecutarTransacion();

			if (ejecutar) {

				miStatement.executeUpdate(instruccionSql_1);

				miStatement.executeUpdate(instruccionSql_2);

				miStatement.executeUpdate(instruccionSql_3);

				miConexion.commit();

				System.out.println("Transacion realizada correctamente");

			} else {

				System.out.println("No se realizo ningun cambio");
			}

		} catch (Exception e) {

			System.out.println("ERROR EN LA INSERCION DE DATOS!!");

			try {

				miConexion.rollback();

				System.out.println("alg salio mal");

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

	}

	private static boolean ejecutarTransacion() {

//		String resultado2 = JOptionPane.showConfirmDialog(null, "Desea hacer la transacion");
//		if (resultado2.equals("SI")) return true;
//		else return false;
		
		int resultado = JOptionPane.showConfirmDialog(null, "Desea hacer la transacion");

		if (resultado == 0) {

			return true;
		} else {

			return false;
		}

	}

}
