package V94_0_Swing_JRadioButton_II;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//min15:39

public class V94_Swing_JRadioButton_II {

	public static void main(String[] args) {

		VentanaCheck miventana = new VentanaCheck();

		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class VentanaCheck extends JFrame {

	public VentanaCheck() {

		setVisible(true);

		setTitle("Ventana CheckBox");

		setBounds(550, 300, 500, 350);

		Lamina milamina = new Lamina();

		add(milamina);

	}

}

class Lamina extends JPanel {

	public Lamina() {

		setLayout(new BorderLayout());

		texto = new JLabel("En algun lugar de la Mancha de cuyo nombre...");

		add(texto, BorderLayout.CENTER);

		ButtonGroup migrupo = new ButtonGroup();

		boton1 = new JRadioButton("Pequeño", false);
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy Grande", false);

		JPanel laminaRadio = new JPanel();
		
		Evento_Radio miEvento = new Evento_Radio();
		
		boton1.addActionListener(miEvento);
		boton2.addActionListener(miEvento);
		boton3.addActionListener(miEvento);
		boton4.addActionListener(miEvento);

		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);

		laminaRadio.add(boton1);
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);

		add(laminaRadio, BorderLayout.SOUTH);

	}

	private class Evento_Radio implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==boton1) {
				
				texto.setFont(new Font("Serif", Font.PLAIN,10));
			
			}else if(e.getSource()==boton2) {
				
				texto.setFont(new Font("Serif", Font.PLAIN,12));
				
			}else if(e.getSource()==boton3) {
				
				texto.setFont(new Font("Serif", Font.PLAIN,18));
				
			}else if(e.getSource()==boton4) {
				
				texto.setFont(new Font("Serif", Font.PLAIN,24));
				
			}

		}
	}

	private JLabel texto;

	private JRadioButton boton1, boton2, boton3, boton4;

}