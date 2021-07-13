package V92_Swing_CheckBox;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class V92_Swing_CheckBox {

	public static void main(String[] args) {

		MarcoCheck miMarco = new MarcoCheck();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheck extends JFrame {

	public MarcoCheck() {

		setTitle("CheckBox");

		setBounds(550, 300, 550, 350);

		LaminaCheck miLamina = new LaminaCheck();

		add(miLamina);

		setVisible(true);

	}

}

class LaminaCheck extends JPanel {

	public LaminaCheck() {

		setLayout(new BorderLayout()); // tipo de disposicion

		Font miletra = new Font("Serif", Font.PLAIN, 24);

		texto = new JLabel("En un lugar de la Mancha cuyo nombre...");

		texto.setFont(miletra);

		JPanel laminaTexto = new JPanel();

		laminaTexto.add(texto);

		add(laminaTexto, BorderLayout.CENTER);

		check1 = new JCheckBox("Negrita");

		check2 = new JCheckBox("Cursiva");

		check1.addActionListener(new Manejacheck());

		check2.addActionListener(new Manejacheck());

		JPanel laminaCheck = new JPanel();

		laminaCheck.add(check1);

		laminaCheck.add(check2);

		add(laminaCheck, BorderLayout.SOUTH);

	}

	private class Manejacheck implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			
			if (check1.isSelected()) tipo=+Font.BOLD;
			
			if (check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new Font("Serif", tipo, 24));
			
			

		}
	}

	private JLabel texto;

	private JCheckBox check1, check2;

}
