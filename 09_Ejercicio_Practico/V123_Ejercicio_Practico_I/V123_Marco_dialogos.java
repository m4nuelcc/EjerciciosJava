package V123_Ejercicio_Practico_I;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V123_Marco_dialogos extends JFrame {

	public V123_Marco_dialogos() {

		setTitle("Prueba Dialogos");

		setBounds(500, 300, 600, 450);

		//	lamina_Cuadricula.setLayout(new GridLayout(2, 3));
		
		JPanel lamina_Cuadricula = new JPanel(new GridLayout(2, 3));

		

		//creacion de las laminas con los radioButton y con bordes

		String primero[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_Tipo = new V123_Lamina_Botones("Tipo", primero);
		
	

		String segundo[] = { "ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE",
				"PLAIN_MESSAGE" };

		lamina_Tipo_mensaje = new V123_Lamina_Botones("Tipo de Mensaje", segundo);

		String tercero[] = { "Cadena", "Icono", "Componente", "Otros", "Object[]" };

		lamina_mensaje = new V123_Lamina_Botones("Mensaje", tercero);

		String cuarto[] = { "DEFAULT_OPTION", "YES_NO_OPCION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION" };

		lamina_confirmar = new V123_Lamina_Botones("Confirmar", cuarto);

		String quinto[] = { "String[]", "Icon[]", "Object[]" };

		lamina_opcion = new V123_Lamina_Botones("Opcion", quinto);

		String sexto[] = { "Campo de texto", "Combo" };

		lamina_entrada = new V123_Lamina_Botones("Entrada", sexto);
		

		// añadiendo laminas a la lamina de cuadricula

		lamina_Cuadricula.add(lamina_Tipo);

		lamina_Cuadricula.add(lamina_Tipo_mensaje);

		lamina_Cuadricula.add(lamina_mensaje);

		lamina_Cuadricula.add(lamina_confirmar);

		lamina_Cuadricula.add(lamina_opcion);

		lamina_Cuadricula.add(lamina_entrada);
		
		

		// contruimos la lamina inferior

		setLayout(new BorderLayout());

		JPanel lamina_motrar = new JPanel();

		JButton boton_mostrar = new JButton("Mostrar");
		
		boton_mostrar.addActionListener(new AccionMostrar());

		lamina_motrar.add(boton_mostrar);

		add(lamina_motrar, BorderLayout.SOUTH);
		
		

		// añadiendo la lamina cuadricula al marco

		add(lamina_Cuadricula, BorderLayout.CENTER);

	}

	
	private class AccionMostrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
		System.out.println(lamina_Tipo.dameSeleccion());
		
			
		}
		
	}
	
	private V123_Lamina_Botones lamina_Tipo, lamina_Tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion,
			lamina_entrada;

}
