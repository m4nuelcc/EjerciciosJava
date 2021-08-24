package V161_162_ArrayList_I_II;
import java.util.ArrayList;

public class V161_162_ArrayList_I_II {

	public static void main(String[] args) {

		// Añadir Objeto Empleado a un Array

		Empleados[] listaEmpleados = new Empleados[4];

		listaEmpleados[0] = new Empleados("manu", 50, 50000);

		listaEmpleados[1] = new Empleados("Renee", 40, 80000);

		listaEmpleados[2] = new Empleados("rosa", 22, 10000);

		listaEmpleados[3] = new Empleados("vanessa", 32, 30000);

		System.out.println("************** A R R A Y *******************");

		for (Empleados e : listaEmpleados) {

			System.out.println(e.dametatos());
		}

		// Añadir Objeto Empleados a un ArrayList

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

		System.out.println("**************A R R A Y L I S T **************");

		// recorrer ArrayList con un forEch

		for (Empleados e : listaEmpleados2) {

			System.out.println(e.dametatos());

		}

		// Recorrer ArrayList con un Array normal

		System.out.println("* A R R A Y L I S T  C O N   U N   F O R ** ");

		for (int i = 0; i < listaEmpleados2.size(); i++) {

			Empleados e = listaEmpleados2.get(i);

			System.out.println("+" + e.dametatos());

			// otra manera de imprimirlo

			System.out.println("*" + listaEmpleados2.get(i).dametatos());
		}

		
		// Creacion de un array del tamaño del Arraylist y guardar los datos

		Empleados[] ArrayEmpleados = new Empleados[listaEmpleados2.size()];

		listaEmpleados2.toArray(ArrayEmpleados);
		
		for (int i=0; i<ArrayEmpleados.length; i++) {
			
			System.out.println(ArrayEmpleados[i].dametatos());
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