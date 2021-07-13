package V88_EnventosCuadrosDeTexto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class V88_EnventosCuadrosDeTexto {

	public static void main(String[] args) {
	
		Marco miMarco = new Marco();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);
		

	}

}


class Marco extends JFrame{
	
	public Marco () {
		
		setTitle("Ejemplos Eventos cuadros de texto");
		
		setBounds(500,300,500,350);
		
		Lamina milamina = new Lamina();
		
		add(milamina);
			
	}
	
}

class Lamina extends JPanel{
	
	JTextField micampo;
	
	public Lamina() {
		
		micampo= new JTextField(20);  //declaramos el campo de texto
		
		add(micampo);							 //lo añadimos a la lamina 
		
		Document midoc = micampo.getDocument();	  //guardmos en midoc lo que contiene la etiqueta
		
		EscuchaTexto El_evento = new EscuchaTexto();  //Declaramos la escucha
		
		midoc.addDocumentListener(El_evento);  //ponemos la etiqueta a la escucha
		
		
		
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("has introducido texto");
			System.out.println(micampo.getAction());
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
		
			System.out.println("has borrado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	
}