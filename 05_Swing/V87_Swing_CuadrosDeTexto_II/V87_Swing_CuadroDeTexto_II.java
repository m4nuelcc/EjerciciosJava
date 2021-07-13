package V87_Swing_CuadrosDeTexto_II;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class V87_Swing_CuadroDeTexto_II {

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
		
		setLayout(new BorderLayout());
		
		JPanel milamina2 = new JPanel();
		
		milamina2.setLayout(new FlowLayout());
		
		resultado = new JLabel("",JLabel.CENTER );
		
		JLabel texto1 = new JLabel("Email: ");
		
		milamina2.add(texto1);

		campo1 = new JTextField(20);

		milamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);

		JButton miBoton = new JButton("Comprobar");

		DameTexto miEvento = new DameTexto();

		miBoton.addActionListener(miEvento);

		milamina2.add(miBoton);
		
		add(milamina2, BorderLayout.NORTH);
		
		

	}

	private class DameTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			//System.out.println(campo1.getText().trim());
			
			int correcto=0;
			
			String entrada = campo1.getText().trim();
			
			for(int i=0; i<entrada.length(); i++) {
				
				if(entrada.charAt(i)=='@') {
					
					correcto++;
				}
				
			}
			
			if (correcto!=1) {
				
				resultado.setText("incorrecto");
				
			}else  {
				
				resultado.setText("correcto");
				
			}
			
			
		}

	}

	private JTextField campo1;
	
	private JLabel resultado;
}
