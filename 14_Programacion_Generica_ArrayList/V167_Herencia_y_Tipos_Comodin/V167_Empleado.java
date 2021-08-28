package V167_Herencia_y_Tipos_Comodin;

public class V167_Empleado {
	
	
	
	public V167_Empleado(String nombre, int edad, double salario) {
		
		this.nombre = nombre;
	
		this.edad = edad;
		
		this.salario = salario;
	}
	
	public String dameDatos() {
		
		return "el Empleado "+ nombre + " Tiene una Edad de " + edad + " años  y un salario de: " + salario;
	}

	private String nombre;
	
	private int edad;
	
	private double salario;
	
	

}
