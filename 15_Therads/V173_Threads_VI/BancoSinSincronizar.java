package V173_Threads_VI;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

	public static void main(String[] args) {

		Banco b = new Banco();

		for (int i = 0; i < 100; i++) {

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

		if (cuentas[cuentaOrigen] < cantidad) {

			System.out.println(" error cuenta origen: " + cuentas[cuentaOrigen] + " Cantidad " + cantidad + " hilo  "
					+ Thread.currentThread().getName());

			return;

		}

		System.out.println(Thread.currentThread().getName()); // hilo que va a realizar la transferencia

		cuentas[cuentaOrigen] -= cantidad; // descontamo la cantidad de la transferencia

		System.out.printf("%10.2f de %d para %d ", cantidad, cuentaOrigen, cuentaDestino);

		cuentas[cuentaDestino] += cantidad; // incrementeamos la cantidad de transferencia

		System.out.printf("saldo total: %10.2f%n", getSaldoTotal());

	}

	public double getSaldoTotal() {

		double suma_Cuentas = 0;

		for (double a : cuentas) {

			suma_Cuentas += a;
		}

		return suma_Cuentas;

	}

	private final double cuentas[];

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
