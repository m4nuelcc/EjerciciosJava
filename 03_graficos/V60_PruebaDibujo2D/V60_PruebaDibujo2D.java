package V60_PruebaDibujo2D;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class V60_PruebaDibujo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();

		miMarco.setVisible(true);

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {

		setTitle("prueba de Dibujo");

		setSize(400, 400);

		LaminaConFiguras miLamina = new LaminaConFiguras();

		add(miLamina);

	}
}

class LaminaConFiguras extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g; // estamos haciendo una refundicion hemos convertido g en graphics2d
                                        //importante para poder pintar en 2D
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

		g2.draw(rectangulo);

		Ellipse2D elipse = new Ellipse2D.Double();

		elipse.setFrame(rectangulo);

		g2.draw(elipse);

		g2.draw(new Line2D.Double(100, 100, 300, 250)); // instanciando y pintatando a la vez

		double CentroEnX = rectangulo.getCenterX();
		double CentroEnY = rectangulo.getCenterY();
		double Radio = 150;

		Ellipse2D circulo = new Ellipse2D.Double();
		// circulo.setFrameFromCenter(Radio, CentroEnX, CentroEnY, Radio);
		circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX + Radio, CentroEnY + Radio);

		g2.draw(circulo);

	}

}