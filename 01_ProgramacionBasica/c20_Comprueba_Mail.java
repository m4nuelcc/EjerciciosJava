import javax.swing.JOptionPane;
import java.lang.*;

public class c20_Comprueba_Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce Mail");
		
		for(int i=0; i < mail.length(); i++ ) {
			
			if(mail.charAt(i)=='@'&& (i!=mail.length()-1)){
				
				arroba=true;
			}
			
		}
		
		if(arroba==true) {
			
			System.out.println("Es correcto");
		}else {
			
			System.out.println("Es incorrecto");
			
		}
	}

}

