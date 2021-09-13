package V189_Mapas_HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class V189_Mapas_HashMaps {

	public static void main(String[] args) {

		HashMap<String, Empleados> listaEmpleados = new HashMap<String, Empleados>();

		listaEmpleados.put("1", new Empleados("Manu"));

		listaEmpleados.put("2", new Empleados("Renee"));

		listaEmpleados.put("3", new Empleados("Sofi"));

		listaEmpleados.put("4", new Empleados("Carolina"));

		System.out.println(listaEmpleados.toString());

		for (Entry<String, Empleados> empleado : listaEmpleados.entrySet()) {

			System.out.println("Toda la lista: " + empleado.toString() + "\n************************************** ");

			System.out.println("la clave es: " + empleado.getKey());

			System.out.println("El valor es " + empleado.getValue() + "\n************************************** ");

		}

		// reemplezamos un valor de la posicion 4

		listaEmpleados.put("4", new Empleados("Jose"));

		// Borrar la posicion 3

		listaEmpleados.remove("3");
		

		for (Map.Entry<String, Empleados> empleado1 : listaEmpleados.entrySet()) {

			System.out.println("Toda la lista: " + empleado1.toString()  );


		}

	}

}

class Empleados {

	public Empleados(String nombre) {

		this.nombre = nombre;

		sueldo = 25000;
	}

	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	private String nombre;

	private double sueldo;
}