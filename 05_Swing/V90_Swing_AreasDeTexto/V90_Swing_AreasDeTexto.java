package V90_Swing_AreasDeTexto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V90_Swing_AreasDeTexto {

	public static void main(String[] args) {

		MarcoArea miMarco = new MarcoArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}


class MarcoArea extends JFrame{
	
	public MarcoArea() {
		
		setTitle("Marco AreaDeTexto");
		
		setBounds(500,300,500,350);
		
		LaminaArea miLamina = new LaminaArea();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaArea extends JPanel{
	
	JTextArea miArea;
	
	public LaminaArea() {
		
		miArea = new JTextArea(8,20);
		
		JScrollPane laminaBarras = new JScrollPane(miArea);
		
		miArea.setLineWrap(true); //Salto de linea automatico
				
		add(laminaBarras);
		
		JButton miBoton = new JButton("dale");
		
		miBoton.addActionListener(new GetionaArea());	
		
		add(miBoton);
		
	}
	
	private class GetionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
		
		System.out.println(miArea.getText());
			
		}
		
		
	}
}