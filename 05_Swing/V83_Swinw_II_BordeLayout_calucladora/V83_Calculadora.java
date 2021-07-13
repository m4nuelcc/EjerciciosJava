package V83_Swinw_II_BordeLayout_calucladora;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;



public class V83_Calculadora {

	public static void main(String[] args) {
		
		MarcoCalculadora miMarco = new MarcoCalculadora();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		
		
		
	
		
		
		

	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500, 300, 450, 300);
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		
		add(miLamina);
		
		
		
	}

	
}

class  LaminaCalculadora  extends JPanel{
	
	private JPanel milamina2;
	
	public LaminaCalculadora() {
		
		//añadimos la pantalla que es un boton
		
		setLayout(new BorderLayout());
		
		JButton pantalla = new JButton("0");
		
		pantalla.setEnabled(false);
		
		add(pantalla, BorderLayout.NORTH);
		
		//añadimos los botones con los numeros de la calculadora en otra lamina
		
		 milamina2 = new JPanel();
		
		milamina2.setLayout(new GridLayout(4,4));
		
		ponerBoton("7");
		ponerBoton("8");
		ponerBoton("9");
		ponerBoton("/");
		ponerBoton("4");
		ponerBoton("5");
		ponerBoton("6");
		ponerBoton("*");
		ponerBoton("1");
		ponerBoton("2");
		ponerBoton("3");
		ponerBoton("-");
		ponerBoton("0");
		ponerBoton(".");
		ponerBoton("=");
		ponerBoton("+");
		
						
		add(milamina2, BorderLayout.CENTER);
		
		
	}
	
	//metodo para crear los botones
	
	private void ponerBoton(String rotulo) {
		
		JButton boton = new JButton(rotulo);
		
		milamina2.add(boton);
		
	}
	
}

