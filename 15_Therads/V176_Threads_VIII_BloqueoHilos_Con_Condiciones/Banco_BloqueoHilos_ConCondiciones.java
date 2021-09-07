package V176_Threads_VIII_BloqueoHilos_Con_Condiciones;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco_BloqueoHilos_ConCondiciones {

	public static void main(String[] args) {

		Banco b = new Banco();
		
		for (int i=0; i<100  ; i++){
			
		EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);	
		
		Thread t = new Thread(r);
		
		
		
		t.start();
			
		}
		
	}

}

class Banco {

	public Banco() {

		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {

			cuentas[i] = 2000;
			

		}

	}

	public void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) {

		cierraBanco.lock(); //bloquea el hilo que esta entre las llaves try catch
		
		try {
		
		if (cuentas[cuentaOrigen] < cantidad) {
			
			
			System.out.println(" ************ SALDO INSUFICIENTE ***************"+" Hilo " + Thread.currentThread().getName() + "\n");
			System.out.println(" CUENTA: " + cuentaOrigen + " Tiene un saldo de:"+ cuentas[cuentaOrigen] 
					+ " Cantidad: " + cantidad  + " En el hilo: " + Thread.currentThread().getName()+ "\n");
			
			

			return;

		}else {
			
			System.out.println("\n *******CANTIDAD OK****** CUENTA : " + cuentaOrigen + "hilo " + Thread.currentThread().getName()+ "\n");
		}

		//System.out.println(Thread.currentThread().getName()); // hilo que va a realizar la transferencia

		cuentas[cuentaOrigen] -= cantidad; // descontamo la cantidad de la transferencia

		System.out.printf("%10.2f de %d para %d ", cantidad, cuentaOrigen, cuentaDestino);

		cuentas[cuentaDestino] += cantidad; // incrementeamos la cantidad de transferencia

		System.out.printf("saldo total: %10.2f%n \n", getSaldoTotal());

		}finally {
			
			cierraBanco.unlock();
		}
	}

	public double getSaldoTotal() {

		double suma_Cuentas = 0;

		for (double a : cuentas) {

			suma_Cuentas += a;
		}

		return suma_Cuentas;
		
	}

	private final double cuentas[];
	
	private Lock cierraBanco = new ReentrantLock();
	
	
	
	
}

class EjecucionTransferencias implements Runnable {

	public EjecucionTransferencias(Banco b, int de, double max) {

		banco = b;

		deLacuenta = de;

		cantidadMax = max;

	}

	public void run() {

		while (true) {

			try {

				int paraLacuenta = (int) (Math.random() * 100); // numeros de cuentas aleatorios

				double cantidad = cantidadMax * Math.random(); // cantidades para ingresar aletatorias

				banco.transferencia(deLacuenta, paraLacuenta, cantidad);

				Thread.sleep((int) Math.random() * 10);

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

	private Banco banco;

	private int deLacuenta;

	private double cantidadMax;

}
