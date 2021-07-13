package V52_InterfacesIV;

import java.awt.ActiveEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Prueba_temporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Damelahora Oyente =  new Damelahora(); 
		ActionListener Oyente = new Damelahora();
		
		Timer miTemporizador = new Timer(5000, Oyente);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pulsa Aceptar para detener");
		
		System.exit(0);
		

	}

}


 class Damelahora implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Date ahora = new Date();
		
		System.out.println("Te pongo la hora cada 5 Seg: " + ahora);
		
	}
	 
	 
	 
	 
	
	
}
