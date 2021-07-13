package V76_79_EventosDeFoco_II_Botonnes_Teclas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.security.KeyStore;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class V76_EventosDeFocoMultiplesConTeclas {

	public static void main(String[] args) {

		MarcoAccion miMarco = new MarcoAccion();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoAccion extends JFrame {

	public MarcoAccion() {

		setVisible(true);
		setTitle("prueba Acciones");
		setBounds(300, 300, 600, 450);

//		add(new PanelAccion());
		PanelAccion miLamina = new PanelAccion();
		add(miLamina);
	}

}

class PanelAccion extends JPanel {

	public PanelAccion() {


		AccionColors accionAmarillo = new AccionColors("Amarillos", Color.YELLOW);
		AccionColors accionAzul = new AccionColors("Azul", Color.BLUE);
		AccionColors accionRojo = new AccionColors("Rojo", Color.RED);
				
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		JButton botonclick= new JButton();
		botonclick.setText("click");
		botonclick.setMnemonic('k');
		botonclick.setForeground(Color.BLUE);
		add(botonclick);
		
		// asignacion de  teclas a los botones
		
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		//mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillos");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_amarillos", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
	}

	private class AccionColors extends AbstractAction {

		// public AccionColor(String nombre, Icon icono, Color color_boton) { //he
		// kitado icono de momento porque no logro que fucione
		
		public AccionColors(String nombre, Color color_boton) {

			putValue(Action.NAME, nombre);
			
		 // putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color" + nombre);
			
			putValue("color_de_fondo", color_boton);
		}

		public void actionPerformed(ActionEvent e) {

			Color c = (Color) getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre: "+getValue(Action.NAME) + "Descripcion: "+ getValue(Action.SHORT_DESCRIPTION));

		}

	}

}


















//		JButton botonAmarillo= new JButton("Amarillo");
//		JButton botonAzul= new JButton("Azul");
//		JButton botonRojo= new JButton("Rojo");
//		
//		add(botonAmarillo);
//		add(botonAzul);
//		add(botonRojo);

//		AccionColor accionAmarillo = new AccionColor("Amarillo",
//				new ImageIcon("04_Eventos/V76_EventosDeFoco_II/icono.gif"), Color.YELLOW);
//		AccionColor accionAzul = new AccionColor("Azul",
//				new ImageIcon("04_Eventos/V76_EventosDeFoco_II/icono.gif"), Color.BLUE);
//		AccionColor accionRojo = new AccionColor("Rojo",
//				new ImageIcon("04_Eventos/V76_EventosDeFoco_II/icono.gif"), Color.RED);
//		
//		JButton botonAmarillo = new JButton(accionAmarillo);
//		add(botonAmarillo);