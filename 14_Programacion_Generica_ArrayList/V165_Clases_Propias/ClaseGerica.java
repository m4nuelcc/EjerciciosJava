package V165_Clases_Propias;

public class ClaseGerica <T>{
	
	public ClaseGerica() {
		
		valorClaseGenerica = null;
		
	}
	
	

	
	public T getValorClaseGenerica() {
		
		return valorClaseGenerica;
	}




	public void setValorClaseGenerica(T valorClaseGenerica) {
		
		this.valorClaseGenerica = valorClaseGenerica;
	}




	private T valorClaseGenerica;
}
