package V74_EventosDeFoco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class V74_EjemploVentanaBotones2 {

	public static void main(String[] args) {
		
		MarcoBotones miVentana = new MarcoBotones();
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoBotones miVentana2 = new MarcoBotones();
		miVentana2.setBounds(700, 400, 500, 300);
		miVentana2.setVisible(true);
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

	JButton BotonAzul = new JButton("Azul");

	JButton BotonAmarillo = new JButton("Amarillo");

	JButton BotonRojo = new JButton("Rojo");

	public LaminaBotones() {

		add(BotonAzul);

		add(BotonAmarillo);

		add(BotonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Rojo = new ColorFondo(Color.red);
		ColorFondo Azull = new ColorFondo(Color.BLUE);

		BotonAzul.addActionListener(Azull);
		BotonAmarillo.addActionListener(Amarillo);
		BotonRojo.addActionListener(Rojo);

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
