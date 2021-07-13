
public class Calculos_ConMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raiz=Math.sqrt(9);
		System.out.println("la raiz cuadrada de 9 es:" + raiz);
		
		/*
		 * Utilizando clase round redondear y refundacion
		 */
		
		double num1=5.58;
		
		int resultado=(int)Math.round(num1);
		
		System.out.println("redondeo del numero " + num1 +"es: " + resultado);
		
		double base=5;
		double exponente=3;
		// (int)Math.pow(base, exponente) convertimos el resultado a int
		
		int resultado2=(int)Math.pow(base, exponente);
		
		System.out.println("base " + base  + " elevado por: " + exponente + " es igual a: " + resultado2);
		
		
		

	}

}
