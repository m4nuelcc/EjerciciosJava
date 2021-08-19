package Excepciones;

import java.util.Scanner;

public class Excepcion_No_controlada {

	public static void main(String[] args) {

		int respuesta;

		System.out.println("------MENU-------");

		System.out.println("\n \n1 introducir datos \n2 salir \n \n¿que desea hacer?");

		respuesta = sc.nextInt();

		switch (respuesta) {

		case 1:

			System.out.println("introducir datos");

			try {

				pedirDatos();

				System.out.println(nombre + " el año que viene tendrás " + edad);

			} catch (Exception e) {

				System.out.println("has introducido un dato erroneo");

			}finally {
				
				sc.close();
				
			}

			break;

		case 2:

			System.out.println("programa finalizado");

			System.exit(0);

			break;

		default:

			break;

		}
		

	}

	static public void pedirDatos() throws Exception {

		System.out.println("Dime tu nombre: ");

		nombre = sc.next();

		System.out.println("dime tu edad");

		edad = sc.nextInt();

		edad = edad + 1;

	}

	static public String nombre;

	static public int edad;

	static public Scanner sc = new Scanner(System.in);
}
