package V84_Swing_II_Calculadora_EventoBoones;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class V84_Calculadora_Eventos_Botones {

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
		//pack();  redimensiona todo a media de los que tengamos en los botones

	}

}

class LaminaCalculadora extends JPanel {
	
	private boolean principio= true ;

	private JPanel milamina2;
	
	private JButton pantalla;

	public LaminaCalculadora() {
		
		//principio = true;

		// añadimos la pantalla que es un boton

		setLayout(new BorderLayout());

		//JButton pantalla = new JButton("0");
		pantalla = new JButton("0");

		pantalla.setEnabled(false);

		add(pantalla, BorderLayout.NORTH);

		// añadimos los botones con los numeros de la calculadora en otra lamina

		milamina2 = new JPanel();

		milamina2.setLayout(new GridLayout(4, 4));
		
		ActionListener insertar = new InsetaNumero();
				
		ponerBoton("7",insertar);
		ponerBoton("8",insertar);
		ponerBoton("9",insertar);
	//	ponerBoton("/");
		ponerBoton("4",insertar);
		ponerBoton("5",insertar);
		ponerBoton("6",insertar);
	//	ponerBoton("*");
		ponerBoton("1",insertar);
		ponerBoton("2",insertar);
		ponerBoton("3",insertar);
	//	ponerBoton("-");
		ponerBoton("0",insertar);
	//	ponerBoton(".");
	//	ponerBoton("=");
	//	ponerBoton("+");

		add(milamina2, BorderLayout.CENTER);

	}

	// metodo para crear los botones

	private void ponerBoton(String rotulo, ActionListener oyente) {  //primer parametro pinta numero , se segundo lo pone en escucha

		JButton boton = new JButton(rotulo); //ponenos a escuchar el boton
		
		boton.addActionListener(oyente);

		milamina2.add(boton);

	}
	
	private class InsetaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand(); //captura el texto del boton
			
			if (principio) {
				
				pantalla.setText("");
				
				principio = false;
			}
			
			
			pantalla.setText(pantalla.getText()+entrada);
			
		}
		
	}

}


