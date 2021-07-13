package V46_Clases_Abstractas;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas= new Persona[2];
		
		lasPersonas[0] = new Empleado("Manuel", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Renee", "Sociosaniraria");
		
		for (Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre()+" "+p.dameDescripcion());
			
		}
		

	}

}

abstract class Persona {

	private String nombre;

	public Persona(String nom) {

		nombre = nom;
	}

	public String dameNombre() {

		return nombre;
	}

	public abstract String dameDescripcion();

}

class Empleado extends Persona {

	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int IdSiguiente = 1;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		super(nom);

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

		id = IdSiguiente++;

	}

	public String dameDescripcion() {

		return "Este empleado tiene un id= " + id + " con un sueldo=" + dameSueldo();
	}

	public double dameSueldo() { // si ponemos final ya no se puede crear otro metodo con el nombre damesueldo

		return sueldo;
	}

	public Date dameFechaContrato() {

		return altaContrato;
	}

	public void subeSueldo(double porcentaje) {

		double aumento = sueldo * porcentaje / 100;

		sueldo += aumento;

	}

}

class Alumno extends Persona {

	private String carrera;

	public Alumno(String nom, String car) {
		super(nom);
		carrera = car;
	}

	public String dameDescripcion() {
		
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
}
