package V71_Eventos_de_Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class V71_Eventos_de_Teclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas miMarco = new MarcoConTeclas();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoConTeclas extends  JFrame{
	
	public MarcoConTeclas() {
		
		setTitle("Marco con Teclas");
		
		setVisible(true);
		
		setBounds(300,300,600,450);
		
		EnventoDeTeclado  tecla = new EnventoDeTeclado();
		
		addKeyListener(tecla);
		
	}
}

class EnventoDeTeclado implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
		char letra =e.getKeyChar();
		System.out.println(letra);
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int codigo = e.getKeyCode();
		System.out.println(codigo);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
	}
	
	
}