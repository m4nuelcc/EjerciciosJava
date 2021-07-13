import java.util.*;


public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

} 

class empleado{
	
	public empleado(String nom, double sue, int agno, int mes, int dia ) {
		
		nombre=nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1 ,dia);
		
		AltaContrato = calendario.getTime();
		
	}
	
	public String DameNombre() { //getter
		
		return "nombre";
	}
	
	public double DimeSueldo() { //getter
		
		return sueldo;
		
	}
	
	
	public Date DameFechaContrato() { //getter
		
		return AltaContrato;
	}
	
	
	public void SubeSueldo(double porcentaje) {
		
		double aumento = sueldo*porcentaje/100;
		
		sueldo=+aumento;
		
	}
	
	
	private String nombre;
	
    private double sueldo;
	
	private Date AltaContrato;
	
	
	
	
	
	
		
		
	}
	
	
	

