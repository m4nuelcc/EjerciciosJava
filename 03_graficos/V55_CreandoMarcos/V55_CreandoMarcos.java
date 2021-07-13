package V55_CreandoMarcos;

import javax.swing.*;

public class V55_CreandoMarcos {

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
		
		setSize(5000,3000);
		
	}
	
}

