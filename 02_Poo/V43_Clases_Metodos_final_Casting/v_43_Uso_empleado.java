package V43_Clases_Metodos_final_Casting;

import java.util.*;

public class v_43_Uso_empleado {

	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[5];

		Jefatura jefe_RRHH = new Jefatura("David", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);

		misEmpleados[0] = new Empleado("manuel", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("renee", 95000, 1998, 13, 14);
		misEmpleados[2] = new Empleado("Sofi");
		misEmpleados[3] = jefe_RRHH;// polimorfismo en accion.Principio de sustitucion
		misEmpleados[4] = new Jefatura("maria", 95000, 1999, 5, 26); // nueva instancia
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[4]; //casting
		jefa_Finanzas.estableceIncentivo(55000);  
		
		
		
		for (Empleado e : misEmpleados) { // subimos sueldo empleados

			e.subeSueldo(5);
		}

		

		for (Empleado e : misEmpleados) {
		
			System.out.println("nombre:" + e.dameNombre() + " sueldo: " + e.dameSueldo() + " fecha de alta: "
					+ e.dameFechaContrato() + e.devuelveDatos());

		}

	}
}

class Empleado {

	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int IdSiguiente = 1;
	private String seccion;

	public Empleado(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

		id = IdSiguiente++;

	}

	public Empleado(String nom) {

		nombre = nom;

		seccion = "administracion";

		id = IdSiguiente++;
		// IdSiguiente++;

	}

	public String devuelveDatos() {

		return "el nombre es: " + nombre + " y la seccion es " + seccion + " y el id: " + id;
	}

	public static String dameIdSiguiente() { // en en static se llama la clase y luego el metoso
		// Empleadosc.dameIdSiguiente
		return "El IdSiguiente es el " + IdSiguiente;
	}

	public String dameNombre() {

		return nombre;
	}

	 public double dameSueldo() {  //si ponemos final ya no se puede crear otro metodo con el nombre damesueldo

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

class Jefatura extends Empleado {

	private double incentivo;

	public Jefatura(String nom, double sue, int agno, int mes, int dia) {

		super(nom, sue, agno, mes, dia);

	}

	public void estableceIncentivo(double b) {

		this.incentivo = b;
	}

	public double dameSueldo() {

		double sueldoJefe = super.dameSueldo(); // llama al metod de la clase padre

		return sueldoJefe + incentivo;
	}
}

