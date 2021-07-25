package V109_MenusEmergentes;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;

public class V109_MenusEmergentes {

	public static void main(String[] args) {

		Marco miMarco = new Marco();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {

		setLayout(new BorderLayout());

		setBounds(600, 300, 400, 450);

		setTitle("ventanas Emergentes");

		Lamina miLamina = new Lamina();

		add(miLamina);

		setVisible(true);

	}
}

class Lamina extends JPanel {

	JButton boton2, boton3;

	public Lamina() {
		
		setLayout(new BorderLayout());
		
		
		

		JButton boton1 = new JButton("Boton1");

		add(boton1, BorderLayout.NORTH);

		JTextArea area = new JTextArea();

		add(area, BorderLayout.CENTER);
			
		JPanel lamina2 = new JPanel();

		boton2 = new JButton("Boton2");
		
		boton3 = new JButton("Boton3");
		
		lamina2.add(boton2);
		
		lamina2.add(boton3);
		
		//creacion menu emergente y añadido a un area de texto
		
		JPopupMenu emergente = new JPopupMenu();
		
		JMenuItem opcion1 = new JMenuItem("opcion1");
		JMenuItem opcion2 = new JMenuItem("opcion2");
		JMenuItem opcion3 = new JMenuItem("opcion3");
		
		emergente.add(opcion1);
		emergente.add(opcion2);
		emergente.add(opcion3);
		
		area.setComponentPopupMenu(emergente);
		
			
		
		
		
		
		
		
		add(lamina2, BorderLayout.SOUTH);

	}

}