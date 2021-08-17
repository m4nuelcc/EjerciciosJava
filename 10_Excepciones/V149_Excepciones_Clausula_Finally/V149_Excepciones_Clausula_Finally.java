package V149_Excepciones_Clausula_Finally;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class V149_Excepciones_Clausula_Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion: \n1 Cuadrado: \n2 Rectangulo: \n3 Triangulo: \n4 Circulo: ");

		try {

			figura = entrada.nextInt();

		} catch (Exception e) {
			
			System.out.println("Ha ocurrido un error");

		} finally {  // siempre se va a ejecutar, tanto si hay error como si no, asi cerramos la entrada de datos

			entrada.close();
		}

		switch (figura) {

		case 1:

			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce lado"));

			System.out.println("El areak del cuadrado es :" + Math.pow(lado, 2));

			break;

		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));

			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));

			System.out.println("El area del rectagulo es : " + base * altura);

		case 3:

			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));

			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));

			System.out.println("El area del Triangulo es : " + base * altura / 2);

		case 4:

			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce radio del circulo"));

			System.out.println("el area del circulo es: 2" + Math.PI * (radio * radio));

		default:

			System.out.println("Fin");

		}
//************************************************************************************************************
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
		
		
	}

	static int figura;
}
