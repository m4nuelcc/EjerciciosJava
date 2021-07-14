package V94_2_Swing_JRadioButton_II_CodigoMejorado;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

//min15:39

public class V94_2_Swing_JRadioButton_II {

	public static void main(String[] args) {

		VentanaCheck miventana = new VentanaCheck();

		miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class VentanaCheck extends JFrame {

	public VentanaCheck() {

		setVisible(true);

		setTitle("Ventana CheckBox ");

		setBounds(550, 300, 500, 350);

		Lamina milamina = new Lamina();

		add(milamina);

	}

}

class Lamina extends JPanel {

	public Lamina() {

		setLayout(new BorderLayout());

		texto = new JLabel("En algun lugar de la Mancha de cuyo nombre...");
		
		texto.setFont(new Font("Serif", Font.PLAIN,12)); //definimos tipografia letra
		
		add(texto, BorderLayout.CENTER);
		
		laminaBotones=new JPanel();
		
		migrupo= new ButtonGroup();
		
		ColocarBotones("extrapequeño", false,5);
		ColocarBotones("pequeño", false,10);
		ColocarBotones("Mediano", true,12);
		ColocarBotones("Grande", false,18);
		ColocarBotones("Extragrande", false,24);
		
		add(laminaBotones, BorderLayout.SOUTH);

	}
	
	public void ColocarBotones (String nombre, boolean seleccionado,final int tamagno) {
		
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		

		
		migrupo.add(boton);
		
		laminaBotones.add(boton);
		
		ActionListener mievento = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				texto.setFont(new Font("Sefif", Font.PLAIN,tamagno ));
				
				System.out.println(boton.getText());
				
				
			}
		};
		
		boton.addActionListener(mievento);
		
	}

	

	private JLabel texto;

	// private JRadioButton boton1, boton2, boton3, boton4;
	
	private ButtonGroup migrupo;
	
	private JPanel laminaBotones;

}