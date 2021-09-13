package V186_TreeSet_I;

import java.util.TreeSet;

public class V186_TreeSet_I {

	public static void main(String[] args) {
		
		TreeSet<String> listado = new TreeSet<String>();  //lo ordena orden alfabetico, porque la clase String tiene la interface comparable
		
		listado.add("Bartolo");
		
		listado.add("Perdo");
		
		listado.add("Antonio");
		
		listado.add("Vanesa");
		
		listado.add("Xavier");
		
		listado.add("Renee");
		
		
		System.out.println(listado);
		
		
		Articulo lista1 = new Articulo(6, "Manuel");
		Articulo lista2 = new Articulo(2, "Renee");
		Articulo lista3 = new Articulo(3, "Bartolo");
		Articulo lista4 = new Articulo(4, "Perico");
		Articulo lista6 = new Articulo(7, "Pericodd");
		
		TreeSet<Articulo> Ordenados = new TreeSet<Articulo>();
		
		Ordenados.add(lista4);
		Ordenados.add(lista3);
		Ordenados.add(lista1);
		Ordenados.add(lista2);
		Ordenados.add(lista6);
		
		
		
		for(Articulo a: Ordenados) {
			
			System.out.println(a.getindice()+" " + a.getNombre());
		}
		
		
		

	}

}

//creacion de la clase Aticulo implementando Comparable para que ordene por indice

class Articulo implements Comparable<Articulo>{
	
	public Articulo (int indice, String nombre) {
		
		this.indice= indice;
		
		this.nombre= nombre;
		
		
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