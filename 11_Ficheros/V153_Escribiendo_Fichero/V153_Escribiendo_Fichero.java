package V153_Escribiendo_Fichero;

import java.io.FileWriter;
import java.io.IOException;

public class V153_Escribiendo_Fichero {

	public static void main(String[] args) {
	
		Escibiendo escribiendo = new Escibiendo();
		
		escribiendo.escribir();

	}

}


class Escibiendo{
	
	public void escribir() {
		
		String frase =" Rammstein ";
		
		try {
			
			//FileWriter escritura = new FileWriter("11_Ficheros/V153_Escribiendo_Fichero/Escritura.txt"); //sobreescribirfichero y machaca lo que tenga 
			FileWriter escritura = new FileWriter("11_Ficheros/V153_Escribiendo_Fichero/Escritura.txt", true); // si existe el fichero agrega texto

			
			for (int i=0; i< frase.length(); i++) {
				
				escritura.write(frase.charAt(i)); 
				
			}
			
			escritura.close();
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
	}
}