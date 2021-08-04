package V123_Ejercicio_Practico_I;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class V123_Marco_dialogos extends JFrame {

	public V123_Marco_dialogos() {

		setTitle("Prueba Dialogos");

		setBounds(500, 300, 600, 450);

		// lamina cruadricula 2x3

		JPanel lamina_Cuadricula = new JPanel();

		lamina_Cuadricula.setLayout(new GridLayout(2,3));

		// instanciando radionButton

		String primero[] = { "Mensaje", "Confirmar", "Opcion", "Entrada" };

		lamina_Tipo = new V123_Lamina_Botones("Tipo", primero);
		

		String segundo[] = { "ERROR_MESSAGE", "INFORMATION_MESSAGE", "WARNING_MESSAGE", "QUESTION_MESSAGE",
				"PLAIN_MESSAGE" };

		lamina_Tipo_mensaje = new V123_Lamina_Botones("Tipo de Mensaje", segundo);
		

		String tercero[] = { "Cadena","Icono","Componente","Otros","Object[]"};

		lamina_mensaje = new V123_Lamina_Botones("Mensaje", tercero);
		
		
		
		String cuarto[] = { "DEFAULT_OPTION","YES_NO_OPCION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPTION"};

		lamina_confirmar = new V123_Lamina_Botones("Confirmar", cuarto);
		
		
		String quinto[] = { "String[]", "Icon[]","Object[]"};

		lamina_opcion = new V123_Lamina_Botones("Opcion", quinto);
		
		
		String sexto[] = { "Campo de texto", "Combo"};

		lamina_entrada = new V123_Lamina_Botones("Entrada", sexto);
		

		// añadiendo laminas a la lamina de cuadricula

		lamina_Cuadricula.add(lamina_Tipo);

		lamina_Cuadricula.add(lamina_Tipo_mensaje);
		
		lamina_Cuadricula.add(lamina_mensaje);
		
		lamina_Cuadricula.add(lamina_confirmar);
		
		lamina_Cuadricula.add(lamina_opcion);
		
		lamina_Cuadricula.add(lamina_entrada);
		

		// añadiendo la lamina cuadricula al marco

		add(lamina_Cuadricula);

	}

	private V123_Lamina_Botones lamina_Tipo, lamina_Tipo_mensaje, lamina_mensaje, lamina_confirmar, lamina_opcion,lamina_entrada;

}
