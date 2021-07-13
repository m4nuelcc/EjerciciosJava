package V48_TiposEnumerados;

import java.util.Scanner;

public class v48_Tallas {

//	enum Talla {MINI, MEDIANO, GRANDE, MUY_GRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");	
		
		private Talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		private String abreviatura;
		
		public String dameAbreviatura() {
			
			return abreviatura;
		}
	}
	
		
	
	public static void main(String[] args) {
	
//		Talla s=Talla.MINI;
//		
//		Talla m =Talla.MEDIANO;
//		
//		Talla l=Talla.GRANDE;
//		
//		Talla xl= Talla.MUY_GRANDE;

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("escribe una talla: MINI, MEDIANO,GRANDE,MUY_GRANDE");
		
		String entradaDatos=entrada.next().toUpperCase();
		
		
		Talla la_Talla=Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla=" + la_Talla);
		System.out.println("abreviatura="+ la_Talla.dameAbreviatura() );
		
	}

}
