package MisPruebasHilos2;

public class UsoMisPruebasHilos2 {

	public static void main(String[] args) {
		
		
		PruebasHilos2 hilo1 = new PruebasHilos2("hilo1", 100);
		
		PruebasHilos2 hilo2 = new PruebasHilos2("hilo2", 30);
		
		PruebasHilos2 hilo3 = new PruebasHilos2("hilo3", 10);
		
		PruebasHilos2 hilo4 = new PruebasHilos2("hilo4", 60);
		
		Thread h1 = new Thread(hilo1);
		
		Thread h2 = new Thread(hilo2);
		
		Thread h3 = new Thread(hilo3);
		
		Thread h4 = new Thread(hilo4);
		
		
		System.out.println("nombre del hilo " + h4.getName());
		
		h1.getName();
		
		h2.start();
		
		h3.start();
		
		h4.start();

	}

}
