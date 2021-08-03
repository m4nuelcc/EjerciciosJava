package V120_Disposiciones_Avanzadas_VI;

import java.awt.*;

import javax.swing.*;

public class V120_Disposiciones_Avanzadas_VI {

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
		
		JLabel edad = new JLabel("Edad: ");

		JTextField c_nombre = new JTextField();

		JTextField c_apellido = new JTextField();
		
		JTextField c_edad = new JTextField();

		add(nombre);

		add(c_nombre);

		add(apellido);

		add(c_apellido);
		
		add(edad);

		add(c_edad);
		
		

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
		
		int anchoConenedor = micontenedor.getWidth();
		
		x = anchoConenedor/2;

		int contador = 0;

		int n = micontenedor.getComponentCount();

		System.out.println(n);
		
		for (int i = 0; i < n; i++) {

			contador++;

			Component c = micontenedor.getComponent(i);

			c.setBounds(x-100, y, 100, 20);

			x += 100;

			if (contador % 2 == 0) {

				x = anchoConenedor/2;

				y += 40;
			}
		}

	}

	private int x;

	private int y = 20;
}
