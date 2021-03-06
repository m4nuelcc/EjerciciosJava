package V224_Ejercicio_Practico_Metadatos;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;

import com.mysql.fabric.xmlrpc.base.Array;

public class AplicacionUniversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBBDD mimarco = new MarcoBBDD();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class MarcoBBDD extends JFrame {

	public MarcoBBDD() {

		setBounds(300, 300, 700, 700);

		LaminaBBDD milamina = new LaminaBBDD();

		add(milamina);

	}

}

class LaminaBBDD extends JPanel {

	public LaminaBBDD() {

		setLayout(new BorderLayout());

		comboTablas = new JComboBox();

		areaInformacion = new JTextArea();

		add(areaInformacion, BorderLayout.CENTER);

		add(comboTablas, BorderLayout.NORTH);


		conexionBBDD();

		comboTablas();

		comboTablas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nombreTabla = (String) comboTablas.getSelectedItem();

				mostrarInfoTabla(nombreTabla);

			}

		});

	}

	// -------------------------METODOS-------------------------

	public void mostrarInfoTabla(String nombreTabla) {

		ArrayList<String> campos = new ArrayList<String>();

		String consulta = "SELECT * FROM " + nombreTabla;

		// limpiamos el textarea

		areaInformacion.setText("");

		Statement sentencia;
		try {

			sentencia = miConexion.createStatement();

			ResultSet rs = sentencia.executeQuery(consulta);

			ResultSetMetaData rsBBDD = rs.getMetaData();

			// guardamos el nombre de los campos en el arraylist
			for (int i = 1; i < rsBBDD.getColumnCount(); i++) {

				campos.add(rsBBDD.getColumnLabel(i));

				// System.out.println(rs.getString(0));
			}

			// imprimimos en el text area los datos de la BBDD
			while (rs.next()) {

				for (String nombreCampo : campos) {

					areaInformacion.append(rs.getString(nombreCampo) + ", ");
				}

				areaInformacion.append("\n");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	

	public void conexionBBDD() {

		miConexion = null;
		
		String[] datoslectura = new String[3];

		try {
			
			FileReader leerDatosBBDD = new FileReader("22_METADATOS/V225_Ejercicio_Practico_Metadatos_II/DatosBBDD.txt");
			
			BufferedReader datosBBDD = new BufferedReader(leerDatosBBDD);
			
			for (int i=0; i<datoslectura.length; i++) {
				
				datoslectura[i]= datosBBDD.readLine();
			}
			
			
			miConexion = DriverManager.getConnection(datoslectura[0], datoslectura[1], datoslectura[2]);

//			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pruebas?useSSL=false", "root",
//					"root");

		} catch (SQLException | IOException e) {
			
			JOptionPane.showMessageDialog(null, "No se controntro fichero de configuracion BBDD");

			e.printStackTrace();
		}

	}

	public void comboTablas() {

		try {

			DatabaseMetaData datosBBDD = miConexion.getMetaData();

			// cargamos todas las tablas de la BBDD

			ResultSet rs = datosBBDD.getTables(null, null, null, null);

			while (rs.next()) {

				comboTablas.addItem(rs.getString("TABLE_NAME"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	private Connection miConexion;

	private JComboBox comboTablas;

	private JTextArea areaInformacion;

}
