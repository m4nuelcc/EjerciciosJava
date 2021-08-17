package V152_Acceso_A_Ficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class V152_Leyendo_Ficheros {

	public static void main(String[] args) {

		Leer_Fichero lectura = new Leer_Fichero();
		
		lectura.lee();

	}

}


class Leer_Fichero{
	
	public void lee() {
		
		try {
			FileReader entrada = new FileReader("1_Ficheros/V152_Acceso_A_Ficheros/fichero.txt");
			
			int c= entrada.read();
			
			while(c!=-1) {
				
				c=entrada.read();
				
				char letra = (char) c;
				
				System.out.print(letra);
			}
			
		} catch (IOException e) {
			
			System.out.println("no se encontro el archivo");
			
			e.printStackTrace();
		}
	}
}