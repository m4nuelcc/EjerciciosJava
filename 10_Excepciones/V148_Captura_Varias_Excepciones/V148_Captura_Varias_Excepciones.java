package V148_Captura_Varias_Excepciones;

import java.text.spi.NumberFormatProvider;

import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class V148_Captura_Varias_Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			division();
			
		}catch(ArithmeticException e){
			
			System.out.println("No estas dividiendo por 0");
			
		}catch(NumberFormatException e) {
			
			System.out.println("No has introducico un numero entero");
			System.out.println("Error tipo: "+e.getClass());
		}
		

	}

	static void division() {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce dividendo"));
		
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce divisor"));
		

		System.out.println("el resultado es " + num1/num2);
		
	}
}

