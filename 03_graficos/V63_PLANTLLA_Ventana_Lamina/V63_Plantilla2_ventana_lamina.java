package V63_PLANTLLA_Ventana_Lamina;

import java.awt.*;
import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class V63_Plantilla2_ventana_lamina {

	public static void main(String[] args) {
		
		MicarciImagen2 miMarco = new MicarciImagen2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MicarciImagen2 extends JFrame{
	
	public MicarciImagen2() {
		
		setTitle("Marco con imagen");
		
		setVisible(true);
		
		setBounds(750, 300, 300, 200);
		
		Milamina miLamina = new Milamina();
		
		add(miLamina);
		
	}
}

class Milamina extends JPanel{
	
	public void paintComponent(Graphics e) {
	
		super.paintComponent(e);
		
	}
	
	
}