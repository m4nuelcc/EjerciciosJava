import java.util.*;

public class Entrada_ejemplo_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introducir la edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("hola " + nombre_usuario + ". el año que viene tendrás "  + (edad+1) + " pepaños"); 
		
		entrada.close();
	}
		
	  
}
