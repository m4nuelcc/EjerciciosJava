package V152_Leyendo_Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class V152_Leyendo_Ficheros {

	public static void main(String[] args) {

		Leer_Fichero lectura = new Leer_Fichero();

		lectura.lee();

	}

}

class Leer_Fichero {

	public void lee() {

		try {

			File fichero = new File("11_Ficheros/V152_Acceso_A_Ficheros/fichero.txt");

			FileReader entrada = new FileReader(fichero); // entrada contiene el fichero

			// FileReader entrada = new
			// FileReader("11_Ficheros/V152_Acceso_A_Ficheros/fichero.txt");

			//int c = entrada.read(); // lee el fichero y nos devuvleve caracter leido en ascii
			
			int c=0;

			while (c != -1) { // devuelve -1 si es el fichal del fichero

				c = entrada.read(); // lee el sigiente caracter

				char letra = (char)c; // lo converticmos en char para ver el caracter y no el codigo ascii

				System.out.print(letra);
			}

			entrada.close(); //cerramos el flujo de datos
			
		} catch (IOException e) { // capturamos una excepcion mas generica para que englobe todos los errores
									// controlados

			System.out.println("no se encontro el archivo");

			e.printStackTrace();
		}
	}
}