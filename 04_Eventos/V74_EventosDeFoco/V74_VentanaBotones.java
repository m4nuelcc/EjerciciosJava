package V74_EventosDeFoco;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V74_VentanaBotones {

	public static void main(String[] args) {

		// creacion Ventana
		
		JFrame ventana;
		ventana = new JFrame();
		ventana.setTitle("mi ventana1");
		ventana.setVisible(true);
		ventana.setBounds(300, 300, 300, 100);
		
		
		
		//Creacion Botones
		
		JButton boton1,boton2,boton3;
		boton1= new JButton("rojo");
		boton2= new JButton("azul");
		boton3= new JButton("amarillo");
		
		
		
		//creacion lamina
		
		JPanel lamina;
		lamina = new JPanel();
		lamina.add(boton1);
		lamina.add(boton2);
		lamina.add(boton3);
		
		
	
		//insetar lamnina a la ventana
		
		
		ventana.getContentPane().add(lamina);
		ventana.setVisible(true);
		
		
	}
	
	
	

}



