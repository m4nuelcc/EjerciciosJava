package V74_EventosDeFoco;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class V74_EventosFocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V74_EventosFocoVentana miventana = new V74_EventosFocoVentana();
		miventana.iniciar();

	}

	public void iniciar () {
		
	marco1 = new V74_EventosFocoVentana();
	marco2 = new V74_EventosFocoVentana();
	
	marco1.setVisible(true);
	marco2.setVisible(true);
	
	marco1.setBounds(300,100,600,350);
	marco2.setBounds(1200, 100, 600, 350);
	
	marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	marco1.addWindowFocusListener(this);
	marco2.addWindowFocusListener(this);
	
	}
	
	@Override
	public void windowGainedFocus(WindowEvent e) {
	
		if(e.getSource()==marco1) {
			
			marco1.setTitle("Tengo el foco");
		}else {
			
			marco2.setTitle("tengo el foco");
		}
		
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		

		if(e.getSource()==marco1) {
			
			marco1.setTitle("");
		}else {
			
			marco2.setTitle("");
		}
		
	}

	V74_EventosFocoVentana  marco1;
	
	V74_EventosFocoVentana  marco2;
	
}
