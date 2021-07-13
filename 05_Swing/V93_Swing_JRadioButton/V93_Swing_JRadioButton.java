package V93_Swing_JRadioButton;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class V93_Swing_JRadioButton {
	
	public static void main(String[] args) {
		
		VentanaCheck miventana = new VentanaCheck();
		
		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}


class VentanaCheck extends JFrame{
	
	public VentanaCheck() {
		
		setTitle("Ventana CheckBox");
		
		setBounds(300,300,500,350);
		
		setVisible(true);
		
		Lamina milamina = new Lamina();
		
		add(milamina);
		
	}
	
}

class Lamina extends JPanel{
	
	
	
	public Lamina() {
		
		//setLayout(new BorderLayout());
		
		ButtonGroup grupo1 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("rojo", false);
		JRadioButton boton2 = new JRadioButton("azul", true);
		JRadioButton boton3 = new JRadioButton("verde", false);
		
		grupo1.add(boton1);
		grupo1.add(boton2);
		grupo1.add(boton3);
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		ButtonGroup grupo2 = new ButtonGroup();
		
		JRadioButton boton4 = new JRadioButton("Hombre");
		JRadioButton boton5 = new JRadioButton("Mujer");
	
		grupo2.add(boton4);
		grupo2.add(boton5);
		
		add(boton4);
		add(boton5);
		
		
		
		
		
	}
	
}