package V159_File_Ficheros_Directorios;

import java.io.File;

public class V159_Ficheros_Directorios {

	public static void main(String[] args) {
		
		File lectura_Ficheros = new File("Ejemplo.txt");
		
		System.out.println(lectura_Ficheros.getPath());
		
		System.out.println(lectura_Ficheros.getAbsolutePath());
		
		System.out.println(lectura_Ficheros.exists());
		
		System.out.println("**********************************************************\n");
		
		
		
		
		File ruta = new File("C:/Users/Manu/eclipse-workspace/Curso_Java/13_Manipulacion_Ficheros_Directorios/directorio_prueba");
		
		System.out.println(ruta.getAbsolutePath());
		
		String [] nombres_archivos;
		
		nombres_archivos = ruta.list();
		
		for (int i=0; i<nombres_archivos.length; i++) {
			
			System.out.println(nombres_archivos[i]);
			 			
			File f = new File(ruta.getAbsolutePath(), nombres_archivos[i]);
			
			if (f.isDirectory()) {
				
				System.out.println("***************	"+nombres_archivos[i] +"*****************");
				
				String[] archivos_subcarpeta = f.list();
				
				for(int j=0; j< archivos_subcarpeta.length; j++) {
					
					System.out.println(archivos_subcarpeta[j]);
				}
			}
			
			
			
			}
			
		}
		
		
		

	}


