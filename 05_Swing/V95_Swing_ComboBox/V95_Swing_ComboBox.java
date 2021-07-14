package V95_Swing_ComboBox;

import javax.swing.JFrame;
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
		
		
		
		
	}
}