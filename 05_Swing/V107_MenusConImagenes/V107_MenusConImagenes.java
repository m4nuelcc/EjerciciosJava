package V107_MenusConImagenes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class V107_MenusConImagenes {

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

		JMenuBar mibarra = new JMenuBar();
		
		JTextPane Mipanel = new JTextPane();

		// Menu Archivo
		JMenu archivo = new JMenu("Archivo");
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardarComo = new JMenuItem("Guardar Como");
		archivo.add(guardar);
		archivo.add(guardarComo);

		// Menu Edicion
		JMenu edicion = new JMenu("Edicion");
		JMenuItem cortar = new JMenuItem("Cortar",new ImageIcon("05_Swing/V107_MenusConImagenes/cortar.gif"));
		JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("05_Swing/V107_MenusConImagenes/copiar.gif"));
		JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("05_Swing/V107_MenusConImagenes/pegar.gif"));
		//cambiar la imagen a la derecha
		pegar.setHorizontalTextPosition(SwingConstants.LEFT);
		
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		edicion.addSeparator();
		
		// Creacion de submenu de Edicion
		JMenu opciones = new JMenu("Opciones");
		JMenuItem opcion1 = new JMenuItem("opcion1");
		JMenuItem opcion2 = new JMenuItem("opcion2");
		opciones.add(opcion1);
		opciones.add(opcion2);
		edicion.add(opciones);

		// Menu Herramientas
		JMenu herramientas = new JMenu("Herramientas");
		JMenuItem generales = new JMenuItem("Generales");
		herramientas.add(generales);

		// Añadimos los menus a la barra de menus
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);

		add(mibarra, BorderLayout.NORTH);
		add(Mipanel, BorderLayout.CENTER);
		
		
		

	}

}
