package modelo;

import java.sql.*;


public class EjecutaConsultas {

	public EjecutaConsultas() {

		miConexion = new Conexion();

	}

	public ResultSet filtraBBDD(String secciones, String pais) {

		Connection conecta = miConexion.daneConexion();

		rs = null;

		try {

			if (!secciones.equals("Todos") && pais.equals("Todos")) {

				enviaConsultaSeccion = conecta.prepareStatement(consultaSeccion);

				enviaConsultaSeccion.setString(1, secciones);
				
				rs= enviaConsultaSeccion.executeQuery();

			} else if (!pais.equals("Todos") && secciones.equals("Todos")) {
				
				enviaConsultaPais = conecta.prepareStatement(consultaPais);

				enviaConsultaPais.setString(1, pais);
				
				rs= enviaConsultaPais.executeQuery();

			} else {
				
				enviaConsultaPaisSeccion = conecta.prepareStatement(consultaTodos);

				enviaConsultaPaisSeccion.setString(1, secciones);
				
				enviaConsultaPaisSeccion.setString(2, pais);
								
				rs= enviaConsultaPaisSeccion.executeQuery();

			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		
		
		 return rs;

	}



	private Conexion miConexion;

	private PreparedStatement enviaConsultaSeccion, enviaConsultaPais, enviaConsultaPaisSeccion;

	private ResultSet rs;

	private final String consultaSeccion = "SELECT  NOMBREARTICULO, SECCION, PRECIO,PAISDEORIGEN FROM Productos WHERE SECCION=?";
	
	private final String consultaPais = "SELECT  NOMBREARTICULO, SECCION, PRECIO,PAISDEORIGEN FROM Productos WHERE PAISDEORIGEN=?";
	
	private final String consultaTodos = "SELECT  NOMBREARTICULO, SECCION, PRECIO,PAISDEORIGEN FROM Productos WHERE SECCION=? AND PAISDEORIGEN=?";
	
	

}
