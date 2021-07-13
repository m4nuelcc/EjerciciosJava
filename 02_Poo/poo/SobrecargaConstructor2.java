package poo;

import java.util.*;

public class SobrecargaConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado3[] misEmpleados = new Empleado3[4];

		misEmpleados[0] = new Empleado3("manuel", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado3("renee", 95000, 1998, 13, 14);
		misEmpleados[2] = new Empleado3("Sofi", 105000, 1980, 4, 29);
		misEmpleados[3] = new Empleado3("Gordi");

		for (Empleado3 e : misEmpleados) {

			e.subeSueldo(5);
			System.out.println("nombre:" + e.dameNombre() + " sueldo: " + e.dameSueldo() + " fecha de alta: "
					+ e.dameFechaContrato());

		}
	}
}

class Empleado3 {

	private String nombre;
	private double sueldo;
	private Date altaContrato;

	public Empleado3(String nom, double sue, int agno, int mes, int dia) {

		nombre = nom;

		sueldo = sue;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

		altaContrato = calendario.getTime();

	}

	public Empleado3(String nom) {

		this(nom, 30000,2000,01,01);  //llama al constructor de arriba

	}

	public String dameNombre() {

		return nombre;
	}

	public double dameSueldo() {

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
