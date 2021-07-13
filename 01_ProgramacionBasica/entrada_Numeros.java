import javax.swing.*;
public class entrada_Numeros {

	public static void main(String[] args) {
		// conversios numeros con decimales con el metodo JOptionPane.showInputDialog
		
		String num1=JOptionPane.showInputDialog("introduce un numero :");
		
		double num2 = Double.parseDouble(num1);
		
		System.out.println("numero convertido con decimales es : " + num2);
		
		System.out.print("la raiz cuadrada de " + num2 + " es: " );
		
		//da formato de decimales printf("%1.2f")
		
		System.out.printf("%1.2f", Math.sqrt(num2));
		
		

	}

}
