package V85_Swing_V_CalculadoraFuncional;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class V85_Swing_V_CalculadoraFuncional {

	public static void main(String[] args) {

		MarcoCalculadora miMarco = new MarcoCalculadora();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miMarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame {

	public MarcoCalculadora() {

		setTitle("Calculadora");

		setBounds(500, 300, 450, 300);

		LaminaCalculadora miLamina = new LaminaCalculadora();

		add(miLamina);
		// pack(); redimensiona todo a media de los que tengamos en los botones

	}

}

class LaminaCalculadora extends JPanel {

	public LaminaCalculadora() {

		// principio = true;

		// añadimos la pantalla que es un boton

		setLayout(new BorderLayout());

		// JButton pantalla = new JButton("0");
		pantalla = new JButton("0");

		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);

		// añadimos los botones con los numeros de la calculadora en otra lamina

		milamina2 = new JPanel();

		milamina2.setLayout(new GridLayout(4, 4));

		ActionListener insertar = new InsetaNumero();

		ActionListener orden = new AccionOrden();

		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		ponerBoton("0", insertar);
		ponerBoton(".", orden);
		ponerBoton("=", orden);
		ponerBoton("+", orden);

		add(milamina2, BorderLayout.CENTER);

	}

	private void ponerBoton(String rotulo, ActionListener oyente) { // primer parametro pinta numero , se segundo lo
		
		JButton boton = new JButton(rotulo); // ponenos a escuchar el boton

		boton.addActionListener(oyente);

		milamina2.add(boton);

	}

	private class InsetaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String entrada = e.getActionCommand(); // captura el texto del boton

			if (principio) {

				pantalla.setText("");

				principio = false;
			}

			pantalla.setText(pantalla.getText() + entrada);

		}

	}

	private class AccionOrden implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			String operacion = e.getActionCommand();

			// System.out.println(operacion);

			calcular(Double.parseDouble(pantalla.getText())); // conviete a double la pulsacion de la tecla

			UltimaOperacion = operacion;

			principio = true;

		}
	}

	public void calcular(double x) {

		if (UltimaOperacion.equals("+")) {

			resultado += x;

		} else if (UltimaOperacion.equals("-")) {

			resultado -= x;
		}

		else if (UltimaOperacion.equals("*")) {

			resultado *= x;
		}

		else if (UltimaOperacion.equals("/")) {

			resultado /= x;
		}

		else if (UltimaOperacion.equals("=")) {

			resultado = x;
		}

		pantalla.setText("" + resultado);

	}

	private boolean principio = true;

	private JPanel milamina2;

	private JButton pantalla;

	private double resultado;

	private String UltimaOperacion = "=";

}
