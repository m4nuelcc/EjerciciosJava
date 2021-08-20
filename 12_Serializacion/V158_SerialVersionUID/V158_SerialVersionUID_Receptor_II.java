package V158_SerialVersionUID;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class V158_SerialVersionUID_Receptor_II {

	public Empleado[] lectura() {

		try {

			// leemos fichero serializado lo guardamos en un array y lo leemos

			ObjectInputStream lecturaFichero = new ObjectInputStream(
					new FileInputStream("12_Serializacion/V158_SerialVersionUID/FicheroSerializadoII.dat"));

			Empleado[] ficheroRecuperado = (Empleado[]) lecturaFichero.readObject();

			lecturaFichero.close();

//			for (Empleado empleado : ficheroRecuperado) {
			//
//				System.out.println(empleado);
			//
//			}

			return ficheroRecuperado;

		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}

}

/*
 * 
 * try {
 * 
 * 
 * //leemos fichero serializado lo guardamos en un array y lo leemos
 * 
 * 
 * ObjectInputStream lecturaFichero = new ObjectInputStream(new FileInputStream(
 * "12_Serializacion/V158_SerialVersionUID/FicheroSerializadoII.dat"));
 * 
 * Empleado[] ficheroRecuperado = (Empleado[]) lecturaFichero.readObject();
 * 
 * lecturaFichero.close();
 * 
 * 
 * for (Empleado empleado: ficheroRecuperado) {
 * 
 * System.out.println(empleado);
 * 
 * }
 * 
 * } catch (Exception e) {
 * 
 * e.printStackTrace(); }
 * 
 * 
 */
