package V58_EscribiendoEnMarco;

import javax.swing.*;
import java.awt.*;

public class V58_EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto miMarco = new MarcoConTexto();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConTexto extends JFrame {

	public MarcoConTexto() {

		setVisible(true);

		setSize(600, 450);

		setLocation(400, 200);

		setTitle("mi primer texto");

		Lamina miLamina = new Lamina();
		Lamina2 miLamina2 = new Lamina2();

		add(miLamina);
	//	add(miLamina2);

	}

}

class Lamina extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g); // invocamos IMPORTANTE

		g.drawString("Escribiendo en una lamina con drawString", 200, 200);
	}
}

class Lamina2 extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g); // invocamos IMPORTANTE

		g.drawString("Escribiendo en una lamina con drawString segunda lamina", 250, 200);
	}
}