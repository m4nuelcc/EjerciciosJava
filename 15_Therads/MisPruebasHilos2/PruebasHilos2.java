package MisPruebasHilos2;

public class PruebasHilos2 implements Runnable{

	public PruebasHilos2 (String nombre, int finalizar) {
		
		this.nombre = nombre;
		
		this.finalizar = finalizar;
	}

	public void run() {
		
		for (int i=0; i<finalizar; i++) {
			
			System.out.println(nombre + " hilo numero: " + i);
			
		}
		
		System.out.println("fin hilo: " + nombre);
		
		
	}

	private String nombre;
	
	private int finalizar;
}
