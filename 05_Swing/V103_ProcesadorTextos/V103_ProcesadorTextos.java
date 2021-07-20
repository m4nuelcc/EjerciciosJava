package V103_ProcesadorTextos;

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

public class V103_ProcesadorTextos {

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

		fuente = new JMenu("Fuente");

		estilo = new JMenu("Estilo");

		tamagno = new JMenu("Tamaño");

		// ----------------creando submenu fuente------------------------

		configura_menu("Arial", "fuente", "", 1, 1);

		configura_menu("Couriel", "fuente", "", 1, 1);

		configura_menu("Verdana", "fuente", "", 1, 1);

		// ----------------creando submenu estilo-------------------------

		configura_menu("Cursiva", "estilo", "", 1, 1);

		configura_menu("Negrita", "estilo", "", 1, 1);

		// ----------------creando submenu tamaño-------------------------

		configura_menu("12", "tamagno", "", 1, 1);

		configura_menu("16", "tamagno", "", 1, 1);
		
		configura_menu("18", "tamagno", "", 1, 1);
		
		configura_menu("24", "tamagno", "", 1, 1);

		// ------------------------------------------------------------------

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		add(mibarra, BorderLayout.NORTH);

		area = new JTextPane();

		add(area, BorderLayout.CENTER);

	}

	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tam) {

		JMenuItem elem_menu = new JMenuItem(rotulo);

		if (menu == "fuente") {

			fuente.add(elem_menu);

		} else if (menu == "estilo") {

			estilo.add(elem_menu);

		} else if (menu == "tamagno") {

			tamagno.add(elem_menu);
		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
