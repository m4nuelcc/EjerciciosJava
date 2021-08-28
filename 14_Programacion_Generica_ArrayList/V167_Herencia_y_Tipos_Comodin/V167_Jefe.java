package V167_Herencia_y_Tipos_Comodin;

public class V167_Jefe extends V167_Empleado{

	public V167_Jefe(String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		
	}

	
	public double incentivo (double inc) {
		
		return inc;
	}
}
