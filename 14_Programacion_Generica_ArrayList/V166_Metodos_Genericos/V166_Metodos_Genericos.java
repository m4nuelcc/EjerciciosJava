package V166_Metodos_Genericos;

import java.util.Date;
import java.util.GregorianCalendar;

public class V166_Metodos_Genericos {

	public static void main(String[] args) {

		String[] numeroString = { "uno", "dos", "tres", "cuatro" };

		System.out.println(MisMatrices.DimeElementos(numeroString));

		Integer[] numerosInteger = { -1,1, 2, 2, 1, 2, 3, 12, 3, 1, 435, 7, 5, 54, 3443, 45, 3, 2 };
		
		
		
		Date fecha, fecha2;
		
		GregorianCalendar calendario = new GregorianCalendar(2021,12,11);
		
		fecha = calendario.getTime();
		
		fecha2 = new GregorianCalendar(1918,12,11).getTime();
		
		
		
		Date fechas[]= {fecha, fecha2, new GregorianCalendar(1902-1,12,11).getTime(),
				new GregorianCalendar(1812-1,12,11).getTime()};
		
		
		System.out.println(MisMatrices.DimeElementos(numerosInteger));
		
		System.out.println(MisMatrices.DimeElMenor(numerosInteger));

		
		System.out.println(MisMatrices.DimeElMenor(fechas));
	}

	static class MisMatrices {
		

		public static <T> String DimeElementos(T[] a) {

			return "El Array tienen " + a.length + " Elementos";
		}
		

		public static <T extends Comparable> T DimeElMenor(T[]b) {

			if (b == null || b.length == 0) {

				return null;

			}
			
			T primerElemento = b[0];
			
			for (int i=1; i<b.length; i++) {
				

			   /* Número positivo: la cadena 1 es mayor que la cadena 2.
			    * 
			    0: las cadenas son iguales.
			    
			    Número negativo: la cadena 1 es menor que la cadena 2.*/

				
				if(primerElemento.compareTo(b[i])>0) {  //compareTo compara dos cadenas
					
					primerElemento=b[i];
				}
				
			}
			return primerElemento;			
			
		}

	}

}
