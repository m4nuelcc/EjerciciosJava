package V118_Disposiciones_Avanzadas_IV;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V118_Disposiciones_Avanzadas_IV_Disposiciones_libre {

	public static void main(String[] args) {

		Marco miMarco = new Marco();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {

		setBounds(600, 300, 600, 450);

		setTitle("Disposicion libre");

		Lamina milamina = new Lamina();

		add(milamina);

		setVisible(true);
	}
}

class Lamina extends JPanel {

	public Lamina() {

		setLayout(null); // Disposicion libre

		JLabel nombre = new JLabel("Nombre: ");

		JLabel apellido = new JLabel("Apellido: ");

		JTextField c_nombre = new JTextField();

		JTextField c_apellido = new JTextField();

		nombre.setBounds(20, 20, 80, 15);

		c_nombre.setBounds(90, 20, 100, 20);

		apellido.setBounds(20, 60, 80, 15);

		c_apellido.setBounds(90, 60, 100, 20);
		
		add(nombre);

		add(apellido);

		add(c_nombre);

		add(c_apellido);

	}
}