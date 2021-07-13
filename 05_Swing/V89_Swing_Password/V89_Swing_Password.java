package V89_Swing_Password;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class V89_Swing_Password {

	public static void main(String[] args) {

		MarcoPassword miMarco = new MarcoPassword();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame {

	public MarcoPassword() {

		setTitle("Ejemplos Contraseñas");

		setBounds(600, 300, 550, 400);

		LaminaPassword milamina = new LaminaPassword();

		add(milamina);

		setVisible(true);

	}
}

class LaminaPassword extends JPanel {

	JPasswordField pass;
	JButton enviar;

	public LaminaPassword() {

		setLayout(new BorderLayout());

		JPanel LaminaSuperior = new JPanel();

		LaminaSuperior.setLayout(new GridLayout(2, 2));

		add(LaminaSuperior, BorderLayout.NORTH);

		JLabel etiqueta1 = new JLabel("Usuario");

		JLabel etiqueta2 = new JLabel("contraseña");

		JTextField c_usuario = new JTextField(15);

		pass = new JPasswordField(15);

		Comprueba_pass mievento = new Comprueba_pass();

		pass.getDocument().addDocumentListener(mievento);

		LaminaSuperior.add(etiqueta1);

		LaminaSuperior.add(c_usuario);

		LaminaSuperior.add(etiqueta2);

		LaminaSuperior.add(pass);

		enviar = new JButton("Enviar");
		
		enviar.addActionListener(new EscuchaBoton());

		add(enviar, BorderLayout.SOUTH);

	}

	private class Comprueba_pass implements DocumentListener {

		

		@Override
		public void insertUpdate(DocumentEvent e) {

			char[] contrasena;

			contrasena = pass.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {

				pass.setBackground(Color.RED);

			} else {

				pass.setBackground(Color.white);
			}

		}

		@Override
		public void removeUpdate(DocumentEvent e) {

			char[] contrasena;

			contrasena = pass.getPassword();

			if (contrasena.length < 8 || contrasena.length > 12) {

				pass.setBackground(Color.RED);

			} else {

				pass.setBackground(Color.white);
			}

		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub

		}

	}
	
	private class EscuchaBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(pass.getPassword());
			
		}
		
	}
	
}




 