package V121_Cuadros_De_Dialogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class V121_Cuadros_De_Dialogo {

	public static void main(String[] args) {

		Marco miMarco = new Marco();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {

		setBounds(600, 300, 600, 500);

		setTitle("Cuadros de dialogo");

		Lamina miLamina = new Lamina();

		add(miLamina);

		setVisible(true);
	}
}

class Lamina extends JPanel {

	public Lamina() {

		boton1 = new JButton("Boton1");
		boton2 = new JButton("Boton2");
		boton3 = new JButton("Boton3");
		boton4 = new JButton("Boton4");

		add(boton1);

		add(boton2);

		add(boton3);

		add(boton4);

		boton1.addActionListener(new AccionBotones());

		boton2.addActionListener(new AccionBotones());

		boton3.addActionListener(new AccionBotones());

		boton4.addActionListener(new AccionBotones());

	}

	private class AccionBotones implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			

			if (e.getSource() == boton1) {

				System.out.println("has pulsado el boton1");
				
				
				JOptionPane.showMessageDialog(Lamina.this, "hola", "titulo de la ventana", 2);
				
				
				
			} else if (e.getSource() == boton2) {

				System.out.println("has pulsado el boton2");
				
			//	JOptionPane.showInputDialog("Introduce nombre");
				
				JOptionPane.showInputDialog(Lamina.this, "Introduce Nombre", "introduccion de datos",2);

				
			} else if (e.getSource() == boton3) {

				
				System.out.println("has pulsado el boton3");
				
			} else if (e.getSource() == boton4) {

				System.out.println("has pulsado el boton4");
			}

		
		}

	}

	JButton boton1, boton2, boton3, boton4;
	
	
}
