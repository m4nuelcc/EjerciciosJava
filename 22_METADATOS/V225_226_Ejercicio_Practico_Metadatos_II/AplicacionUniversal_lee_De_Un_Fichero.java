package V225_226_Ejercicio_Practico_Metadatos_II;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AplicacionUniversal_lee_De_Un_Fichero {

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

		FileReader lecturaDDBB = null;

		BufferedReader bufferBBDD = null;

		String[] datosconexion = new String[3];

		try {

			lecturaDDBB = new FileReader("222_METADATOS/V227_Ejercicio_Practico_Metadatos_III/DatosBBDD.txt");
			
			
			//si no encuentra el fichero abrimos un filechoose, elejimos un fichero
			// y asi obtenemos la ruta absouluta y lo leemos con filereader()
		} catch (IOException e) {

			JFileChooser chooser = new JFileChooser();

			FileNameExtensionFilter filter = new FileNameExtensionFilter("Documentos txt", "txt");

			chooser.setFileFilter(filter);

			int returnVal = chooser.showOpenDialog(this);

			if (returnVal == JFileChooser.APPROVE_OPTION) {

				try {
					lecturaDDBB = new FileReader(chooser.getSelectedFile().getAbsolutePath());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		}

		try {
			bufferBBDD = new BufferedReader(lecturaDDBB);

			for (int i = 0; i < datosconexion.length; i++) {

				datosconexion[i] = bufferBBDD.readLine();
			}

			miConexion = DriverManager.getConnection(datosconexion[0], datosconexion[1], datosconexion[2]);

			lecturaDDBB.close();

		} catch (Exception e) {

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
