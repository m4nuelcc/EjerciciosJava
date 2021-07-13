package V74_EventosDeFoco;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V74_EventosDeFoco {

	public static void main(String[] args) {

		MarcoFoco miMarco = new MarcoFoco();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco() {

		setVisible(true);

		setTitle("Marco Foco");

		setBounds(300, 300, 600, 450);

		add(new LaminaFoco());
		
		
	
	}
}

class LaminaFoco extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		setLayout(null); // invalida la colocacion por defecto

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);

		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos elFoco = new LanzaFocos();
		
		cuadro1.addFocusListener(elFoco);

	}

	JTextField cuadro1;
	JTextField cuadro2;
	
	//private class LanzaFocos extends FocusAdapter
	private class LanzaFocos implements FocusListener { //clase para escuchar los focos o eventos de la ventana

		@Override
		public void focusGained(FocusEvent e) {
	
			
			

		}

		@Override
		public void focusLost(FocusEvent e) {
		
			String email = cuadro1.getText();
			boolean  comprobacion=false;
			
			for(int i=0; i<email.length(); i++) {
				
				if (email.charAt(i)=='@') {
					
					comprobacion=true;
				}
			}
			if (comprobacion) {
				
				System.out.println("el correo es correcto");
				
			}else {
				System.out.println("el correo es INCORRECTO");
			}
		}
	}

}
