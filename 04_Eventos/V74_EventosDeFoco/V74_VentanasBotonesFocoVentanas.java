package V74_EventosDeFoco;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import V74_EventosDeFoco.V74_EventosFocoVentana;

public class V74_VentanasBotonesFocoVentanas implements WindowFocusListener {

	Ventana miVentana;
	Ventana miVentana2;
	Ventana miVentana3;

	public static void main(String[] args) {

		V74_VentanasBotonesFocoVentanas miventana = new V74_VentanasBotonesFocoVentanas();

		miventana.iniciar();

	}

	public void iniciar() {

		miVentana = new Ventana();
		miVentana.setBounds(300, 300, 300, 200);
		miVentana.setTitle("ventana Uno");
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miVentana2 = new Ventana();
		miVentana2.setTitle("Ventana Dos");
		miVentana2.setBounds(300, 500, 300, 200);
		miVentana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miVentana3 = new Ventana();
		miVentana3.setTitle("Ventana Dos");
		miVentana3.setBounds(500, 500, 300, 200);
		miVentana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		miVentana.addWindowFocusListener(this);
		miVentana2.addWindowFocusListener(this);
		miVentana3.addWindowFocusListener(this);

	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		if (e.getSource() == miVentana) {

			miVentana.setTitle("Tengo el foco");
		} else if (e.getSource() == miVentana2) {

			miVentana2.setTitle("tengo el foco");
		} else {

			miVentana3.setTitle("tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		if (e.getSource() == miVentana) {

			miVentana.setTitle("");
		} else if (e.getSource() == miVentana2) {

			miVentana2.setTitle("");
		} else {
			miVentana3.setTitle("");

		}

	}

}

class Ventana extends JFrame {

	public Ventana() {

		Lamina milamina = new Lamina();

		// setTitle("Ventana pricipal");

		// setBounds(300, 300, 300, 200);

		setVisible(true);

		add(milamina);
	}

}

class Lamina extends JPanel {

	JButton BtonAzul = new JButton("azul");
	JButton BtonVerde = new JButton("verde");
	JButton BtonRojo = new JButton("Rojo");

	public Lamina() {

		add(BtonAzul);
		add(BtonRojo);
		add(BtonVerde);

		ColorDefondo Azul = new ColorDefondo(Color.BLUE);
		ColorDefondo Rojo = new ColorDefondo(Color.RED);
		ColorDefondo Verde = new ColorDefondo(Color.GREEN);

		BtonAzul.addActionListener(Azul);
		BtonRojo.addActionListener(Rojo);
		BtonVerde.addActionListener(Verde);

	}

	class ColorDefondo implements ActionListener {

		public ColorDefondo(Color c) {

			colorDefondo = c;

		}

		@Override
		public void actionPerformed(ActionEvent e) {

			setBackground(colorDefondo);

		}

		Color colorDefondo;

	}

}