package poo;

public class EjemploStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados1 trabajador1 = new Empleados1("manuel");
		Empleados1 trabajador2 = new Empleados1("Renee");
		Empleados1 trabajador3 = new Empleados1("Rosa");
		Empleados1 trabajador4 = new Empleados1("pedro");
		
		trabajador1.cambiaSeccion("informatico");
	
		System.out.println(trabajador1.devuelveDatos());
		
		System.out.println(trabajador2.devuelveDatos());
		
		System.out.println(trabajador3.devuelveDatos());
		
		System.out.println(trabajador4.devuelveDatos());

	}

}


class Empleados1{
	
	private final String nombre; //final hace que nombre nunca se pueda cambiar, constante
	private String seccion;
	private int id;
	private static int IdSiguiente=1;
	
	public Empleados1(String nom) {
		
		nombre=nom;
	
		seccion="administracion";
		
		id=IdSiguiente++;
	   // IdSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
		
	}

	
	public String devuelveDatos() {
		
		return "el nombre es: " + nombre + " y la seccion es "+ seccion
				+" y el id: " + id;
	}
	
}