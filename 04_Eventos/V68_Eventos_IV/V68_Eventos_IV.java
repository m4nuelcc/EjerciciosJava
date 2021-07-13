package V68_Eventos_IV;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class V68_Eventos_IV {

	public static void main(String[] args) {

		MarcoVentana miMarco = new MarcoVentana();
			

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MarcoVentana mimarco2 = new MarcoVentana();
		
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		mimarco2.setTitle("ventana2");
		
		mimarco2.setBounds(300,300,500,350);
		
		miMarco.setTitle("Ventana1");
		
		miMarco.setBounds(900,300,500,350);

	}

}

 
class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		
		//setBounds(300,300,500,350);
		
		setVisible(true);
		
		M_Ventana oyenteVentana = new M_Ventana();
		
		addWindowListener(oyenteVentana);
		
		
	}
}

class M_Ventana implements WindowListener{

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("programa ha sido cerrado");
	}

	@Override
	public void windowClosed(WindowEvent e) {
	System.out.println("ventana cerrada");
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("ventana restaurada");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("desactivando ventana");
	}
	
	
}