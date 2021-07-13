
public class Declaraciones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=6;
		int b=2;
		int c=2;
		int d=1;
		int f=0;
		int x;
		
		double g=5;
		double h=3;
		double resultado;
				
		
		System.out.println(f);
		
		f++; //incrementa 1 a la variable f 
		
		System.out.println(f);
		
		f+=6; // le sumo 6 al valor de f
		
		System.out.println(f);
		
        x=a/b*(c+d);
		System.out.println(x);
		
		resultado= g/h;
		
		System.out.println("el resultado es: " + resultado);
		
		/*
		 * Ejemplo de constantes y operadores y concatenados
		 */
		
		final double apulgadas=2.54;
		
		double cm=6;
		
		double resultado2=cm/apulgadas;
		
		System.out.println("en " + cm + " cm hay: " + resultado2 + " pulgadas");

	}

}


/*para declarar constantes se pone final = xxx
 * final double pulgadas=2,16;
 * 
 * OPERADORES
 * aritmeticos + - * /
 * 
 * LOGICOS RELACIONALES Y BOOLEANOS
 * > < <> != == &&
 * 
 * INCREMENTO DECREMENTO
 * 
 * ++ incremento
 * -- decremento
 * +=nº incremento
 * -=nº decremento
 * 
 * CONCATENACION
 * 
 * + concatena
 * 
*/
