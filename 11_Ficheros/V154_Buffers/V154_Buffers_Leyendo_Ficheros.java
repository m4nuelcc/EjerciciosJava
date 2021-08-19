package V154_Buffers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class V154_Buffers_Leyendo_Ficheros {

	public static void main(String[] args) {

		Leer_Fichero lectura = new Leer_Fichero();

		lectura.lee();

	}

}

class Leer_Fichero {

	public void lee() {

		try {

			File fichero = new File("11_Ficheros/V154_Buffers/fichero.txt");

			FileReader entrada = new FileReader(fichero); // entrada contiene el fichero
			
			BufferedReader mibuffer = new BufferedReader(entrada);
			
			String linea="";
			

			while (linea != null) { 

				linea=mibuffer.readLine(); //almacena la liena que se encuentra en el buffer
			
				if (linea!=null) {
					
					System.out.println(linea);
				}
				
			}

			entrada.close(); //cerramos el flujo de datos
			
		} catch (IOException e) { // capturamos una excepcion mas generica para que englobe todos los errores
									// controlados

			System.out.println("no se encontro el archivo");

			e.printStackTrace();
		}
	}
}