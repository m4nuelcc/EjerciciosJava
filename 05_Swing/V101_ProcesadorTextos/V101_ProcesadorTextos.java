package V101_ProcesadorTextos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class V101_ProcesadorTextos {

	public static void main(String[] args) {

		MarcoMenu miMarco = new MarcoMenu();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMenu extends JFrame {

	public MarcoMenu() {

		setBounds(600, 300, 600, 300);

		setTitle("Menu");

		LaminaMenu laminamenu = new LaminaMenu();

		add(laminamenu);

		setVisible(true);

	}
}

class LaminaMenu extends JPanel {

	LaminaMenu() {

		setLayout(new BorderLayout());

		JPanel laminaMenu = new JPanel();

		JMenuBar mibarra = new JMenuBar();

		// ------------------------------------------------------------------

		JMenu fuente = new JMenu("Fuente");

		JMenu estilo = new JMenu("Estilo");

		JMenu tamagno = new JMenu("Tamaño");

		// ----------------------------------------------------------------

		JMenuItem arial = new JMenuItem("Arial");

		arial.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				miarea.setFont(new Font("arial", Font.PLAIN, 12));
			}
		});

		JMenuItem courier = new JMenuItem("Courier");

		courier.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("llega");
				
				miarea.setFont(new Font("courier", Font.PLAIN, 12));
				
			}
		});
		
		// ----------------------Formas de Escuchas de eventos--------------

		// ----- 1 - instanciando el evento y poniendolo a la escucha----

		// Gestiona_menu tipo_letra = new Gestiona_menu();

		// courier.addActionListener(tipo_letra);

		// ---- 2 - instanciando el mentodo gestiona_menu dentro del la escucha
		// addActionListener

		// courier.addActionListener(new Gestiona_menu());

		// -----3 - Utilizando clase interna anonima---------


		JMenuItem verdana = new JMenuItem("Verdana");
		
		

		fuente.add(arial);

		fuente.add(courier);

		fuente.add(verdana);

		// ----------------------------------------------------------------

		JMenuItem negrita = new JMenuItem("Negrita");

		JMenuItem cursiva = new JMenuItem("Cursiva");

		estilo.add(negrita);

		estilo.add(cursiva);

		// -----------------------------------------------------------------

		JMenuItem tam_12 = new JMenuItem("12");

		JMenuItem tam_16 = new JMenuItem("16");

		JMenuItem tam_20 = new JMenuItem("20");

		JMenuItem tam_24 = new JMenuItem("24");

		tamagno.add(tam_12);

		tamagno.add(tam_16);

		tamagno.add(tam_20);

		tamagno.add(tam_24);

		// ------------------------------------------------------------------------

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		laminaMenu.add(mibarra);

		add(laminaMenu, BorderLayout.NORTH);

		// ---------------------------------------------------------------------
		// añadimos panel del texto

		// JTextPane miarea = new JTextPane();
		miarea = new JTextPane();

		add(miarea, BorderLayout.CENTER);

	}

	// -- Clase interna para escuchar eventos

//	private class Gestiona_menu implements ActionListener {
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//
//			System.out.println("llega");
//
//			miarea.setFont(new Font("courier", Font.PLAIN, 24));
//		}
//
//	}

	JTextPane miarea;
}
