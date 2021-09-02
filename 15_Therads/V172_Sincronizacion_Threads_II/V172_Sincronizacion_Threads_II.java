package V172_Sincronizacion_Threads_II;

import java.util.Iterator;

public class V172_Sincronizacion_Threads_II {

	public static void main(String[] args) {

		HilosVarios hilo0 = new HilosVarios();

		HilosVarios2 hilo2 = new HilosVarios2(hilo0);
		
		HilosVarios2 hilo3 = new HilosVarios2(hilo2);
		
		HilosVarios2 hilo4 = new HilosVarios2(hilo3);
		
		
		hilo3.start();
		
		hilo0.start();
		
		hilo2.start();
		
		hilo4.start();

		System.out.println("terminado las tareas"); // esta en hilo del main

	}

}

class HilosVarios extends Thread {

	public void run() {

		for (int i = 0; i < 15; i++) {

			System.out.println("Ejecutando hilo 0 " + getName()); // no da el nombre del hilo

			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	

	}

}

class HilosVarios2 extends Thread {
	
	public HilosVarios2(Thread hilo) {
		
		
		this.hilo=hilo;
		
	}

	public void run() {
		
		try {
			hilo.join();  //lanzamos al hilo que metemos por parametro
			
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}

		for (int i = 0; i < 15; i++) {

			System.out.println("Ejecutando hilo 1 " + getName()); // no da el nombre del hilo

			try {
				Thread.sleep(500);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	

	}
	
	private Thread hilo;

}
