package V111_A_Graficas_Barras_De_Herramientas;

import java.awt.*;

import java.awt.event.ActionEvent;

import javax.swing.*;

public class V111_A_Graficas_Barras_De_Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Barra mimarco = new Marco_Barra();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		mimarco.setVisible(true);

	}

}

class Marco_Barra extends JFrame {

	public Marco_Barra() {

		setTitle("Marco con Barra");

		setBounds(500, 300, 600, 450);

		lamina = new JPanel();

		add(lamina);

		// configuración de acciones

		Action accionAzul = new AccionColor("Azul", new ImageIcon("06_Aplicaciones_Graficas/V111_A_Graficas_Barras_De_Herramientas/azul.gif"), Color.BLUE);

		Action accionAmarillo = new AccionColor("Amarillo", new ImageIcon("06_Aplicaciones_Graficas/V111_A_Graficas_Barras_De_Herramientas/amarillo.gif"),
				Color.YELLOW);

		Action accionRojo = new AccionColor("Rojo", new ImageIcon("06_Aplicaciones_Graficas/V111_A_Graficas_Barras_De_Herramientas/rojo.gif"), Color.RED);

		JMenu menu = new JMenu("Color");
		
		
		Action accionSalir = new AbstractAction("salir", new ImageIcon("06_Aplicaciones_Graficas/V111_A_Graficas_Barras_De_Herramientas/salir.gif")) {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			System.exit(0);
				
			}
			
		};

		menu.add(accionAzul);

		menu.add(accionAmarillo);

		menu.add(accionRojo);

		JMenuBar barraMenu = new JMenuBar();

		barraMenu.add(menu);
		
		setJMenuBar(barraMenu);
		

		

		// construccion de la barra de herramientas
		
		
		JToolBar barra = new JToolBar();
		
		barra.add(accionAzul);
		
		barra.add(accionAmarillo);
		
		barra.add(accionRojo);
		
		barra.addSeparator();
		
		barra.add(accionSalir);
		
		add(barra, BorderLayout.NORTH);
		

	}

	private class AccionColor extends AbstractAction {

		public AccionColor(String nombre, Icon icono, Color c) {

			putValue(Action.NAME, nombre);

			putValue(Action.SMALL_ICON, icono);

			putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);

			putValue("Color", c);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub

			Color c = (Color) getValue("Color");

			lamina.setBackground(c);

		}

	}

	private JPanel lamina;
}
