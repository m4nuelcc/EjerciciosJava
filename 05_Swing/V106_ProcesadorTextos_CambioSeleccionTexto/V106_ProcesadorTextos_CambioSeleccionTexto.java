package V106_ProcesadorTextos_CambioSeleccionTexto;

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
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class V106_ProcesadorTextos_CambioSeleccionTexto {

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

		configura_menu("Arial", "fuente", "Arial", 1, 10);

		configura_menu("Couriel", "fuente", "Couriel", 1, 10);

		configura_menu("Verdana", "fuente", "Verdana", 1, 10);

		configura_menu("Agency FB", "fuente", "Agency FB", 1, 10);

		// ----------------creando submenu estilo-------------------------

		configura_menu("Normal", "estilo", "", Font.PLAIN, 1);

		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);

		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);

		// ----------------creando submenu tamaño-------------------------
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

	// metodo para añadir mas opciones al menu

	public void configura_menu(String textoDelMenu, String menu, String tipo_letra, int estilos, int tam) {

		JMenuItem elem_menu = new JMenuItem(textoDelMenu);

		if (menu == "fuente") {

			fuente.add(elem_menu);

			if (tipo_letra == "Arial") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Arial"));
				
			} else if (tipo_letra == "Courier") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Courier"));


			} else if (tipo_letra == "Verdana") {
				
				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra","Verdana"));

			}

		} else if (menu == "estilo") {

			estilo.add(elem_menu);

			if (estilos == Font.BOLD) {

				elem_menu.addActionListener(new StyledEditorKit.BoldAction());

			} else if (estilos == Font.ITALIC) {

				elem_menu.addActionListener(new StyledEditorKit.ItalicAction());

			}

		} else if (menu == "tamagno") {

			tamagno.add(elem_menu);

			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", tam));
		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
