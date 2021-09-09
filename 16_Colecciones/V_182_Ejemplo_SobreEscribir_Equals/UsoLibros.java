package V_182_Ejemplo_SobreEscribir_Equals;

public class UsoLibros {

	public static void main(String[] args) {

		Libro l1 = new Libro("juan", "que bonito", 001);

		Libro l2 = new Libro("pepa", "la vida", 002);

		Libro l3 = new Libro("sonia", "que vida loca", 003);

		Libro l4 = new Libro("juann", "que bonito", 001);

		// en este caso nos va a decir que los libros son diferentes.

		// pero si sobreescribimos equals comparando  los index

		if (l1.equals(l4)) {

			System.out.println("lo libros son iguales");

			System.out.println(l1.hashCode());

			System.out.println(l4.hashCode());
		} else {

			System.out.println("los libros son diferentes");

			System.out.println(l1.hashCode());

			System.out.println(l4.hashCode());
		}

	}

}
