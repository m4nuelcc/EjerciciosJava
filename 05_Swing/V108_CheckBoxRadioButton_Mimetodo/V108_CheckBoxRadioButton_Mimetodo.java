package V108_CheckBoxRadioButton_Mimetodo;

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
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class V108_CheckBoxRadioButton_Mimetodo {

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

		tamagno = new JMenu("Tamaņo");

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

		// ----------------creando submenu tamaņo-------------------------
		/*
		 * configura_menu("3", "tamagno", "", 1, 3, "");
		 * 
		 * configura_menu("12", "tamagno", "", 1, 12, "");
		 * 
		 * configura_menu("16", "tamagno", "", 1, 16, "");
		 * 
		 * configura_menu("18", "tamagno", "", 1, 18, "");
		 * 
		 * configura_menu("24", "tamagno", "", 1, 24, "");
		 * 
		 * configura_menu("28", "tamagno", "", 1, 28, "");
		 * 
		 * ButtonGroup tamagnoLetra = new ButtonGroup();
		 * 
		 * JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		 * 
		 * JRadioButtonMenuItem dieciescis = new JRadioButtonMenuItem("16");
		 * 
		 * JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		 * 
		 * JRadioButtonMenuItem venticuatro = new JRadioButtonMenuItem("24");
		 * 
		 * tamagnoLetra.add(doce);
		 * 
		 * tamagnoLetra.add(dieciescis);
		 * 
		 * tamagnoLetra.add(veinte);
		 * 
		 * tamagnoLetra.add(venticuatro);
		 * 
		 * doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaņo",
		 * 12));
		 * 
		 * dieciescis.addActionListener(new
		 * StyledEditorKit.FontSizeAction("cambiarTamaņo", 16));
		 * 
		 * veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaņo",
		 * 20));
		 * 
		 * venticuatro.addActionListener(new
		 * StyledEditorKit.FontSizeAction("cambiarTamaņo", 24));
		 * 
		 * 
		 * tamagno.add(doce);
		 * 
		 * tamagno.add(dieciescis);
		 * 
		 * tamagno.add(veinte);
		 */

		// tamagno.add(venticuatro);

		// ------------------------------------------------------------------

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

	}

	public void CreadorRadionButton(String titulo, int tam) {

		ButtonGroup tamagnoLetra = new ButtonGroup();

		JRadioButtonMenuItem boton = new JRadioButtonMenuItem(titulo);

		tamagnoLetra.add(boton);

		boton.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaņo", tam));

		tamagno.add(boton);

	}

	// metodo para aņadir mas opciones al menu

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
