package modelo;

import java.sql.*;

import controlador.*;

public class CargaMenus {

	public CargaMenus() {

		// INSTANCIAMOS LA CONEXION A LA BBDD

		miConexion = new Conexion();

	}

//METODO QUE LEE EL CAMPO SECCIONES DE LA BBDD Y LO GUARDA EN LA PROPIEDAD
//SECCION DEL LA CLASE PRODUCTOS

	public String ejecutaConsultas() {

		Productos miProducto = null;

		Connection accesoBBDD = miConexion.daneConexion();

		try {

			Statement secciones = accesoBBDD.createStatement();
			
			Statement paises = accesoBBDD.createStatement();

			rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM Productos");
			
			rs2 = paises.executeQuery("SELECT DISTINCTROW PAISDEORIGEN FROM Productos");

			// rs.previous();

			miProducto = new Productos();

			miProducto.setSeccion(rs.getString(1));
			
			miProducto.setPaisDeOrigen(rs2.getString(1));

			rs.close();
			
			rs2.close();

		} catch (Exception e) {

		}

		return miProducto.getSeccion();

	}

	// private ResultSet rs;
	
	public Conexion miConexion;

	public ResultSet rs;
	
	public ResultSet rs2;


}

//
//	public ResultSet ejecutaConsultas() {
//
//		Connection accesoBBDD = miConexion.daneConexion();
//
//		Statement secciones;
//		try {
//
//			secciones = accesoBBDD.createStatement();
//			
//			rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM Productos");
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return rs;
//
//	}