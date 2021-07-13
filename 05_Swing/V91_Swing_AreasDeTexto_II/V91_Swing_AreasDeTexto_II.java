package V91_Swing_AreasDeTexto_II;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class V91_Swing_AreasDeTexto_II {

	public static void main(String[] args) {

		MarcoPruebaArea miMarco = new MarcoPruebaArea();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPruebaArea extends JFrame {

	public MarcoPruebaArea() {

		setTitle("prueba  MarcoArea_II");

		setVisible(true);

		setBounds(500, 300, 500, 350);

		setLayout(new BorderLayout());

		laminaBotones = new JPanel();

		btonInsertar = new JButton("Insertar");

		btonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				areaTexto.append("en algun lugar de la mancha cuyo nombre no me acuerdo.....");

			}

		});

		laminaBotones.add(btonInsertar);

		btonSaltoLinea = new JButton("salto linea");

		btonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				boolean saltar = !areaTexto.getLineWrap();

				areaTexto.setLineWrap(saltar);

				/*if (saltar) {

					btonSaltoLinea.setText("quitar salto");
				} else {

					btonSaltoLinea.setText("Salto linea");
				}*/
				btonSaltoLinea.setText(saltar ? "equitar salto": "salto linea");
			}
		});

		laminaBotones.add(btonSaltoLinea);

		add(laminaBotones, BorderLayout.SOUTH);

		areaTexto = new JTextArea(8, 20);

		laminaConBarras = new JScrollPane(areaTexto);

		add(laminaConBarras, BorderLayout.CENTER);
	}

	private JPanel laminaBotones;

	private JButton btonInsertar, btonSaltoLinea;

	private JTextArea areaTexto;

	private JScrollPane laminaConBarras;

}