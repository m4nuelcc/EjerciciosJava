import javax.swing.*;
public class c18_Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave = "lolo";
		
		String pass = "";
		
		while (clave.equals(pass)==false) {
			
			pass = JOptionPane.showInputDialog("Por favor introduzca la contraseņa:");
			
			if (pass.equals(clave)==false) {
				
				System.out.println("CONTRASEŅA ERRONEA");
			};
		};
		
		System.out.println("CONTRASEŅA CORRENTA ACCESO PERMITIDO");
		
	}

}
