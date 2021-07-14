package V95_Swing_ComboBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V95_Swing_ComboBox {

	public static void main(String[] args) {
		
		MarcoComboBox Mimarco = new MarcoComboBox();
		
		Mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoComboBox extends JFrame{
	
	public MarcoComboBox() {
		
		setVisible(true);
		
		setBounds(550, 300, 550, 400);
		
		LaminaComboBox milamina = new LaminaComboBox();
		
		add(milamina);
		
		
		
	}
}

class LaminaComboBox extends JPanel{
	
	public LaminaComboBox() {
		
		setLayout(new BorderLayout());
		
		// Añadimos el texto en la lamina con una etiqueta
		
		texto = new JLabel("En un lugar de Vallekas de cuyo barrio...");
		
		texto.setFont(new Font("Serif", Font.PLAIN,18));
		
		add(texto, BorderLayout.CENTER);
		
		//creamos una segunda lamina para añadir al norte del marco
		
		JPanel laminaNorte = new  JPanel();
		
		micombo= new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		
		micombo.addItem("SansSerif");
		
		micombo.addItem("MonoSpaced");
		
		micombo.addItem("Dialog");
		
		Evento_combo mievento = new Evento_combo();
		
		micombo.addActionListener(mievento);
		
		laminaNorte.add(micombo);
		
		add(laminaNorte, BorderLayout.NORTH);
		
		
		
	}
	
	private class Evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN,18));
			
		}
		
	}
	
	private JLabel texto;
	private JComboBox micombo;
}