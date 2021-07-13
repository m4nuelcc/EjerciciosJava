// HAY K MEJORARLO

import javax.swing.JOptionPane;

public class c22_Comprueba_Mail2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String correo="";
		
		int arroba = 0;
		
		int arroba_inicio=0;
		
		int punto = 0;
		
		correo = JOptionPane.showInputDialog("introduce el correo");
		
	//	System.out.println(correo);

		for(int i=0; i<correo.length(); i++) {
			
			if(correo.charAt(i)=='@') {
				
				arroba++;
				
			}
			
			if(correo.charAt(i)=='.') {
				
				punto++;				
				
			}
			System.out.println(i);
			if (correo.charAt(i)=='@' && i==0) {
				
				arroba_inicio++;
			}
			
		}
		
		if (arroba==1 && punto==1 && arroba_inicio==0) {
			
			System.out.println("El correo es CORRECTO");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
