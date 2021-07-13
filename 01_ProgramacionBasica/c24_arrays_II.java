import javax.swing.*;

public class c24_arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises2 = new String[5];
		
		String [] paises = {"España", "Alemania", "Francia", "Argentina", "Mexico", "Peru", "Venezuela", "EEUU"};
		
		
		
		for(String elemento:paises) {
			
			System.out.println(elemento);
		}
		
		for (int i=0; i<5; i++) {
			
			paises2[i]= JOptionPane.showInputDialog("Introduce el pais numero " + (i+1));
			
		}
		
		for (String indice:paises2) {
			
			
			System.out.println("pais: " + indice);
		}
		
		
	

	}
}