package V50_51_Interfaces_II;

import java.util.*;

public class v_50_Interfaces_II_Instaceof  {

	public static void main(String[] args) {

		Empleado[] misEmpleados = new Empleado[5];

		Jefatura jefe_RRHH = new Jefatura("David", 55000, 2006, 9, 25);
		jefe_RRHH.estableceIncentivo(2570);
		System.out.println(jefe_RRHH.tomarDecisiones("comer bocadillos"));

		misEmpleados[0] = new Empleado("manuel", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("renee", 95000, 1998, 13, 14);
		misEmpleados[2] = new Empleado("Sofi");
		misEmpleados[3] = jefe_RRHH;// polimorfismo en accion.Principio de sustitucion
		misEmpleados[4] = new Jefatura("maria", 95000, 1999, 5, 26); // nueva instancia
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleados[4]; //casting
		jefa_Finanzas.estableceIncentivo(55000);
		System.out.println("el jefe de finanzas "+ jefa_Finanzas.dameNombre()+
				" Tiene un bonus de: "+jefa_Finanzas.establece_bonus(500));
						
		System.out.println(misEmpleados[3].dameNombre()+ " Tiene un bonus de: "+
		                    misEmpleados[3].establece_bonus(200));
		
		System.out.println(jefa_Finanzas.tomarDecisiones("Dar mas dias de vacaciones a los empleados"));
		for (Empleado e : misEmpleados) { // subimos sueldo empleados

			e.subeSueldo(5);
		}

		Arrays.sort(misEmpleados);
		

		for (Empleado e : misEmpleados) {
			
		
			System.out.println("nombre:" + e.dameNombre() + " sueldo: " + e.dameSueldo() + " fecha de alta: "
					+ e.dameFechaContrato() + e.devuelveDatos());

		}

	}
}

class Empleado  implements Comparable, Trabajadores{

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
		
		sueldo=1000;

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

	@Override
	public int compareTo(Object miObjeto) { //interface
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		if(this.sueldo<otroEmpleado.sueldo) { //tambien podemos ordenar por id
			
			return -1;
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
	}

	@Override
	public double establece_bonus(double gratificacion) {
	
		return Trabajadores.bonus_base+gratificacion;
	}
	
	

}

class Jefatura extends Empleado implements Jefes{

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



	@Override
	public String tomarDecisiones(String decision) {
		
		
		
		return "Un miembro de la direcicon ha tomado la decision de: "+ decision;
	}



	@Override
	public double establece_bonus(double graticicaion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+graticicaion+prima;
	}
}


//ejemplos de instanceof

//		//*******************************************************************
//		Empleado direcor_Comercial = new Jefatura("sandra", 55000, 1987, 12, 12);
//		
//		Comparable ejemplo = new Empleado("Elisabeg",95000,2011,06,07);
//		
//		if(direcor_Comercial instanceof Empleado) {
//			
//			System.out.println("es de tipo jefatura");
//		}
//		
//		if(ejemplo instanceof Comparable) {
//			
//			System.out.println("implementa la interfaz comparable");
//		}
//		
//		//***********************************************************************