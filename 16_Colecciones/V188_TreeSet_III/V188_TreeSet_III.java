package V188_TreeSet_III;

import java.util.Comparator;
import java.util.TreeSet;

public class V188_TreeSet_III {

	public static void main(String[] args) {

		TreeSet<String> listado = new TreeSet<String>(); // lo ordena orden alfabetico, porque la clase String tiene la
															// interface comparable

		listado.add("Bartolo");

		listado.add("Perdo");

		listado.add("Antonio");

		listado.add("Vanesa");

		listado.add("Xavier");

		listado.add("Renee");

		System.out.println(listado);

		Articulo lista1 = new Articulo(6, "Manuel");
		Articulo lista2 = new Articulo(2, "Renee");
		Articulo lista3 = new Articulo(3, "Ana");
		Articulo lista4 = new Articulo(4, "Perico");
		Articulo lista6 = new Articulo(7, "Pericodd");

		TreeSet<Articulo> Ordenados = new TreeSet<Articulo>();

		Ordenados.add(lista4);
		Ordenados.add(lista3);
		Ordenados.add(lista1);
		Ordenados.add(lista2);
		Ordenados.add(lista6);
		
		System.out.println("****************ORDENADO POR EL INDICE************************************");
		
		for (Articulo a : Ordenados) {

			System.out.println(a.getindice() + " " + a.getNombre());
		}

		
	//	ComparadorArticulos compara_art = new ComparadorArticulos();
		
		TreeSet<Articulo> ordenarticulo2 = new TreeSet<Articulo>(new Comparator<Articulo>() { 
			
			//Utilizacion de clase interna.
			
			public int compare(Articulo o1, Articulo o2) {
				
				String desc1 = o1.getNombre();
				
				String desc2 = o2.getNombre();
				
				return desc1.compareTo(desc2);
			}
			
		});
		
		ordenarticulo2.add(lista4);
		ordenarticulo2.add(lista3);
		ordenarticulo2.add(lista1);
		ordenarticulo2.add(lista2);
		ordenarticulo2.add(lista6);
		
		System.out.println("**************ORDENARTICULO2 ORDENADOR ALFABETICAMENTE POR NOMBRE***********************");
		
		for (Articulo a : ordenarticulo2) {

			System.out.println(a.getindice() + " " + a.getNombre());
		}

	}

}

//creacion de la clase Aticulo implementando Comparable para que ordene por indice

class Articulo implements Comparable<Articulo>{

	
	public Articulo(int indice, String nombre) {

		this.indice = indice;

		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public int getindice() {
		return indice;
	}

	@Override
	public int compareTo(Articulo o) {

		return this.indice - o.indice;
	}

	private int indice;

	private String nombre;

	
}


//class ComparadorArticulos implements Comparator<Articulo>{   //clase para comparar

//la comenteamos porque hemos creado una clase interna
//
//	@Override
//	public int compare(Articulo o1, Articulo o2) {
//	
//		String desc1 = o1.getNombre();
//		
//		String desc2 = o2.getNombre();
//		
//		return desc1.compareTo(desc2);
//	}
//	
//	
//}