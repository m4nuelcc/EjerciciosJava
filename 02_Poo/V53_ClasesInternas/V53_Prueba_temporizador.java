package V53_ClasesInternas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class V53_Prueba_temporizador {

	public static void main(String[] args) {

		Reloj mireloj = new Reloj(3000, true);
		mireloj.enMarcha();

		JOptionPane.showMessageDialog(null, "pulda aceptar para terminar");

	}
}

class Reloj {

	private int intervalo;
	private boolean sonido;

	public Reloj(int intervalo, boolean sonido) {

		this.intervalo = intervalo;
		this.sonido = sonido;

	}

	public void enMarcha() {

		ActionListener oyente = new DameLaHora2();
	
		//DameLaHora2 oyente2 = new DameLaHora2(); // tambien se puede hacer asu
		
		

		Timer miTemnporizador = new Timer(intervalo, oyente);

		miTemnporizador.start();
	}
	

	private class DameLaHora2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Date ahora = new Date();

			System.out.println("Te pongo la hora cada 3 seg:" + ahora);

			if (sonido) {

				Toolkit.getDefaultToolkit().beep();
			}

		}

	}

}
