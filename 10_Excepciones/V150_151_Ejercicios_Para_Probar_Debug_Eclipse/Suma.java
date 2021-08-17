package V150_151_Ejercicios_Para_Probar_Debug_Eclipse;

public class Suma implements IOperaciones {

	private int numero1;
	
	private int numero2;
	
	public Suma() {
		
	this.numero1=8;
	this.numero2=8;
		
	}
	
	public int operaciones(int numero1, int numero2) {
		
		int resultado = numero1 + numero2;
		
		return resultado;
	}

	
	

}
