import javax.swing.*;
public class c18_Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "lolo";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Por favor introduzca la contraseña:");
			
			if (pass.equals(clave)==false) {
				
				System.out.println("CONTRASEÑA ERRONEA");
			};
		};
		
		System.out.println("CONTRASEÑA CORRENTA ACCESO PERMITIDO");
		
	}

}
