
public class manipula_cadenas_II {

	public static void main(String[] args) {
		
		String frase="Hoy es un buen dia para aprender a progrmar en java";
		
		String frase2="Hoy es un buen dia para aprender a programar en java";
		

		String frase_resumen=frase.substring(1, 3); //extrae de la frase desde la posicion 1 hasta el 3
			 										// resultado oy
		System.out.println(frase_resumen);
		
		
		String frase_resumen2=frase2.substring(0, 3) + " me piro a la playa " +
		frase.substring(25, frase.length());

		System.out.println(frase_resumen2);
	}

}
