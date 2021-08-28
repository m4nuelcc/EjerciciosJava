package V167_Herencia_y_Tipos_Comodin;

public class V167_Uso_HerenciaGenericos {

	public static void main(String[] args) {
		
		V167_Empleado administrativa = new V167_Empleado("renee", 45, 6500);
		
		V167_Jefe Directora = new V167_Jefe("deborah", 55, 70000);
		
		V167_Empleado JefePersonal = Directora;
		
		System.out.println(JefePersonal.dameDatos());
		
		
		
		V167_ClaseGenerica<V167_Empleado> administrativa2 = new V167_ClaseGenerica<V167_Empleado>();
		
		V167_ClaseGenerica<V167_Jefe> directora2 = new V167_ClaseGenerica<V167_Jefe>();
		
		V167_ClaseGenerica<V167_Jefe> jefe = directora2;
		
	
		
		
		V167_ClaseGenerica.imprimirTrabajador(administrativa2);
		
		V167_ClaseGenerica.imprimirTrabajador(jefe);
		
		
		//V167_ClaseGenerica<V167_Empleado> jefe = directora2;  //no funciona porque directora2 de de clase jefe
		
		
		
		
		
	
		
		

	}

}
