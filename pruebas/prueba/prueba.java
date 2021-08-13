package prueba;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		JFrame panel = new JFrame();
		
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel mensaje = new JLabel("hola");
		
		panel.setBounds(300,600,300,300);
		
		panel.add(mensaje, BorderLayout.NORTH);
		
		panel.setVisible(true);
		
		//fin
	
	}

}
