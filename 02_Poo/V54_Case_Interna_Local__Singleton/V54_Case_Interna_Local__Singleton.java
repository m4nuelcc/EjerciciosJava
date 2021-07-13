package V54_Case_Interna_Local__Singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.Timer;

public class V54_Case_Interna_Local__Singleton {

	public static void main(String[] args) {

		Reloj mireloj = new Reloj();
		mireloj.enMarcha(3000,true);

		JOptionPane.showMessageDialog(null, "pulda aceptar para terminar");
		System.exit(0);

	}
}

class Reloj {

	
	public void enMarcha(int intervalo,  final boolean sonido) {

		class DameLaHora2 implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {

				Date ahora = new Date();

				System.out.println("Te pongo la hora cada 3 seg:" + ahora);

				if (sonido) {

					Toolkit.getDefaultToolkit().beep();
				}

			}

		}

		ActionListener oyente = new DameLaHora2();

		Timer miTemnporizador = new Timer(intervalo, oyente);

		miTemnporizador.start();
	}

	//private int intervalo;

	//private boolean sonido;

}
