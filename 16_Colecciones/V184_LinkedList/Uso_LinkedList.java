package V184_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Uso_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> lista = new LinkedList<String>();

		lista.add("1 Manu");
		lista.add("2 Renee");
		lista.add("3 pedro");
		lista.add("4 Bartolo");

		System.out.println(lista.size());

//		for (String nombre : lista) {
//
//			System.out.println(nombre);
//		}
//
//		lista.remove("Bartolo");
//		System.out.println("******************");
//		System.out.println("borrado bartolo");
//		System.out.println("******************");
//
//		for (String nombre : lista) {
//
//			System.out.println(nombre);
//		}
//
//		lista.add(1, "andrea");
//
//		lista.addLast("Sofia");
//		
//			System.out.println("*****NUEVO LISTADO*******");

		ListIterator<String> it = lista.listIterator();
		it.next();
		System.out.println("nextIndex " + it.nextIndex());
		it.add("5 hola");
		it.next();
		it.add("6 mira donde caigo");
		
		for (String persona: lista) {
			
			System.out.println(persona);
		}

		it.previous();
		it.add("7 El previus");
		Iterator<String> it2 = lista.iterator();
		
		while(it2.hasNext()) {
			
			System.out.println("Iterator "+ it2.next());
		}
	}

}
