package V219_Actualiza_Productos_Proc_Almacenado;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Actualiza_Productos_Proc_Almacenado {

	public static void main(String[] args) {

		int nPrecio = Integer.parseInt(JOptionPane.showInputDialog("introduce precio: "));

		String NArticulo = JOptionPane.showInputDialog("Introduce nombre articulo:");

		try {

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false",
					"root", "root");

			CallableStatement miSentencia = miConexion.prepareCall("{call ActualizaPrecio(?,?)}");
			
			
			miSentencia.setDouble(1, nPrecio);
			
			miSentencia.setString(2, NArticulo);
						
			miSentencia.execute();
			
			System.out.println("actualizacion ok");


			System.out.println("Conexion Correcta");

		} catch (Exception e) {

		}

	}

}
