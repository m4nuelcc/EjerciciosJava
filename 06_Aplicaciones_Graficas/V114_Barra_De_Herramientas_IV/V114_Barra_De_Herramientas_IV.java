package V114_Barra_De_Herramientas_IV;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.ItalicAction;

public class V114_Barra_De_Herramientas_IV {

	public static void main(String[] args) {

		MarcoMenu miMarco = new MarcoMenu();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoMenu extends JFrame {

	public MarcoMenu() {

		setBounds(600, 300, 300, 400);

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
				new ImageIcon("06_Aplicaciones_Graficas/V112_Barra_De_Herramientas_II/negrita.gif"));

		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",
				new ImageIcon("06_Aplicaciones_Graficas/V112_Barra_De_Herramientas_II/cursiva.gif"));

		JCheckBoxMenuItem subrayado = new JCheckBoxMenuItem("Subrayado",
				new ImageIcon("06_Aplicaciones_Graficas/V112_Barra_De_Herramientas_II/subrayado.gif"));

		negrita.addActionListener(new StyledEditorKit.BoldAction());

		cursiva.addActionListener(new StyledEditorKit.ItalicAction());

		subrayado.addActionListener(new StyledEditorKit.UnderlineAction());

		// Atajos de teclado

		negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

		cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));

		estilo.add(negrita);

		estilo.add(cursiva);

		estilo.add(subrayado);

		// ----------------creando submenu tamaño-------------------------

		ButtonGroup tamagnoLetra = new ButtonGroup();

		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");

		JRadioButtonMenuItem dieciescis = new JRadioButtonMenuItem("16");

		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");

		JRadioButtonMenuItem venticuatro = new JRadioButtonMenuItem("24");

		tamagnoLetra.add(doce);

		tamagnoLetra.add(dieciescis);

		tamagnoLetra.add(veinte);

		tamagnoLetra.add(venticuatro);

		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 12));

		dieciescis.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 16));

		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 20));

		venticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", 24));

		tamagno.add(doce);

		tamagno.add(dieciescis);

		tamagno.add(veinte);

		tamagno.add(venticuatro);

		// ------------------------------------------------------------------

		mibarra.add(fuente);

		mibarra.add(estilo);

		mibarra.add(tamagno);

		add(mibarra, BorderLayout.NORTH);

		area = new JTextPane();

		add(area, BorderLayout.CENTER);

		// creacion Barra de Herramientas

		barra = new JToolBar();

		// Acciones de Estilos

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/negrita.gif")
				.addActionListener(new StyledEditorKit.BoldAction());

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/cursiva.gif")
				.addActionListener(new StyledEditorKit.ItalicAction());

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/subrayado.gif")
				.addActionListener(new StyledEditorKit.UnderlineAction());
		
		barra.addSeparator();

		// Acciones de colores

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/azul.gif")
				.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/amarillo.gif")
				.addActionListener(new StyledEditorKit.ForegroundAction("amarillo", Color.YELLOW));

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/rojo.gif")
				.addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));
		
		barra.addSeparator();

		// Acciones de Alineacion

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/alin_izq.gif")
				.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/alin_der.gif")
				.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/alin_cent.gif")
				.addActionListener(new StyledEditorKit.AlignmentAction("centro", 1));

		configuraBarraHerramintas("06_Aplicaciones_Graficas/V114_Barra_De_Herramientas_IV/alin_texto.gif")
				.addActionListener(new StyledEditorKit.AlignmentAction("alineado", 3));

		barra.addSeparator();
		

		barra.setOrientation(1); // pone barra vertical

		add(barra, BorderLayout.WEST);

	}

	// metodo para crear los botones de la barra de herramientas

	public JButton configuraBarraHerramintas(String ruta) {

		JButton boton = new JButton(new ImageIcon(ruta));

		barra.add(boton);

		return boton;
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

		} else if (menu == "tamagno") {

			tamagno.add(elem_menu);

			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTamaño", tam));
		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

	JToolBar barra;
	JButton negritaBarra, cursivaBarra, subrayadoBarra, azulBarra, amarilloBarra, rojoBarra, a_Izquieda, a_Derecha,
			a_centro, a_justificado;

}
