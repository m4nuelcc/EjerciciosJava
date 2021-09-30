package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.EjecutaConsultas;
import vista.MarcoAplicacion;

public class ControladorBotonEjecutar implements ActionListener {

	public ControladorBotonEjecutar(MarcoAplicacion marco) {

		this.marco = marco;

	}

	public void actionPerformed(ActionEvent e) {

		marco.resultado.setText("");

		String seleccionpais = (String) marco.paises.getSelectedItem();

		String seleccionseccion = (String) marco.secciones.getSelectedItem();

		resultadoConsulta = consultas.filtraBBDD(seleccionseccion, seleccionpais);

		try {
			while (resultadoConsulta.next()) {

				marco.resultado.append(resultadoConsulta.getString(4) + ",  " + resultadoConsulta.getString(1) + ", "
						+ resultadoConsulta.getString(2) + ", " + resultadoConsulta.getString(3));

				marco.resultado.append("\n");

			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	private MarcoAplicacion marco;

	EjecutaConsultas consultas = new EjecutaConsultas();

	private ResultSet resultadoConsulta;

}
