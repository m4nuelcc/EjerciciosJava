import java.util.*;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu edad, por favor : ");
		
		int edad=entrada.nextInt();

		if (edad<18) {
			
			System.out.print("Eres un yogurin");
		}
		else if (edad<=40){
			
			System.out.print("eres jovenzuelo");
		}
        else if (edad<=65){
			
			System.out.print("eres maduritooo");
		}
        else {
        	System.out.print("Estamos yaaaa pa cuidarnos eh");
        }
		
		 entrada.close();
	}

	
}
