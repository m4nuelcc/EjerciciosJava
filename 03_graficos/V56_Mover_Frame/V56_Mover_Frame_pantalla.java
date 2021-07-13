package V56_Mover_Frame;

import java.awt.Frame;

import javax.swing.*;

public class V56_Mover_Frame_pantalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiMarco marco1 = new MiMarco();
		
		marco1.setVisible(true); 
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //cierra ventana y el programa
		//marco1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //ocultate al cerrar

	}

}


class MiMarco extends JFrame{
	
	public MiMarco(){
		
		//setSize(500,300); tamaño
		//setLocation(500, 300); posicion
		
		setBounds(500,300,550,250); //tamaño posicion
		
		setResizable(false); //no permite mover el frame
		
		//setExtendedState(Frame.MAXIMIZED_BOTH); //se abre a pantalla completa
		
		setTitle("Mi ventanuka");
		
		
		
	}
	
}

