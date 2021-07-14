package V97_Swing_JSlider_II;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class V97_Swing_JSlider_II {

	public static void main(String[] args) {
		
		MarcoSlide miMarco = new MarcoSlide();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoSlide extends JFrame{
	
	public MarcoSlide() {
		
		
		setTitle("ventana MarcoSlide");
		
		setLayout(new BorderLayout());
		
		setBounds(550, 400, 550, 350);
		
		LaminaSlide miLamina = new LaminaSlide();
		
		add(miLamina);
		
		setVisible(true);
		
		
		
	}
}


class LaminaSlide extends JPanel{
	
	public LaminaSlide() {
	
		JSlider control =new JSlider(0,100,50);
		
		//JSlider control =new JSlider(SwingConstants.VERTICAL,0,100,50);
		//control.setOrientation(SwingConstants.VERTICAL);
		
		control.setMajorTickSpacing(50);
		
		control.setMinorTickSpacing(25);
		
		control.setPaintTicks(true); //visualizar valores
		
		control.setFont(new Font ("Serif", Font.ITALIC,12));
		
		control.setSnapToTicks(true);  //modo iman
		
		control.setPaintLabels(true);
		
		
		add(control);
		
		
		
	}
	
	
}