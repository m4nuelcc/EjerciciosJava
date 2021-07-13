package V70_Controlando_Estado_ventana;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

public class V70_Controlando_Estado_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoEstado miMarco = new MarcoEstado();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame {

	public MarcoEstado() {

		setVisible(true);

		setTitle("Controlando estado de la ventana");

		setBounds(300, 300, 500, 350);

		CambioEstado nuevo_estado = new CambioEstado();

		addWindowStateListener(nuevo_estado);
		
	}
}

class CambioEstado implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {

		//System.out.println("la ventana ha cambiado de estado");

		// System.out.println(e.getNewState());

		// if (e.getNewState()== 6)

		if (e.getNewState() == Frame.MAXIMIZED_BOTH) {

			System.out.println("ventana maximizada");
		} else if (e.getNewState() == Frame.NORMAL) {

			System.out.println("la ventana esta normal");
		} else if (e.getNewState() == Frame.ICONIFIED) {

			System.out.println("la ventana esta minimizada");
		}

	}

}