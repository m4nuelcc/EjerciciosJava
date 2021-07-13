package V63_InsetarImagenes;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class V63_InsetarImagenes {

	public static void main(String[] args) {
		
		MicarciImagen miMarco = new MicarciImagen();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MicarciImagen extends JFrame{
	
	public MicarciImagen() {
		
		setTitle("Marco con imagen");
		
		setVisible(true);
		
		setBounds(0, 0, 900, 800);
		
		Milamina miLamina = new Milamina();
		
		add(miLamina);
		
	}
}

class Milamina extends JPanel{
	
//	public Milamina() {
//		
//		try {
//			//imagen = ImageIO.read(miImagen);
//			//imagen = ImageIO.read(new File("03_graficos/V63_InsetarImagenes/coche.jpg")); //instanciando directamente File
//			imagen = ImageIO.read(new File("03_graficos/V63_InsetarImagenes/bola.jpg")); //instanciando directamente File
//
//		} catch (IOException e ) {
//			
//			System.out.println("la imagen no se encuentra");
//			e.printStackTrace();
//		}
//	}
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		//File miImagen=new File("03_graficos/V63_InsetarImagenes/coche.jpg");
		
		try {
			//imagen = ImageIO.read(miImagen);
			imagen = ImageIO.read(new File("03_graficos/V63_InsetarImagenes/bola1.jpg")); //instanciando directamente File

		} catch (IOException e ) {
			
			System.out.println("la imagen no se encuentra");
			e.printStackTrace();
		}
		int anchuraImagen=imagen.getHeight(this);  //recoge el ancho de la lamina
		int alturaImagen=imagen.getWidth(this);    //recogemos la algura
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i=0; i<800; i++) {
			
			for (int x=0; x<900; x++) {
				
				//g.copyArea(0, 0, 255, 255, 200*i, 200*x);
				g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen*i, alturaImagen*x);
				System.out.println(anchuraImagen);
				System.out.println(alturaImagen);

			}
		}
		//g.copyArea(0, 0, 480, 480, 450, 475);  //copia un area de la imagen en las coordenada ke le digamos
		
	}
	
	private Image imagen;
	
}