package V222_METADATOS_I;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conexion;

public class V222_Info_Metadatos_DDBB {

	public V222_Info_Metadatos_DDBB() {

		conecta = new Conexion();

		miConexion = conecta.daneConexion();
	}

	public void mostrarMetadatos() {

		try {

			// Connection miConexion =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false",
			// "root", "root");

			DatabaseMetaData datos = miConexion.getMetaData();

			System.out.println("INFORMACION DE LA BBDD");
			System.out.println("Driver: " + datos.getDriverName());
			System.out.println("version Driver: " + datos.getDriverVersion());
			System.out.println("usuario: " + datos.getUserName());
			System.out.println("url: " + datos.getURL());
			System.out.println("Gestor BBDD : " + datos.getDatabaseProductName());
			System.out.println("version del gestor : " + datos.getDatabaseProductVersion());

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void motrarTablasBBDD() {

		try {

			DatabaseMetaData datos = miConexion.getMetaData();

			rs = datos.getTables(null, null, null, null);

			//https://docs.oracle.com/javase/7/docs/api/java/sql/DatabaseMetaData.html#getTables(java.lang.String,%20java.lang.String,%20java.lang.String,%20java.lang.String[])
			// TIPO CONSULTAS TABLAS
			System.out.println("TABLAS");
			System.out.println("*************************************");

			while (rs.next()) {

				System.out.println(rs.getString("TABLE_NAME"));

			}

			//https://docs.oracle.com/javase/7/docs/api/java/sql/DatabaseMetaData.html#getColumns(java.lang.String,%20java.lang.String,%20java.lang.String,%20java.lang.String)
			// TIPOS DE CONSULTAS COLUMNAS
			System.out.println("COLUMNAS");
			System.out.println("*************************************");
			
			//consulta solo tabla clientes
			rs = datos.getColumns(null, null, "clientes", null);
			
			//consulta todas las tablas
			//rs = datos.getColumns(null, null, null, null);

			while (rs.next()) {

				System.out.println(rs.getString("TABLE_NAME")+ "  " + rs.getString("COLUMN_NAME"));
				

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public class Conexion {

		Connection miConexion = null;

		public Conexion() {

		}

		public Connection daneConexion() {

			try {

				miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
						"root");

				System.out.println("Conexion Correcta");

			} catch (Exception e) {

			}
			return miConexion;

		}

	}

	private Conexion conecta;
	private Connection miConexion;
	private ResultSet rs;
}
