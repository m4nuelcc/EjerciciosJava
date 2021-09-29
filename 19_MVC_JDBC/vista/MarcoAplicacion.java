package vista;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.*;

import controlador.ControladorBotonEjecutar;
import controlador.ControladorCargaMenus;
import modelo.CargaMenus;

public class MarcoAplicacion extends JFrame{
	
	public MarcoAplicacion() {

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
		
		CargaMenus misecciones = new CargaMenus();
		
		misecciones.ejecutaConsultas();
		
		menus.add(secciones);
		
		menus.add(paises);

//		menus.add(rellenabox("SECCION", secciones));
//
//		menus.add(rellenabox("PAISDEORIGEN", paises));

		// POSICIONES DE LOS COMPONENTES

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");
		
		add(botonConsulta, BorderLayout.SOUTH);
		
		//BOTON EN ESCUCHA
		botonConsulta.addActionListener(new ControladorBotonEjecutar(this));
		
		
		//VENTANA EN ESCUCHA 
		addWindowListener(new ControladorCargaMenus(this));
	}
	
	public JComboBox secciones;

	public JComboBox paises;
	
	public JTextArea resultado;
}

