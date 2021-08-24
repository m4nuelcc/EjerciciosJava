package V160_Crear_Escribir_Eliminar_ficheros_directorios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class V160_Crear_Escribir_Eliminar_ficheros_directorios {

	public static void main(String[] args) {

		// File("C:/Users/Manu/eclipse-workspace/Curso_Java/13_Manipulacion_Ficheros_Directorios/directorio_prueba");
		// File.separator es \ pasra que funcione en todos los S.O

		File ruta = new File(
				"C:" + File.separator + "Users" + File.separator + "Manu" + File.separator + "eclipse-workspace"
						+ File.separator + "Curso_Java" + File.separator + "13_Manipulacion_Ficheros_Directorios"
						+ File.separator + "directorio_prueba" + File.separator + "nuevo_directorio");

		// añadimos a la ruta el nombre del directorio a crear (nuevo_directorio).

		ruta.mkdir(); // crea el directorio añadido al ruta

		File ruta2 = new File("C:" + File.separator + "Users" + File.separator + "Manu" + File.separator
				+ "eclipse-workspace" + File.separator + "Curso_Java" + File.separator
				+ "13_Manipulacion_Ficheros_Directorios" + File.separator + "directorio_prueba" + File.separator
				+ "nuevo_directorio" + File.separator + "texto2.txt");

		try {
			ruta2.createNewFile();

		} catch (IOException e) {

			e.printStackTrace();
		}
		
		

		// Crear y escribir en un fichero

		String archivo_destino = ruta2.getAbsolutePath();

		Escribiendo accede = new Escribiendo();
		
		String frase = "y añadimos mas, y añadimos mas sin que se borre, "
				+ "gracias el true que puse en el constructor del FileWriter";
		
		accede.escribir(archivo_destino, frase);
		
		
		
		//Borrar un fichero
		
		Eliminar borrar = new Eliminar();
		
		//borrar.eliminar(ruta2);

	}

}


//clase para escribir en un fichero


class Escribiendo {
	
	public void escribir(String ruta_Archivo, String frase) {
		
		
		try {
			FileWriter escritura = new FileWriter(ruta_Archivo, true);
			
			for (int i=0; i<frase.length(); i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
		
	};

}


//clase para eliminar ficheros

class Eliminar {
	
	public void eliminar (File ruta) {
		
		ruta.delete();
		
	}
}
