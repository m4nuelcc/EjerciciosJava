package V123_Ejercicio_Practico_I;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//mirar BorderFactory--- dibuja bordes

public class V123_Lamina_Botones extends JPanel {
	
	public V123_Lamina_Botones(String titulo, String[] opciones) {
		
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));  //distribuido vertical
		
		ButtonGroup grupo = new ButtonGroup();
		
		for(int i=0; i<opciones.length; i++) {
			
			JRadioButton bot =new JRadioButton(opciones[i]);
			
			add(bot);
			
			grupo.add(bot);
			
			bot.setSelected(i==0);  //para que quede seleccionado el primer boton
			
		}
		
		
		
//		for (String tituloR: opciones) {
//			
//			JRadioButton bot =new JRadioButton(tituloR);
//			
//		}
		
	}
	

}
