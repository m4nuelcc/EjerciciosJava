package V123_Ejercicio_Practico_I;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;
import java.util.Date;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Pantalla_Grid.Lamina_Botones;

public class V123_Marco_dialogos extends JFrame {

	public V123_Marco_dialogos() {

		setTitle("Prueba Dialogos");

		setBounds(500, 300, 600, 450);

		// lamina_Cuadricula.setLayout(new GridLayout(2, 3));

		JPanel lamina_Cuadricula = new JPanel(new GridLayout(2, 3));

		// ------creacion de las laminas con los radioButton y con bordes-------

		String primero[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_Tipo = new V123_Lamina_Botones("Tipo de Ventana", primero);

		String segundo[] = {

				"ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE" };

		lamina_Tipo_mensaje = new V123_Lamina_Botones("Tipo de Mensaje", segundo);

		String tercero[] = { "Cadena", "Icono", "Componente", "Otros", "Object[]" };

		lamina_mensaje = new V123_Lamina_Botones("Mensaje", tercero);

		String cuarto[] = { "DEFAULT_OPTION", "YES_NO_OPCION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" };

		lamina_confirmar = new V123_Lamina_Botones("Confirmar", cuarto);

		String quinto[] = { "String[]", "Icon[]", "Object[]" };

		lamina_opcion = new V123_Lamina_Botones("Opcion", quinto);

		String sexto[] = { "Campo de texto", "Combo" };

		lamina_entrada = new V123_Lamina_Botones("Entrada", sexto);

		// --------añadiendo laminas a la lamina de cuadricula------------------

		lamina_Cuadricula.add(lamina_Tipo);

		lamina_Cuadricula.add(lamina_Tipo_mensaje);

		lamina_Cuadricula.add(lamina_mensaje);

		lamina_Cuadricula.add(lamina_confirmar);

		lamina_Cuadricula.add(lamina_opcion);

		lamina_Cuadricula.add(lamina_entrada);

		// ---------------- contruimos la lamina inferior----------------------

		setLayout(new BorderLayout());

		JPanel lamina_motrar = new JPanel();

		JButton boton_mostrar = new JButton("Mostrar");

		boton_mostrar.addActionListener(new AccionMostrar());

		lamina_motrar.add(boton_mostrar);

		add(lamina_motrar, BorderLayout.SOUTH);

		// ------------- añadiendo la lamina cuadricula al marco-----------------

		add(lamina_Cuadricula, BorderLayout.CENTER);

	}

	// -----Metodo que nos devuelve lo que seleccionamos en lamina mensaje-------

	public Object dameMensaje() {

		String mensaje = lamina_mensaje.dameSeleccion();

		if (mensaje.equals("Cadena")) {

			return cadenaMensaje;

		} else if (mensaje.equals("Icono")) {

			return iconoMensaje;

		} else if (mensaje.equals("Componente")) {

			return ComponenteMensaje;

		} else if (mensaje.equals("Otros")) {

			return objetoMensaje;
		} else if (mensaje.equals("Object[]")) {

			return new Object[] { cadenaMensaje, iconoMensaje, ComponenteMensaje, objetoMensaje };
		} else {

			return null;
		}

	}

	// -----Metodo que nos devuelve nombre de la lamina selecionada---

	public int dameTipoLamina(V123_Lamina_Botones laminas) {

		String s = laminas.dameSeleccion();

		if (s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {

			System.out.println(s);
			return 0;

		} else if (s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
			System.out.println(s);

			return 1;

		} else if (s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")) {

			return 2;

		} else if (s.equals("QUESTION_MESSAGE")) {
			System.out.println(s);
			return 3;

		} else if (s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")) {
			System.out.println(s);

			return -1;
		} else {
			System.out.println(s);
			return 0;
		}

	}

	// ------------DA LAS OPCIONES DE LA LAMINA OPCION------------------------

	public Object[] dameOpciones(V123_Lamina_Botones lamina) {

		String s = lamina.dameSeleccion();

		if (s.equals("String[]")) {

			return new String[] { "Amarillo", "rojo", "azul" };
		} else if (s.equals("Icon[]")) {

			return new Object[] { new ImageIcon("09_Ejercicio_Practico/V123_Ejercicio_Practico_I/azul.gif"),
					new ImageIcon("09_Ejercicio_Practico/V123_Ejercicio_Practico_I/rojo.gif"),
					new ImageIcon("09_Ejercicio_Practico/V123_Ejercicio_Practico_I/amarillo.gif") };

		}else if(s.equals("Object[]")) {
			
			return new Object[] {cadenaMensaje,ComponenteMensaje,objetoMensaje};
		} else {

			return null;
		}

	}

	// -----------Boton mostrar que valida lo que tiene la lamina tipo---------

	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(lamina_Tipo.dameSeleccion());

			if (lamina_Tipo.dameSeleccion().equals("Mensaje")) {

				JOptionPane.showMessageDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo",
						dameTipoLamina(lamina_Tipo_mensaje));

			} else if (lamina_Tipo.dameSeleccion().equals("Confirmar")) {

				JOptionPane.showConfirmDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo",
						dameTipoLamina(lamina_confirmar), dameTipoLamina(lamina_Tipo_mensaje));

			} else if (lamina_Tipo.dameSeleccion().equals("Entrada")) {
				
				if(lamina_entrada.dameSeleccion().equals("Campo de texto")) {
					
					JOptionPane.showInputDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo",
							dameTipoLamina(lamina_Tipo_mensaje));
					
				}else if (lamina_entrada.dameSeleccion().equals("Combo")) {
					
					JOptionPane.showInputDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo",
							dameTipoLamina(lamina_Tipo_mensaje),null,new String[] {"amarillo","azul","rojo"},"azul");
				}
				
				

			} else if (lamina_Tipo.dameSeleccion().equals("Opcion")) {

				JOptionPane.showOptionDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo", 1,
						dameTipoLamina(lamina_Tipo_mensaje), null, dameOpciones(lamina_opcion), null);

			}

		}

	}

	private V123_Lamina_Botones lamina_Tipo, lamina_Tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion,
			lamina_entrada;

	private String cadenaMensaje = "mensaje";

	private Icon iconoMensaje = new ImageIcon("09_Ejercicio_Practico/V123_Ejercicio_Practico_I/azul.gif");

	private Object objetoMensaje = new Date();

	private Component ComponenteMensaje = new LaminaEjemplo();

}

