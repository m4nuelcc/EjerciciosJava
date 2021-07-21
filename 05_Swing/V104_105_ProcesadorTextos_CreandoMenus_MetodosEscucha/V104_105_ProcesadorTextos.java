package V104_105_ProcesadorTextos_CreandoMenus_MetodosEscucha;

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

public class V104_105_ProcesadorTextos {

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

		tamagno = new JMenu("Tama�o");

		// ----------------creando submenu fuente------------------------

		configura_menu("Arial", "fuente", "Arial", 1, 10);

		configura_menu("Couriel", "fuente", "Couriel", 1, 10);

		configura_menu("Verdana", "fuente", "Verdana", 1, 10);

		configura_menu("Agency FB", "fuente", "Agency FB", 1, 10);

		// ----------------creando submenu estilo-------------------------

		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);

		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);
		
		configura_menu("Romana", "estilo", "", Font.ROMAN_BASELINE, 1);
		
		

		// ----------------creando submenu tama�o-------------------------
		configura_menu("3", "tamagno", "", 1, 3);

		configura_menu("12", "tamagno", "", 1, 12);

		configura_menu("16", "tamagno", "", 1, 16);

		configura_menu("18", "tamagno", "", 1, 18);

		configura_menu("24", "tamagno", "", 1, 24);

		configura_menu("28", "tamagno", "", 1, 28);

		// ------------------------------------------------------------------

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		add(mibarra, BorderLayout.NORTH);

		area = new JTextPane();

		add(area, BorderLayout.CENTER);

	}

	// metodo para a�adir mas opciones al menu

	public void configura_menu(String textoDelMenu, String menu, String tipo_letra, int estilos, int tam) {

		JMenuItem elem_menu = new JMenuItem(textoDelMenu);

		if (menu == "fuente") {

			fuente.add(elem_menu);

		} else if (menu == "estilo") {

			estilo.add(elem_menu);

		} else if (menu == "tamagno") {

			tamagno.add(elem_menu);
		}

		elem_menu.addActionListener(new GestionaEventos(textoDelMenu, tipo_letra, estilos, tam));

	}

	private class GestionaEventos implements ActionListener {

		String tipo_letra, textoDelMenu;

		int estilos, tam;

		GestionaEventos(String textoDelMenu, String tipo_letra, int estilos, int tam) {

			this.tipo_letra = tipo_letra;

			this.estilos = estilos;

			this.tam = tam;

			this.textoDelMenu = textoDelMenu;
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			letras = area.getFont();

			if (textoDelMenu == "Arial" || textoDelMenu == "Couriel" || textoDelMenu == "Verdana"
					|| textoDelMenu == "Agency FB") {

				estilos = letras.getStyle();

				tam = letras.getSize();

			} else if (textoDelMenu == "Cursiva" || textoDelMenu == "Negrita"|| textoDelMenu=="Romana") {

				tipo_letra = letras.getFontName();

				tam = letras.getSize();

			} else if (textoDelMenu == "12" || textoDelMenu == "16" || textoDelMenu == "20" || textoDelMenu == "24") {

				estilos = letras.getStyle();

				tipo_letra = letras.getFontName();
			}

			area.setFont(new Font(tipo_letra, estilos, tam));

			System.out.println("tipo " + tipo_letra + " Estilo: " + estilos + " Tama�o:" + tam);

		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
