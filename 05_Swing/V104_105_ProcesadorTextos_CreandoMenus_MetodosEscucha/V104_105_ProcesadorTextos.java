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

		tamagno = new JMenu("Tamaño");

		// ----------------creando submenu fuente------------------------

		configura_menu("Arial", "fuente", "Arial", 9, 10);

		configura_menu("Couriel", "fuente", "Couriel", 9, 10);

		configura_menu("Verdana", "fuente", "Verdana", 9, 10);

		// ----------------creando submenu estilo-------------------------

		configura_menu("Negrita", "estilo", "", Font.BOLD, 1);

		configura_menu("Cursiva", "estilo", "", Font.ITALIC, 1);

		// ----------------creando submenu tamaño-------------------------

		configura_menu("12", "tamagno", "", 1, 12);

		configura_menu("16", "tamagno", "", 1, 16);
		
		configura_menu("18", "tamagno", "", 1, 18);
		
		configura_menu("24", "tamagno", "", 1, 24);

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
		
		elem_menu.addActionListener(new GestionaEventos(rotulo, tipo_letra, estilos, tam));

	}
	
	private class GestionaEventos implements ActionListener{
		
		String tipo_texto, menu;
		
		int estilo_letra, tamagno_letra;
		
		GestionaEventos(String elemento, String texto2, int estilo2, int tam_letra){
			
			tipo_texto = texto2;
			
			estilo_letra= estilo2;
			
			tamagno_letra=tam_letra;
			
			menu= elemento;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
		letras=area.getFont();	
		
		if(menu=="Arial" || menu=="Couriel" || menu=="Verdana") {
			
			estilo_letra= letras.getStyle();
			
			tamagno_letra=letras.getSize();
			
		}else if (menu=="Cursiva"||menu=="Negrita") {
			
			tipo_texto=letras.getFontName();
			
			tamagno_letra=letras.getSize();
			
		}else if(menu=="12"||menu=="16"||menu=="20"||menu=="24") {
			
			estilo_letra=letras.getStyle();
			
			tipo_texto=letras.getFontName();
		}
		
			
	    area.setFont(new Font(tipo_texto,estilo_letra,tamagno_letra));
	    
	    System.out.println("tipo " + tipo_texto + " Estilo: "+ estilo_letra+ " Tamaño:" + tamagno_letra);
			
		}
		
	}

	JTextPane area;
	JMenu fuente, estilo, tamagno;
	Font letras;

}
