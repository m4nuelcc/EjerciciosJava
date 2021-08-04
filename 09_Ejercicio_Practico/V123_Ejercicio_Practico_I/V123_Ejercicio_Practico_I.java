package V123_Ejercicio_Practico_I;



import javax.swing.JFrame;
import javax.swing.JPanel;

public class V123_Ejercicio_Practico_I {

	public static void main(String[] args) {
	
		Marcos_Dialogo marcoDialogo = new Marcos_Dialogo();
		
		marcoDialogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marcos_Dialogo extends JFrame{
	
	public Marcos_Dialogo() {
		
		setBounds(600,300,650,500);
		
		setTitle("Ejercicio Marco Dialogo");
		
		
		setVisible(true);
		
	}
}

class Lamina_Botones extends JPanel{
	
	public Lamina_Botones() {
		
		
	}
}
