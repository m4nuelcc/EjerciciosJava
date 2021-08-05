package Pantalla_Grid;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import V123_Ejercicio_Practico_I.V123_Lamina_Botones;

public class Marco extends JFrame {

	public Marco() {

		setTitle("Pantalla Principal");
		
		setBounds(600, 300, 600, 450);

		JPanel laminaGrid = new JPanel(new GridLayout(3, 2));
		
		

		// creacion de las laminas con los radioButton y bordes

		String[] tipo = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_tipo = new Lamina_Botones("tipo", tipo);

		String tipo_mensaje[] = { "ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE",
				"PLAIN_MESSAGE" };
	

		lamina_Tipo_Mensaje = new Lamina_Botones("tipo mensaje", tipo_mensaje);

		String mensaje[] = { "Cadena", "Icono", "Componente", "Otros", "Object[]" };
		

		lamina_mensaje = new Lamina_Botones("Mensaje", mensaje);

		String confirnar[] = { "DEFAULT_OPTION", "YES_NO_OPCION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" };

		lamina_confirmar = new Lamina_Botones("Confirmar", confirnar);

		String opcion[] = { "String[]", "Icon[]", "Object[]" };

		lamina_opcion = new Lamina_Botones("Opcion", opcion);

		String entrada[] = { "Campo de texto", "Combo" };

		lamina_entrada = new Lamina_Botones("Entrada", entrada);
		

		laminaGrid.add(lamina_tipo);

		laminaGrid.add(lamina_Tipo_Mensaje);

		laminaGrid.add(lamina_mensaje);

		laminaGrid.add(lamina_confirmar);

		laminaGrid.add(lamina_opcion);

		laminaGrid.add(lamina_entrada);

		JPanel laminaBoton = new JPanel();

		JButton botonMostrar = new JButton("Mostrar");

		botonMostrar.addActionListener(new EscuchaBotonMostrar());

		laminaBoton.add(botonMostrar, BorderLayout.CENTER);

		add(laminaGrid, BorderLayout.CENTER);

		add(laminaBoton, BorderLayout.SOUTH);

	}

	private class EscuchaBotonMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(lamina_tipo.dameSeleccion());
			System.out.println(lamina_Tipo_Mensaje.dameSeleccion());
			System.out.println(lamina_mensaje.dameSeleccion());
			System.out.println(lamina_confirmar.dameSeleccion());
			System.out.println(lamina_opcion.dameSeleccion());
			System.out.println(lamina_entrada.dameSeleccion());
		
		}
	}

	private Lamina_Botones lamina_tipo, lamina_Tipo_Mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion, lamina_entrada;

}
