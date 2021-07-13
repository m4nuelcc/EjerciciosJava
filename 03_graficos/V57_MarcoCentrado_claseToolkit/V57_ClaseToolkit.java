package V57_MarcoCentrado_claseToolkit;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;


public class V57_ClaseToolkit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	

	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla =Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla= mipantalla.getScreenSize();
		
		int alto = tamanoPantalla.height;
		
		int ancho = tamanoPantalla.width;
		
		setSize(ancho/2, alto/2);
		
		setLocation(ancho/4, alto/4);
		
		Image miIcono = mipantalla.getImage("icono2.gif");
		
		setIconImage(miIcono);
		
		
	}
}