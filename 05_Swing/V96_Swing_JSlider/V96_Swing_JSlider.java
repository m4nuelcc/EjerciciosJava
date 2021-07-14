package V96_Swing_JSlider;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class V96_Swing_JSlider {

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
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de Vallekas cuyo Barrio...");
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8,50,12);
		
		control.setMajorTickSpacing(20);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true); //pinta valores
		
		control.setPaintLabels(true);//pinta lineas
		
		control.setFont(new Font("Serif", Font.ITALIC,10));
		
		control.addChangeListener(new EventoSlide());  //ponemos Slider en escucha
		
		JPanel laminaSlider = new JPanel();
		
		laminaSlider.add(control);
		
		add(laminaSlider, BorderLayout.NORTH);
		
	
		
		
	}
	
	
	private class EventoSlide implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
			
		
//			System.out.println("estas manipulando el deslizador: "+ contador);
//			System.out.println("estas moviendo el deslizador " + control.getValue());
			
		}
		
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
	
}