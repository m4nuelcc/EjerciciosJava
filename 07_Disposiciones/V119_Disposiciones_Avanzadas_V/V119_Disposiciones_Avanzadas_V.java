package V119_Disposiciones_Avanzadas_V;

import java.awt.*;

import javax.swing.*;

public class V119_Disposiciones_Avanzadas_V {

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

		// setLayout(null); // Disposicion libre

		setLayout(new EnColumnas());

		JLabel nombre = new JLabel("Nombre: ");

		JLabel apellido = new JLabel("Apellido: ");
		
		JLabel apellido2 = new JLabel("Apellido2: ");

		JTextField c_nombre = new JTextField();

		JTextField c_apellido = new JTextField();
		
		JTextField c_apellido2 = new JTextField();

	/*	nombre.setBounds(20, 20, 80, 15);
		
		c_nombre.setBounds(90, 20, 100, 20);
		
		apellido.setBounds(20, 60, 80, 15);

		c_apellido.setBounds(90, 60, 100, 20); */

		add(nombre);

		add(c_nombre);

		add(apellido);

		add(c_apellido);
		
		add(apellido2);

		add(c_apellido2);
		
		

	}
}

class EnColumnas implements LayoutManager {

	@Override
	public void addLayoutComponent(String name, Component comp) {

	}

	@Override
	public void removeLayoutComponent(Component comp) {

	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {

		return null;
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void layoutContainer(Container micontenedor) {

		int contador = 0;

		int n = micontenedor.getComponentCount();

		System.out.println(n);
		
		for (int i = 0; i < n; i++) {

			contador++;

			Component c = micontenedor.getComponent(i);

			c.setBounds(x, y, 100, 20);

			x += 100;

			if (contador % 2 == 0) {

				x = 20;

				y += 40;
			}
		}

	}

	private int x = 20;

	private int y = 20;
}
