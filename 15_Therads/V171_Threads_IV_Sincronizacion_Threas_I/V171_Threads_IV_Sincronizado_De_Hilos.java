package V171_Threads_IV_Sincronizacion_Threas_I;

import java.util.Iterator;

public class V171_Threads_IV_Sincronizado_De_Hilos {

	public static void main(String[] args) {

		HilosVarios hilo0 = new HilosVarios();

		HilosVarios hilo2 = new HilosVarios();

		hilo0.start();

		try {

			hilo0.join();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		hilo2.start();

		try { // si no ponemos ests join se ejecutaria primiro el print y luego hilo2

			hilo2.join();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("terminado las tareas"); // esta en hilo del main

	}

}

class HilosVarios extends Thread {

	public void run() {

		for (int i = 0; i < 15; i++) {

			System.out.println("Ejecutando hilo" + getName()); // no da el nombre del hilo

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	

	}

}
