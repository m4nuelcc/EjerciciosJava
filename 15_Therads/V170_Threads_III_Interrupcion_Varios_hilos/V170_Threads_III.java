package V170_Threads_III_Interrupcion_Varios_hilos;

import java.awt.geom.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class V170_Threads_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco = new MarcoRebote();

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco.setVisible(true);

	}

}

//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota {

	// Mueve la pelota invirtiendo posición si choca con límites

	public void mueve_pelota(Rectangle2D limites) {

		x += dx;

		y += dy;

		if (x < limites.getMinX()) {

			x = limites.getMinX();

			dx = -dx;
		}

		if (x + TAMX >= limites.getMaxX()) {

			x = limites.getMaxX() - TAMX;

			dx = -dx;
		}

		if (y < limites.getMinY()) {

			y = limites.getMinY();

			dy = -dy;
		}

		if (y + TAMY >= limites.getMaxY()) {

			y = limites.getMaxY() - TAMY;

			dy = -dy;

		}

	}

	// Forma de la pelota en su posición inicial

	public Ellipse2D getShape() {

		return new Ellipse2D.Double(x, y, TAMX, TAMY);

	}

	private static final int TAMX = 15;

	private static final int TAMY = 15;

	private double x = Math.random() * 1000;

	private double y = Math.random() * 100;

	private double dx = 1;

	private double dy = 1;

}

// Lámina que dibuja las pelotas----------------------------------------------------------------------

class LaminaPelota extends JPanel {

	// Añadimos pelota a la lámina

	public void add(Pelota b) {

		pelotas.add(b);

	}

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		for (Pelota b : pelotas) {

			g2.fill(b.getShape());
		}

	}

	private ArrayList<Pelota> pelotas = new ArrayList<Pelota>();
}

//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

	public MarcoRebote() {

		setBounds(600, 300, 600, 350);

		setTitle("Rebotes");

		lamina = new LaminaPelota();

		add(lamina, BorderLayout.CENTER);

		JPanel laminaBotones = new JPanel();

		// BOTONES HILO
		hilo1 = new JButton("hilo1");
		hilo2 = new JButton("hilo2");
		hilo3 = new JButton("hilo3");

		// BOTONES DETENER HILOS

		pararhilo1 = new JButton("parar hilo1");
		pararhilo2 = new JButton("parar hilo2");
		pararhilo3 = new JButton("parar hilo3");

		// ESCUCHA BOTONES HILO

		hilo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				comienza_el_juego(e);

			}
		});

		hilo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				comienza_el_juego(e);

			}
		});

		hilo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				comienza_el_juego(e);

			}
		});

		// ESCUCHA LOS BOTONES DE PARAR HILOS
		pararhilo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent p) {

				parar_Hilo(p);

			}
		});
		
		pararhilo2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent p) {

				parar_Hilo(p);

			}
		});
		
		pararhilo3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent p) {

				parar_Hilo(p);

			}
		});

		// AÑADIR LOS BOTONES

		laminaBotones.add(hilo1);
		laminaBotones.add(hilo2);
		laminaBotones.add(hilo3);

		laminaBotones.add(pararhilo1);
		laminaBotones.add(pararhilo2);
		laminaBotones.add(pararhilo3);

		add(laminaBotones, BorderLayout.SOUTH);
	}

	// CREACION DEL HILO

	class PelotaHilos implements Runnable {

		public PelotaHilos(Pelota unaPelota, Component unComponent) {

			pelota = unaPelota;

			componente = unComponent;
		}

		public void run() {

			System.out.println("Estado el hilo al comenzar: " + Thread.currentThread().interrupted());

			// for (int i = 1; i <= 3000; i++) {

			// while(!Thread.interrupted()) { //mientras no este interrumpido

			while (!Thread.currentThread().isInterrupted()) {

				pelota.mueve_pelota(componente.getBounds());

				componente.paint(componente.getGraphics());

				try {

					Thread.sleep(4);

				} catch (Exception e) {

					//e.printStackTrace();
					Thread.currentThread().interrupt();
					
				}

			}
			System.out.println("Estado el hilo al comenzar: " + Thread.currentThread().interrupted());

		}

		private Pelota pelota;

		private Component componente;

	}

	// Añade pelota y la bota 1000 veces

	public void comienza_el_juego(ActionEvent e) {

		Pelota pelota = new Pelota();

		lamina.add(pelota);

		Runnable r = new PelotaHilos(pelota, lamina);

		// UTILIZAMOS EL HILO

		if (e.getSource().equals(hilo1)) {

			h1 = new Thread(r);

			h1.start();

		} else if (e.getSource().equals(hilo2)) {

			h2 = new Thread(r);

			h2.start();

		} else if (e.getSource().equals(hilo3)) {

			h3 = new Thread(r);

			h3.start();

		}

	}

	public void parar_Hilo(ActionEvent p) {


		if (p.getSource().equals(pararhilo1)) {

			System.out.println("llega parar hilo1");
			h1.interrupt();
			
		}else if (p.getSource().equals(pararhilo2)) {
			
			System.out.println("llega parar hilo2");

			h2.interrupt();
			
		}else if (p.getSource().equals(pararhilo3)) {

			h3.interrupt();
		}

	}

	JButton hilo1, hilo2, hilo3, pararhilo1, pararhilo2, pararhilo3;
	Thread h1, h2, h3;
	private LaminaPelota lamina;

}

// Ponemos botones

/*
 * public void ponerBoton(Container c, String titulo, ActionListener oyente) {
 * 
 * JButton boton = new JButton(titulo);
 * 
 * c.add(boton);
 * 
 * boton.addActionListener(oyente);
 * 
 * 
 * ponerBoton(laminaBotones, "Dale!", new ActionListener() {
 * 
 * public void actionPerformed(ActionEvent evento) {
 * 
 * comienza_el_juego(); }
 * 
 * });
 * 
 * ponerBoton(laminaBotones, "Salir", new ActionListener() {
 * 
 * public void actionPerformed(ActionEvent evento) {
 * 
 * System.exit(0);
 * 
 * }
 * 
 * });
 * 
 * ponerBoton(laminaBotones, "Parar Hilo", new ActionListener() {
 * 
 * public void actionPerformed(ActionEvent evento) {
 * 
 * parar_Hilo();
 * 
 * }
 * 
 * });
 */