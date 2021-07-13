import javax.swing.*;
public class c23_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado=1L; //para numeros grandes BigInteger
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("iIntroduce un Número;"));
		
		
		for(int i=numero; i>0; i--) {
			
			 resultado = resultado*i;
			 System.out.println( resultado + " * " + i +" = " + resultado);
		}
		
		
	
		
		

	}

}
