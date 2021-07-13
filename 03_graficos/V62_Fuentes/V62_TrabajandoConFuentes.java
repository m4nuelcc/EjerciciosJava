package V62_Fuentes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class V62_TrabajandoConFuentes {

	public static void main(String[] args) {
	
		MarcoConFuentes miMarco = new MarcoConFuentes();
		
		miMarco.setLocation(200, 300);
		
		miMarco.setVisible(true);
		

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con Fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes miLamina = new LaminaConFuentes();
		
		add(miLamina);
		
		miLamina.setForeground(Color.BLUE); // todo lo que se esvriba en la lamina es azul
		
		
	}
	
	
}


class LaminaConFuentes extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Courier", Font.BOLD,26);
		
		g2.setFont(mifuente);
		
	//	g2.setColor(Color.BLUE);
		
		g2.drawString("Manuel", 150, 100);
		
		
		g2.setFont(new Font("Symbol", Font.ITALIC, 36));
		
	//	g2.setColor(Color.GREEN.brighter());
		
		g2.drawString("Curso de Java", 200,200);
	
	}
	
	
	
}