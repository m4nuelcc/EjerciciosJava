package V166_Metodos_Genericos;

public class V166_Metodos_Genericos {

	public static void main(String[] args) {

		String[] numeroString = { "uno", "dos", "tres", "cuatro" };

		System.out.println(MisMatrices.DimeElementos(numeroString));

		Integer[] numerosInteger = { -1,1, 2, 2, 1, 2, 3, 12, 3, 1, 435, 7, 5, 54, 3443, 45, 3, 2 };

		System.out.println(MisMatrices.DimeElementos(numerosInteger));
		
		System.out.println(MisMatrices.DimeElMenor(numerosInteger));

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
