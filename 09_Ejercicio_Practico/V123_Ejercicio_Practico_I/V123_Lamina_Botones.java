package V123_Ejercicio_Practico_I;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//mirar BorderFactory--- dibuja bordes

public class V123_Lamina_Botones extends JPanel {
	
	public V123_Lamina_Botones(String titulo, String[] opciones) {
		
		//setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		
		setBackground(Color.gray);
		 
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.red ),titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));  //distribuido vertical
		
		grupo = new ButtonGroup();
		
		
		for(int i=0; i<opciones.length; i++) {
			
			JRadioButton bot =new JRadioButton(opciones[i]);
			
			bot.setActionCommand(opciones[i]);
			
			add(bot).setBackground(Color.gray);;
			
			grupo.add(bot);
			
			bot.setSelected(i==0);  //para que quede seleccionado el primer boton
			
			
		}
		
		
		
//		for (String tituloR: opciones) {
//			
//			JRadioButton bot =new JRadioButton(tituloR);
//			
//		}
		
	}
	
	public String dameSeleccion() {
		
//		ButtonModel miboton=grupo.getSelection(); // guardamos el boton seleccionado
//		
//		String s = miboton.getActionCommand(); //guardamos el valor que tiene el boton seleccionado
//		
//		return s;
		
		return grupo.getSelection().getActionCommand();
	}
	
	private ButtonGroup grupo;  //encapsulado

}
