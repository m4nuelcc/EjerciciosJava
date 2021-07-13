import java.util.*;


public class c19_adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int aleatorio = (int)(Math.random()*100); //Math.ramdon devulve un double, por eso lo reconvertimos con (int)
	
	//System.out.println(aleatorio);
	
	Scanner entrada = new Scanner(System.in);
	
	int numero = 0;
	
	int intentos = 0;
	
	while(numero!=aleatorio) {
		
		intentos++;
		
		System.out.println("Introduce un Número por favor: ");
		
		numero = entrada.nextInt();
		
		if(numero>aleatorio) {
			
			System.out.println("Mas bajo");
			
		}  else if(numero<aleatorio) {
			
			System.out.println("Mas alto");
		}
		
	}
	
	System.out.println("correcto, has tenido " + intentos + " intentos");
	
	entrada.close();
	
	
	
	}

}
