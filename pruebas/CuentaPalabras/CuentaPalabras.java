package CuentaPalabras;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class CuentaPalabras {

	public static void main(String[] args) {

		Marco miMarco = new Marco();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco extends JFrame {

	public Marco() {

		setTitle("Cuenta palabras");

		// setLayout(new BorderLayout());

		setBounds(700, 300, 500, 500);

		Lamina1 miLamina1 = new Lamina1();

		add(miLamina1);

		setVisible(true);
	}

}

class Lamina1 extends JPanel {

	public Lamina1() {

		setLayout(new BorderLayout());

		// Creacion de introdiccion de texto y botones

		texto = new JTextPane();

		contarPalabras = new JButton("Contar Palabras");

		salir = new JButton("Salir");

		JPanel lamina2 = new JPanel();

		add(texto, BorderLayout.CENTER);

		add(lamina2, BorderLayout.SOUTH);

		lamina2.add(contarPalabras);

		lamina2.add(salir);

		// Escucha de los Botones

		contarPalabras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				HashMap<String, Integer> Diccionario2 = new HashMap<String, Integer>();
						
				PalabrasRepetidas(texto);
				
				Diccionario2 = PalabrasRepetidas(texto);
				
				for (String clave: Diccionario2.keySet()) {
					
					int valor = Diccionario2.get(clave);
					
					System.out.println( clave+ ": "+ valor);
					
				}
				
				
				
				
					
			}
		});
		
		salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(ABORT);
				
			}
		});

	}
	
	
	//metodo para contar palabras
	
	public static HashMap<String, Integer> PalabrasRepetidas(JTextPane texto) {

		HashMap<String, Integer> Diccionario = new HashMap<String, Integer>();
		
		String frase2 = texto.getText().replaceAll("[!·$%&/()=?¿/*-+.-.,´ç`+{}]", "");
		
		String[] FraseLimpia = frase2.split(" ");

		for (String a : FraseLimpia) {

			if (Diccionario.containsKey(a)) {

				int total = Diccionario.get(a) + 1;

				Diccionario.put(a, total);

			} else {

				Diccionario.put(a, 1);

			}

		}

		return Diccionario;
	}

	JTextPane texto;

	JButton contarPalabras, salir;

	HashMap<String, Integer> Diccionario;
}
