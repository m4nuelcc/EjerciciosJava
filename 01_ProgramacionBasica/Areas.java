import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elija una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4 circulo");
		
		int opcion =  entrada.nextInt();
		
		switch (opcion) {
		
		case 1:
			
			int lado = Integer.parseInt(JOptionPane.showInputDialog("por favor teclee el lado del cuadrado:"));
			
			System.out.println("el area del cuadrado es:" + (lado*lado) );
			System.out.println("el area del cuadrado es:" + Math.pow(lado, 2) );
				
			break;
			
		case 2:
			
			int base = Integer.parseInt(JOptionPane.showInputDialog("por favor, teclee la base"));
			
			int altura = Integer.parseInt(JOptionPane.showInputDialog("por favor, teclee la altura"));
			
			System.out.println("el area del rectangulo es: " + (base*altura) );
			
			break;
			
		case 3:
			
            base = Integer.parseInt(JOptionPane.showInputDialog("por favor, teclee la base"));
			
			altura = Integer.parseInt(JOptionPane.showInputDialog("por favor, teclee la altura"));
			
			System.out.println("el area del rectangulo es: " + (base+altura/2) );
			
		case 4:
		
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Por Favor, teclee el radio del circulo"));
			
			System.out.println("el area del Circulo es: ");
			
			System.out.printf("%1.2f" ,Math.PI*Math.pow(radio, 2));
			
			break;
			
		default:
			
			System.out.println("la opcion no es correcta");
			
			
		}
	    entrada.close();
		
	
	}

}
