package poo;

import java.util.*;


public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		Empleado empleado1 = new Empleado("manuel", 85000, 1990, 12, 17);
		Empleado empleado2 = new Empleado("renee", 95000, 1998, 13, 14);
		Empleado empleado3 = new Empleado("Sofi", 105000, 1980, 4, 29);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("nombre: "+ empleado1.dameNombre()+ " Sueldo: "+  empleado1.dameSueldo()
		          + " Fecha de alta: "+ empleado1.dameFechaContrato());
		
		System.out.println("nombre: "+ empleado2.dameNombre()+ " Sueldo: "+  empleado2.dameSueldo()
        + " Fecha de alta: "+ empleado2.dameFechaContrato());
		
		System.out.println("nombre: "+ empleado3.dameNombre()+ " Sueldo: "+  empleado3.dameSueldo()
        + " Fecha de alta: "+ empleado3.dameFechaContrato());
		
		*/
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0]= new Empleado("manuel", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("renee", 95000, 1998, 13, 14);
		misEmpleados[2] = new Empleado("Sofi", 105000, 1980, 4, 29);
		
		for (Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
			System.out.println("nombre:" + e.dameNombre()+ " sueldo: " + e.dameSueldo()+
					           " fecha de alta: " + e.dameFechaContrato());     
			
			
		}
	}
}

	class Empleado {

		public Empleado(String nom, double sue, int agno, int mes, int dia) {

			nombre = nom;
			
			sueldo = sue;
			
			GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

			altaContrato = calendario.getTime();
		

		}

		private String nombre;
		private double sueldo;
		private Date altaContrato;

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
			
			double aumento = sueldo*porcentaje/100;
			
			sueldo+=aumento;	
					
			
		}


	}


