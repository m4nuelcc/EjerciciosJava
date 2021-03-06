package V113_Barra_De_Herramientas_III;

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

public class V113_Barra_De_Herramientas_III {

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

		tamagno = new JMenu("Tama?o");

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

		// ----------------creando submenu tama?o-------------------------


		ButtonGroup tamagnoLetra = new ButtonGroup();

		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");

		JRadioButtonMenuItem dieciescis = new JRadioButtonMenuItem("16");

		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");

		JRadioButtonMenuItem venticuatro = new JRadioButtonMenuItem("24");

		tamagnoLetra.add(doce);

		tamagnoLetra.add(dieciescis);

		tamagnoLetra.add(veinte);

		tamagnoLetra.add(venticuatro);

		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTama?o", 12));

		dieciescis.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTama?o", 16));

		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTama?o", 20));

		venticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTama?o", 24));

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

		JToolBar barra = new JToolBar();

		JButton negritaBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/negrita.gif"));

		barra.add(negritaBarra);

		JButton cursivaBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/cursiva.gif"));
		
		barra.add(cursivaBarra);

		JButton subrayadoBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/subrayado.gif"));
		
		barra.add(subrayadoBarra);
		
		JButton azulBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/azul.gif"));
		
		barra.add(azulBarra);
		
		JButton amarillodoBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/amarillo.gif"));
		
		barra.add(amarillodoBarra);
		
		JButton rojoBarra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/rojo.gif"));
		
		barra.add(rojoBarra);
		
		JButton alin_izquierda_Barra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/alin_izq.gif"));
		
		barra.add(alin_izquierda_Barra);
		
		JButton alin_derecha_Barra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/alin_der.gif"));
		
		barra.add(alin_derecha_Barra);
		
		JButton alin_centro_Barra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/alin_cent.gif"));
		
		barra.add(alin_centro_Barra);
		
		JButton alin_texto_Barra = new JButton(
				new ImageIcon("06_Aplicaciones_Graficas/V113_Barra_De_Herramientas_III/alin_texto.gif"));
		
		barra.add(alin_texto_Barra);
		
		
		//Acciones de Alineacion
		
		alin_izquierda_Barra.addActionListener(new StyledEditorKit.AlignmentAction("izquierda", 0));

		alin_centro_Barra.addActionListener(new StyledEditorKit.AlignmentAction("centrado", 1));
		
		alin_derecha_Barra.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));
		
		alin_texto_Barra.addActionListener(new StyledEditorKit.AlignmentAction("justificado", 3));
	
		//Acciones de Colores				
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.BLUE));

		amarillodoBarra.addActionListener(new StyledEditorKit.ForegroundAction("amarilo", Color.YELLOW));

		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));
		
		

		//Acciones de Estilos
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());

		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		
		subrayadoBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		

		barra.setOrientation(1); // pone barra vertical

		add(barra, BorderLayout.WEST);

		
	}

	// metodo para a?adir mas opciones al menu

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

			elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambiarTama?o", tam));
		}

	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
