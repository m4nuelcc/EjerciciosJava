package V150_151_Ejercicios_Para_Probar_Debug_Eclipse;

import javax.swing.JOptionPane;

public class V150_Error_Array_Comporbar_con_Debug {

	public static void main(String[] args) {
	
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array"));
		
		
		int[] array =new int[tamanoArray];
		
		for(int i=0; i<array.length; i++) {
			
			array[i]= (int) Math.random()*100; // poner aqui debuf para saber los valores del array
			
			//array[i]= (int) (Math.random()*100);
			
		}
		
		for (int e: array) {
			
			System.out.println(e);
			
		}
		

	}

}
