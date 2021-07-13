import java.util.Scanner;

public class c20_adivina_nuemro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100); //Math.ramdon devulve un double, por eso lo reconvertimos con (int)
		
		//System.out.println(aleatorio);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		do {
			
			intentos++;
			
			System.out.println("Introduce un Número por favor: ");
			
			numero = entrada.nextInt();
			
			if(numero>aleatorio) {
				
				System.out.println("Mas bajo");
				
			}  else if(numero<aleatorio) {
				
				System.out.println("Mas alto");
			}
			
		} while(numero!=aleatorio);
		
		System.out.println("correcto, has tenido " + intentos + " intentos");
		
		entrada.close();
	}

}
