package V146_Excepciones_Controladas;

import javax.swing.JOptionPane;

public class V146_Excepciones_Controladas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String correo = "";

		correo = JOptionPane.showInputDialog("introduce el correo");

		try {
			
			ComprobarCorreo(correo);
			
		} catch (Exception e) {
			
			System.out.println("direccion de correo no es correcta");
			e.printStackTrace();
		}

	}

	static void ComprobarCorreo(String correo) throws Longitud_mail_Erronea{

		int arroba = 0;

		int arroba_inicio = 0;

		int punto = 0;

		if (correo.length() <= 3) {
			
			throw new Longitud_mail_Erronea("El mail no puede tener menos de 3 caracteres");

		} else {

			for (int i = 0; i < correo.length(); i++) {

				if (correo.charAt(i) == '@') {

					arroba++;

				}

				if (correo.charAt(i) == '.') {

					punto++;

				}
				System.out.println(i);

				if (correo.charAt(i) == '@' && i == 0) {

					arroba_inicio++;
				}

			}

			if (arroba == 1 && punto == 1 && arroba_inicio == 0) {

				System.out.println("El correo es CORRECTO");

			} else {

				System.out.println("ERROR");
			}
		}

	}

}

class Longitud_mail_Erronea extends Exception{   //con Exciocion obligamos a poner try catch
	
	public Longitud_mail_Erronea() {}
	
	public Longitud_mail_Erronea(String msj_Error) {
		
		super(msj_Error);
	}
}
