package V115_Disposicones_Avanzadas_I;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class V115_Disposicones_Avanzadas_I {

	public static void main(String[] args) {
		
		
		MarcoCaja miMarco = new MarcoCaja();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}
	

}


class MarcoCaja extends JFrame{
	
	public MarcoCaja() {
		
		
		setTitle("marco en la caja");
		
		setBounds(600, 350, 200, 200);
		
		JLabel rotulo1 = new JLabel("Nombre");
		
		JTextField texto1 = new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());
		
		Box cajaH1= Box.createHorizontalBox();
		
		cajaH1.add(rotulo1);
		
		cajaH1.add(Box.createHorizontalStrut(10));
		
		cajaH1.add(texto1);
		
		//-------------------------------------------------------
		
		JLabel rotulo2 = new JLabel("Contraseņa");
		
		JTextField texto2 = new JTextField(10);
		
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH2=Box.createHorizontalBox();
		
		cajaH2.add(rotulo2);
		
		cajaH2.add(Box.createHorizontalStrut(10));
		
		cajaH2.add(texto2);

		
		//-------------------------------------------------------
		
		JButton bton1 = new JButton("ok");
		
		JButton bton2 = new JButton("Cancelar");
		
		Box cajaH3 = Box.createHorizontalBox();
		
		cajaH3.add(bton1);
		
		cajaH3.add(Box.createGlue());
		
		cajaH3.add(bton2);
		
		//-------------------------------------------------------
		
		
		
		Box cajaVertical = Box.createVerticalBox();
		
		cajaVertical.add(cajaH1);
		
		cajaVertical.add(cajaH2);
		
		cajaVertical.add(cajaH3);
		
	    add(cajaVertical, BorderLayout.CENTER);
	    
		
	}
	
}