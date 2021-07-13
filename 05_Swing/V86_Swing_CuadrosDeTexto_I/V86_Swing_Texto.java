package V86_Swing_CuadrosDeTexto_I;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V86_Swing_Texto {

	public static void main(String[] args) {

		MarcoTexto miMarco = new MarcoTexto();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoTexto extends JFrame {

	public MarcoTexto() {

		setTitle("Ejemplo cuadro de texto");

		setBounds(600, 300, 600, 350);

		LaminaTexto miLamina = new LaminaTexto();

		add(miLamina);

		setVisible(true);

	}

}

class LaminaTexto extends JPanel {

	public LaminaTexto() {
		
		resultado=new JLabel();
		
		JLabel texto1 = new JLabel("Email: ");

		add(texto1);

		campo1 = new JTextField(20);

		add(campo1);
		
		add(resultado);

		JButton miBoton = new JButton("Comprobar");

		DameTexto miEvento = new DameTexto();

		miBoton.addActionListener(miEvento);

		add(miBoton);

	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			int correcto = 0;

			String email = campo1.getText().trim();

			for (int i = 0; i < email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					
					correcto++;
				}
			}
			
			if(correcto!=1) {
				
				resultado.setText("incorrecto");
			}else {
				
				resultado.setText("correcto");
			}

		}

	}

	private JTextField campo1;
	
	private JLabel resultado;
}
