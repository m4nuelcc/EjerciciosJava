package V155_Leer_Escribir_Bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class V155_156_Leer_Escribir_Bytes {

	public static void main(String[] args) {
		
		//cuentaBytes();

		int cont = 0;
		
		int[] datos_entrada = new int[cuentaBytes()];

		try {
			FileInputStream archivo_lectura = new FileInputStream("11_Ficheros/V155_Leer_Escribir_Bytes/descarga.png");

			boolean final_ar = false;

			while (!final_ar) {

				int byte_entrada = archivo_lectura.read();

				if (byte_entrada != -1) {  //-1 da al final de la lectura

					datos_entrada[cont] = byte_entrada;
					
				} else {

					final_ar = true;

				}

		
				cont++; //nos cuenta los bytes que tiene la imagen

			}
			
			for (int a: datos_entrada) {
				
				System.out.println(a);
			}

			System.out.println(cont);

			archivo_lectura.close();
			
			crea_fichero(datos_entrada);  // llamamos al metodo para crear la nueva imagen

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	
	static void crea_fichero(int[] datos_nuevo_fichero) {
		
		try {
			
			FileOutputStream fichero_nuevo = new FileOutputStream("11_Ficheros/V155_Leer_Escribir_Bytes/imagen_copia.jpg");
			
			for (int i=0; i<datos_nuevo_fichero.length; i++) {
				
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			
			fichero_nuevo.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	static int cuentaBytes() {
		
		int c_byte=0;
		int conta=0;
		
		try {
			
			FileInputStream archivo_lectura2 = new FileInputStream("11_Ficheros/V155_Leer_Escribir_Bytes/descarga.png");
			
			while(c_byte != -1) {
				
				c_byte = archivo_lectura2.read();
				
				conta++;
				
				//System.out.println("llega");
				
			}
			
			archivo_lectura2.close();
		} catch (IOException e) {
			
		
			e.printStackTrace();
		}
		
		
		return conta;
	
		
	}

}
