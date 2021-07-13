package V81_Swing_I;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V81_Swing_I {
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
		Panel_laout2 miLamina2 = new Panel_laout2();
		Panel_laout3 miLamina3 = new Panel_laout3();

		add(miLamina, BorderLayout.NORTH);
		
		add(miLamina2, BorderLayout.CENTER);
		
		add(miLamina3, BorderLayout.SOUTH);
		
		
	}
	
}


class Panel_layout extends JPanel{
	
	public Panel_layout() {
		
		//setLayout(new FlowLayout(FlowLayout.LEADING));
		
		//setLayout(new BorderLayout(10,10)); //separacion entre los botones
		
		//setLayout(new FlowLayout(FlowLayout.LEFT)); 
		
		add(new JButton("negro"));
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));
	
		
		
	}
}

class Panel_laout2 extends JPanel{
	
	public Panel_laout2() {
		
		
		setLayout(new BorderLayout()); 
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("verde"), BorderLayout.CENTER);
		add(new JButton("negro"), BorderLayout.EAST);
		
	}
	
}

class Panel_laout3 extends JPanel{
	
	public Panel_laout3() {
		
		
		setLayout(new BorderLayout()); 
		add(new JButton("naranja"), BorderLayout.WEST);
		add(new JButton("pistacho"), BorderLayout.CENTER);
		add(new JButton("azurol"), BorderLayout.EAST);
		
	}
	
}