//--------------Lamina para pintar dentro de las ventanas emergentes--------------------

class LaminaEjemplo extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());

		g2.setPaint(Color.YELLOW);

		g2.fill(rectangulo);
	}

}

/*---------------------CODIGO ANTIGUO------------------------------------
 * ASi es el codigo antes de ponerle el metodo dameMensaje
 * 
 * private class AccionMostrar implements ActionListener {
 * 
 * @Override public void actionPerformed(ActionEvent e) {
 * 
 * // System.out.println(lamina_Tipo.dameSeleccion());
 * 
 * if (lamina_Tipo.dameSeleccion().equals("Mensaje")) {
 * 
 * //ventana emergentes JOptionPane.showMessageDialog(V123_Marco_dialogos.this,
 * "Mensaje", "Titulo", 0);
 * 
 * } else if (lamina_Tipo.dameSeleccion().equals("Confirmar")) {
 * 
 * int datos=JOptionPane.showConfirmDialog(V123_Marco_dialogos.this, "Mensaje",
 * "Titulo", 0, 0);
 * 
 * System.out.println(datos);
 * 
 * 
 * } else if (lamina_Tipo.dameSeleccion().equals("Entrada")) {
 * 
 * String datos=JOptionPane.showInputDialog(V123_Marco_dialogos.this, "Mensaje",
 * "Titulo", 0);
 * 
 * System.out.println(datos);
 * 
 * } else if (lamina_Tipo.dameSeleccion().equals("Opcion")) {
 * 
 * int datos=JOptionPane.showOptionDialog(V123_Marco_dialogos.this, "Mesaje",
 * "Titulo", 0, 0, null, null, null);
 * 
 * System.out.println(datos); }
 * 
 * }
 * 
 * }
 * 
 * *****************************************************************************
 * 
 * 	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(lamina_Tipo.dameSeleccion());

			if (lamina_Tipo.dameSeleccion().equals("Mensaje")) {

				JOptionPane.showMessageDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo",
						dameIconoTipoMensaje());

			} else if (lamina_Tipo.dameSeleccion().equals("Confirmar")) {

				JOptionPane.showConfirmDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo", dameConfirmar(),
						dameIconoTipoMensaje());

			} else if (lamina_Tipo.dameSeleccion().equals("Entrada")) {

				JOptionPane.showInputDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo", dameIconoTipoMensaje());

			} else if (lamina_Tipo.dameSeleccion().equals("Opcion")) {

				JOptionPane.showOptionDialog(V123_Marco_dialogos.this, dameMensaje(), "Titulo", 0,dameIconoTipoMensaje(), null, null, null);

			}

		}

	}
	
	****************************************************************************
	public int dameConfirmar() {

		String tipomensaje = lamina_confirmar.dameSeleccion();

		int valor = 0;

		if (tipomensaje.equals("DEFAULT_OPTION")) {

			valor = -1;

		} else if (tipomensaje.equals( "YES_NO_OPCION")) {

			valor = 0;

		} else if (tipomensaje.equals("YES_NO_CANCEL_OPTION")) {

			valor = 1;

		} else if (tipomensaje.equals("OK_CANCEL_OPTION")) {

			valor = 2;

		}
		return valor;

	}

 */
