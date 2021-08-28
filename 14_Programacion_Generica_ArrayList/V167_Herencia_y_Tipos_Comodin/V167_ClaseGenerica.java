package V167_Herencia_y_Tipos_Comodin;

public class V167_ClaseGenerica <T>{
	
	public V167_ClaseGenerica() {
		
		valorClaseGenerica = null;
		
	}
	
	

	
	public T getValorClaseGenerica() {
		
		return valorClaseGenerica;
	}



	public void setValorClaseGenerica(T valorClaseGenerica) {
		
		this.valorClaseGenerica = valorClaseGenerica;
	}




	public static void imprimirTrabajador(V167_ClaseGenerica<? extends V167_Empleado> p) {
		
		V167_Empleado primero = p.getValorClaseGenerica();
		
		System.out.println(primero);
		
		System.out.println("llega");
		
		
	}
	private T valorClaseGenerica;
}
