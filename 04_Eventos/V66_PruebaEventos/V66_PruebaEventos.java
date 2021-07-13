package V66_PruebaEventos;

import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V66_PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miMarco = new MarcoBotones();

		miMarco.setVisible(true);

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y Eventos");

		setBounds(700, 300, 500, 300);

		LaminaBotones miLamina = new LaminaBotones();

		add(miLamina);

	}

}

class LaminaBotones extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	JButton botonBorrar = new JButton("Borrar");

	public LaminaBotones() {

		
	 
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		add(botonBorrar);
		
	;
		botonAzul.addActionListener(this);
		botonRojo.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonBorrar.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

	
		Object botonPulsado = e.getSource(); // almacena el origen del evento
		

		if (botonPulsado == botonAzul) {
			setBackground(Color.BLUE);
		}
		else if (botonPulsado == botonAmarillo) {
			setBackground(Color.YELLOW);
		} 
		else if (botonPulsado == botonRojo) {
			setBackground(Color.RED);
		}
		else {
			setBackground(SystemColor.window);
		}

	}

}
