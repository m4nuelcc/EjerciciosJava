package V82_Swing_I_BorderLaout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V82_Swing_I_BorderLaout {
	public static void main(String[] args) {
		
		Marco_layout miMarco = new Marco_layout();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_layout extends JFrame{
	
	public Marco_layout() {
		
		setTitle("prueba acciones");
		
		setBounds(600,350,600,300);
		
		Panel_layout miLamina = new Panel_layout();
		
//		FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
//		
//		miLamina.setLayout(disposicion);
//		
		miLamina.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		
		add(miLamina);
		
		
	}
	
}


class Panel_layout extends JPanel{
	
	public Panel_layout() {
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
		add(new JButton("Azul"));
	}
}