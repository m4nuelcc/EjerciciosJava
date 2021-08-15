package V143_Excepciones_Throws_Try_Catch;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class V143_LeerImagen {

	public static void main(String[] args) {

		MicarciImagen miMarco = new MicarciImagen();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MicarciImagen extends JFrame {

	public MicarciImagen() {

		setTitle("Marco con imagen");

		setVisible(true);

		setBounds(600, 300, 250, 400);

		Milamina miLamina = new Milamina();

		add(miLamina);

	}
}

class Milamina extends JPanel {

	public Milamina() {

		try {
			imagen = ImageIO.read(new File("10_Excepciones/V143_Excepciones_Throws_Try_Catch/bola1.jpg"));
		} catch (IOException e) {

			System.out.println("No se ha podido cargar la imagen");
			e.printStackTrace();
		}

	}
	

	public void paintComponent(Graphics g) {

		if (imagen == null) {

			g.drawString("no se ha podigo cagar la imagen", 10, 10);

		} else {

			super.paintComponent(g);
			
			int anchuraImagen = imagen.getHeight(this); // recoge el ancho de la lamina
			
			int alturaImagen = imagen.getWidth(this); // recogemos la algura
			
			System.out.println( alturaImagen+ "   " +  anchuraImagen);
			

			g.drawImage(imagen, 0, 0, null);

			for (int i = 0; i < 800; i++) {

				for (int x = 0; x < 900; x++) {

					// g.copyArea(0, 0, 255, 255, 200*i, 200*x);
					g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen * i, alturaImagen * x); //copia un area de la imagen en las coordenada ke le digamos

				}
			}
		}

	}

	private Image imagen;

}