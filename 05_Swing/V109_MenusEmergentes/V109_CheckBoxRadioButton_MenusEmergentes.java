package V109_MenusEmergentes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class V109_CheckBoxRadioButton_MenusEmergentes {

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

		configura_menu("Arial", "fuente", "Arial", 1, 10, "");

		configura_menu("Couriel", "fuente", "Couriel", 1, 10, "");

		configura_menu("Verdana", "fuente", "Verdana", 1, 10, "");

		configura_menu("Agency FB", "fuente", "Agency FB", 1, 10, "");

		// ----------------creando submenu estilo-------------------------

		JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",
				new ImageIcon("05_Swing/V107_MenusConImagenes/cortar.gif"));

		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",
				new ImageIcon("05_Swing/V107_MenusConImagenes/pegar.gif"));

		negrita.addActionListener(new StyledEditorKit.BoldAction());

		cursiva.addActionListener(new StyledEditorKit.ItalicAction());

		estilo.add(negrita);

		estilo.add(cursiva);

		CreadorRadionButton("12", 12);
		CreadorRadionButton("14", 14);
		CreadorRadionButton("16", 16);
		CreadorRadionButton("18", 18);

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		add(mibarra, BorderLayout.NORTH);

		area = new JTextPane();

		add(area, BorderLayout.CENTER);

		JPopupMenu emergente = new JPopupMenu();

		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem curisvaE = new JMenuItem("Cursiva");


		emergente.add(negritaE);
		emergente.add(curisvaE);
		
		negrita.addActionListener(new StyledEditorKit.BoldAction());

		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
	

		area.setComponentPopupMenu(emergente);

	}

	public void CreadorRadionButton(String titulo, int tam) {

		ButtonGroup tamagnoLetra = new ButtonGroup();

		JRadioButtonMenuItem boton = new JRadioButtonMenuItem(titulo);

		tamagnoLetra.add(boton);

		boton.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", tam));

		tamagno.add(boton);

	}

	// metodo para añadir mas opciones al menu

	public void configura_menu(String textoDelMenu, String menu, String tipo_letra, int estilos, int tam, String ruta) {

		JMenuItem elem_menu = new JMenuItem(textoDelMenu, new ImageIcon(ruta));

		if (menu == "fuente") {

			fuente.add(elem_menu);

			if (tipo_letra == "Arial") {

				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));

			} else if (tipo_letra == "Courier") {

				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Courier"));

			} else if (tipo_letra == "Verdana") {

				elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));

			}

		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
