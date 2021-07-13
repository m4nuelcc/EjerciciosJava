package V72_Eventos_De_Raton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class V72_Eventos_De_Raton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRaton miMarco = new MarcoRaton();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
 class MarcoRaton extends JFrame{
	 
	 public MarcoRaton() {
		 
		setTitle( "Ejemplos raton");
		
		setVisible(true);
		setBounds(300, 300, 644, 450);
		EventosDeRaton eventoRaton = new EventosDeRaton();
		
		addMouseListener(eventoRaton);
		
		
	 }
 }
 
 class EventosDeRaton implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("has hecho click");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Acabas de presionar");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println("acabas de levantar");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			System.out.println("acabas de entrark");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			System.out.println("acabas de salir");		
		}
		 
		 
	 }