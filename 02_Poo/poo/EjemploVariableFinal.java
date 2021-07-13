package poo;

public class EjemploVariableFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("manuel");
		Empleados trabajador2 = new Empleados("Renee");
		
		trabajador1.cambiaSeccion("informatico");
		//trabajador1.cambiaNombre("manuelo2");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());

	}

}


class Empleados{
	
	private final String nombre; //final hace que nombre nunca se pueda cambiar, constante
	private String seccion;
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="administracion";
		
	}
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
//	public void cambiaNombre(String nombre) {
//		
//		this.nombre=nombre;
//	} esto da error porque nombre es final constante
	
	public String devuelveDatos() {
		
		return "el nombre es: " + nombre + " y la seccion es "+ seccion;
	}
	
}