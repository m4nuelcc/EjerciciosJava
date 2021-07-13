package V69_Eventos_Clases_adaptadas;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class V69_Eventos_Clases_Adaptadas {

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
		
//		M_Ventana oyenteVentana = new M_Ventana();
//		
//		addWindowListener(oyenteVentana);
		
		addWindowListener(new M_Ventana());
		
		
	}
}

class M_Ventana extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("Ventana Cerrada");
	}
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana Activada");
		
	}
	
}