package MisPruebasHilos1;



public class Hilos {

	public static void main(String[] args) {
		
		
		HilosNumeroLEtras h1 = new HilosNumeroLEtras(1);
		
		HilosNumeroLEtras h2 = new HilosNumeroLEtras(2);
		
		Thread t1 = new Thread(h1);
		
		Thread t2 = new Thread(h2);
		
		t2.start();
		t1.start();

	}

}


