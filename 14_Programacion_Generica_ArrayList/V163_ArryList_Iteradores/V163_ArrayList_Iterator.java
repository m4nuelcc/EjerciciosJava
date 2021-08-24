package V163_ArryList_Iteradores;
import java.util.ArrayList;
import java.util.Iterator;

public class V163_ArrayList_Iterator {

	public static void main(String[] args) {

		

		ArrayList<Empleados> listaEmpleados2 = new ArrayList();

		listaEmpleados2.add(new Empleados("manu2", 38, 77770));

		listaEmpleados2.add(new Empleados("renee2", 38, 77770));

		listaEmpleados2.add(new Empleados("rosa2", 38, 77770));

		listaEmpleados2.add(new Empleados("borrar", 38, 77770));

		// Devuelve el valar que le pongamos como indice

		System.out.println("Muestra el elemento que le pongamos " + listaEmpleados2.get(1).dametatos());

		// machaca la posicion 1 y añade el nuevo empleado

		listaEmpleados2.set(1, new Empleados("rony", 15, 1000));

		// Muestra el tamaño del ArrayList

		System.out.println(listaEmpleados2.size());

		// borramos el ultimo elemento

		listaEmpleados2.remove(listaEmpleados2.size() - 1);

		// le damos un tamaño al ArrayList

		listaEmpleados2.ensureCapacity(10);

		// cortar el exceso de memoria

		listaEmpleados2.trimToSize();

//		System.out.println("**************A R R A Y L I S T **************");

		// recorrer ArrayList con un forEch

//		for (Empleados e : listaEmpleados2) {
//
//			System.out.println(e.dametatos());
//
//		}
		
		
		System.out.println("************I T E R A T O R**********************");
		
		Iterator<Empleados> mi_Iterator = listaEmpleados2.listIterator();
		
		while(mi_Iterator.hasNext()) {
			
			
			// e = mi_Iterator.next();
			
			//System.out.println(e.dametatos());
			
			System.out.println(mi_Iterator.next().dametatos());
		}


		
	
	
	}

}

class Empleados {

	public Empleados(String nombre, int edad, double salario) {

		this.nombre = nombre;

		this.edad = edad;

		this.salario = salario;

	}

	public String dametatos() {

		return "El empleado " + nombre + ". Tiene " + edad + " años. " + "Y un salario de " + salario;

	};

	private String nombre;

	private int edad;

	private double salario;

}