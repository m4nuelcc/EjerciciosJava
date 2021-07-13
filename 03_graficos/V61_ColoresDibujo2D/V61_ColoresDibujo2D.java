package V61_ColoresDibujo2D;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class V61_ColoresDibujo2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos miMarco = new MarcoConDibujos();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MarcoConDibujos extends JFrame {

	public MarcoConDibujos() {

		setTitle("prueba de Colores");

		setSize(400, 400);

		LaminaConFigurasColor miLamina = new LaminaConFigurasColor();

		add(miLamina);
		
		miLamina.setBackground(Color.orange); //dar color a la lamina "fondo"
		
		miLamina.setBackground(SystemColor.window);  //dar color del sistema 

	}
}

class LaminaConFigurasColor extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g; // estamos haciendo una refundicion hemos convertido g en graphics2d
                                        //importante para poder pintar en 2D
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.setPaint(Color.blue);
		
		g2.draw(rectangulo); //Pinta los bordes o trazos
		
		g2.setPaint(Color.RED);

		g2.fill(rectangulo); //rellena la figura
		
		//g2.draw(rectangulo);
		

		Ellipse2D elipse = new Ellipse2D.Double();

		elipse.setFrame(rectangulo); //para pintar el eclipse se utiliza el area del rectangulo
								     // si fuera un cudrado dibujariamos un circulo
		//g2.setPaint(Color.BLUE);
		
		Color negro =new  Color(0,0,1);
		g2.setPaint(negro);
		
		//g2.setPaint(new Color(109,172,59).brighter()); //Pintar RGB, brighter mas claridad
				
		g2.fill(elipse);
		
		//g2.draw(elipse);
		
		


	}

}







