package V80_MultiplesOyentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V80_MultiplesOyentes {

	public static void main(String[] args) {

		Marco_principal miMarco = new Marco_principal();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_principal extends JFrame {

	public Marco_principal() {

		setTitle("prueba Varios");
		setBounds(1300, 100, 300, 200);

		LaminaPrincipal Lamina = new LaminaPrincipal();
		add(Lamina);

	}

}

class LaminaPrincipal extends JPanel {

	JButton bton_Cerrar;

	public LaminaPrincipal() {

		JButton bton_Abrir = new JButton("Abrir ventana");

		add(bton_Abrir);

		bton_Cerrar = new JButton("cerrar");

		add(bton_Cerrar);

		OyenteNuevo miOyente = new OyenteNuevo();

		bton_Abrir.addActionListener(miOyente);

	}

	private class OyenteNuevo implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Marco_Emergente marco = new Marco_Emergente(bton_Cerrar);

			marco.setVisible(true);

		}
	}
}

class Marco_Emergente extends JFrame {

	private static int contador = 0;

	public Marco_Emergente(JButton boton_de_principal) {

		contador++;

		setTitle("ventana: " + contador);

		setBounds(40 * contador, 40 * contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		
		boton_de_principal.addActionListener(oyenteCerrar);

	}
	
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
		
		
	}

}