package conectaBD;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.text.Document;

public class V210_AplicacionConsulta {

	public static void main(String[] args) {

		JFrame mimarco = new Marco_Aplicacion();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class Marco_Aplicacion extends JFrame {

	public Marco_Aplicacion() {

		setTitle("Consulta BBDD");

		setBounds(500, 300, 400, 400);

		setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		secciones = new JComboBox();

		secciones.setEditable(false);

		secciones.addItem("Todos");

		paises = new JComboBox();

		paises.setEditable(false);

		paises.addItem("Todos");

		resultado = new JTextArea(4, 50);

		resultado.setEditable(false);

		add(resultado);

		menus.add(rellenabox("SECCION", secciones));

		menus.add(rellenabox("PAISDEORIGEN", paises));

		// POSICIONES DE LOS COMPONENTES

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");

		// BOTON EN ESCUCHA DE LOS COMBOBOX

		botonConsulta.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ejecutaconsulta();

			}
		});

		add(botonConsulta, BorderLayout.SOUTH);

	}

	// MEDTODO PARA HACER LAS CONSULTAS DE LO SELECCIONADO EN LOS COMBOBOX

	private void ejecutaconsulta() {

		ResultSet rs = null;

		try {

			resultado.setText(""); // borrar textarea

			String seccion = (String) secciones.getSelectedItem();

			String pais = (String) paises.getSelectedItem();
			

			if ((!seccion.equals("Todos") && (pais.equals("Todos")))) {

				enviaconsultaSeccion = miConexion.prepareStatement(consultaSeccion);

				enviaconsultaSeccion.setString(1, seccion);

				rs = enviaconsultaSeccion.executeQuery();

			} else if ((!pais.equals("Todos") && (seccion.equals("Todos")))) {

				enviaconsultaPaise = miConexion.prepareStatement(consultaPais);

				enviaconsultaPaise.setString(1, pais);

				rs = enviaconsultaPaise.executeQuery();

			} else if ((!pais.equals("Todos") && (!seccion.equals("Todos")))) {

				enviaconsultaTodos = miConexion.prepareStatement(consultaTodos);

				enviaconsultaTodos.setString(1, seccion);

				enviaconsultaTodos.setString(2, pais);

				rs = enviaconsultaTodos.executeQuery();

			};			;

			

			while (rs.next()) {

				resultado.append(rs.getString(1) + ",  " + rs.getString(2) + ",  " + rs.getString(3) + ", "
						
						+ rs.getString(4) + "\n");

			}

		} catch (Exception e) {

		}

	}

	// METODO PARA DAR LOS VALORES AL COMBOBOX

	private JComboBox rellenabox(String campo, JComboBox combo) {

		try {

			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
					"root");

			Statement sentencia = miConexion.createStatement();

			String consulta = "SELECT DISTINCT " + campo + " FROM Productos";

			System.out.println(consulta);

			rs = sentencia.executeQuery(consulta);

			while (rs.next()) {

				combo.addItem(rs.getString(1));
			}

			rs.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return combo;

	}

	private Connection miConexion;

	private JComboBox secciones;

	private JComboBox paises;

	private JTextArea resultado;

	private ResultSet rs;

	private PreparedStatement enviaconsultaSeccion;
	
	private PreparedStatement enviaconsultaPaise;
	
	private PreparedStatement enviaconsultaTodos;

	private final String consultaSeccion = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM Productos WHERE SECCION =?";
	
	private final String consultaPais = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM Productos WHERE PAISDEORIGEN =?";

	private final String consultaTodos = "SELECT NOMBREARTICULO, SECCION, PRECIO, PAISDEORIGEN FROM Productos WHERE SECCION =? AND PAISDEORIGEN=?";

}

//--------------------------------------------hay que hacer el ejercicio-------------------------------------------