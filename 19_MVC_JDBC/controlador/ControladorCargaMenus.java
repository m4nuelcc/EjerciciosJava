package controlador;

import java.awt.event.*;
import java.sql.SQLException;

import modelo.CargaMenus;
import vista.MarcoAplicacion;

public class ControladorCargaMenus extends WindowAdapter {

	public ControladorCargaMenus(MarcoAplicacion elMarco) {

		this.elMarco = elMarco;

	}

	// CUANDO SE ABRE LA VENTANA PRINCIPAL EJECUTA CONSULTAS PARA PONER LOS DATOS
	// DE SECICONES DE LA BBDD, EN EL COMBOBOX DE SECCIONES

	public void windowOpened(WindowEvent e) {

		obj.ejecutaConsultas();

		try {

			while (obj.rs.next()) {

				elMarco.secciones.addItem(obj.rs.getString(1));

			}

			while (obj.rs2.next()) {

				elMarco.paises.addItem(obj.rs2.getString(1));

			}

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

	}

	CargaMenus obj = new CargaMenus();

	private MarcoAplicacion elMarco;

	// private MarcoAplicacion marco2 = new MarcoAplicacion();
}
