package V67_PruebaEventos_II;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V67_PruebaEventos_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoBotones miVentana = new MarcoBotones();
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoBotones extends JFrame {

	public MarcoBotones() {

		setTitle("Botones y  Eventos");

		setBounds(700, 300, 500, 300);

		LaminaBotones miLamina = new LaminaBotones();

		add(miLamina);

	}

}

class LaminaBotones extends JPanel {

	JButton BotonAmarillo = new JButton("Amarillo");
	
	JButton BotonRojo = new JButton("Rojo");
	
	JButton BotonAzul = new JButton("Azul");


	public LaminaBotones() {

		add(BotonAzul);

		add(BotonAmarillo);

		add(BotonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.red);
		ColorFondo Azul = new ColorFondo(Color.BLUE);

		BotonAmarillo.addActionListener(Amarillo);
		BotonRojo.addActionListener(Rojo);
		BotonAzul.addActionListener(Azul);

	}

	class ColorFondo implements ActionListener {

		public ColorFondo(Color c) {

			colorDeFondo = c;
		}

		public void actionPerformed(ActionEvent e) {

			setBackground(colorDeFondo);
			

		}

		private Color colorDeFondo;

	}

}
