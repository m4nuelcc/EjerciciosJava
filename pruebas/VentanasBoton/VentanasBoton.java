package VentanasBoton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanasBoton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrincipal miMarco = new MarcoPrincipal();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPrincipal extends JFrame {

	public MarcoPrincipal() {

		setTitle("Marco principal");

		setBounds(600, 300, 450, 300);

		Lamina1 miLamina1 = new Lamina1();

		add(miLamina1);

		setVisible(true);
	}

}

class Lamina1 extends JPanel {

	private JButton boton1, boton2;

	private JTextField texto1, texto2;

	private JLabel label1, label2;

	public Lamina1() {

		setLayout(new BorderLayout());

		JPanel milamina2 = new JPanel();

		milamina2.setLayout(new FlowLayout());

		boton1 = new JButton("boton1");

		milamina2.add(boton1);

		texto1 = new JTextField("texto1",30);

		milamina2.add(texto1);

		add(milamina2, BorderLayout.SOUTH);

		// ***********************************************************
		JPanel milamina3 = new JPanel();

		milamina3.setLayout(new FlowLayout());

		boton2 = new JButton("boton2");

		milamina3.add(boton2);

		texto2 = new JTextField("texto2",30);

		milamina3.add(texto2);

		add(milamina3, BorderLayout.NORTH);

		// ***********************************************************

		label1 = new JLabel("", JLabel.CENTER);
		label2 = new JLabel("", JLabel.CENTER);

		add(label1);

		add(label2);
		Dametexto dametexto = new Dametexto();
		Dametexto dametexto2 = new Dametexto();

		boton1.addActionListener(dametexto);
		boton2.addActionListener(dametexto2);

	}

	class Dametexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			
			Lamina1 lamina1 = new Lamina1();
			lamina1.setBackground(Color.BLUE);
			
			
			String texto = texto1.getText();
		    String texto3 = texto2.getText();

			label1.setText(texto);
			label2.setText(texto);
			System.out.println(texto3);

		}

	}
	
	

}