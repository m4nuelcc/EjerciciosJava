package V73_Eventos_De_Raton_II;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class V73_Eventos_De_Raton_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton miMarco = new MarcoRaton();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame {

	public MarcoRaton() {

		setTitle("Ejemplos raton");

		setVisible(true);
		setBounds(300, 300, 644, 450);
		EventosDeRaton eventoRaton = new EventosDeRaton();

		addMouseListener(eventoRaton);
		addMouseMotionListener(eventoRaton);

	}
}

class EventosDeRaton extends MouseAdapter {

	public void mouseClicked(MouseEvent e) {

		System.out.println("Coordenada x: " + e.getX() + " Coordenada y: " + e.getY());
		System.out.println(e.getClickCount()); // detecta los click que hacemos

	}

	public void mousePressed(MouseEvent e) {

		System.out.println(e.getModifiersEx()); // nos devuelve el valor de la clase modifiersex
		if (e.getModifiersEx() == 1024) {

			System.out.println("has pulsado el boton izquierdo");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("has pulsado la ruleta");

		} else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("has pulsado boton derecho");

		}

	}
	
	public void mouseDragged(MouseEvent e) {

		System.out.println("estas arrastrando ");
	}

	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("estas moviendo el raton");
		
	}
	
}
