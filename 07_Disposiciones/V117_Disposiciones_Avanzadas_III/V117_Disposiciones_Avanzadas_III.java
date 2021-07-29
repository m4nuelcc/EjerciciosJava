package V117_Disposiciones_Avanzadas_III;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;





public class V117_Disposiciones_Avanzadas_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MarcoMuelle mimarco = new MarcoMuelle();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoMuelle extends JFrame{
	
	public MarcoMuelle() {
		
		setTitle("Marco Muelle");
		
		setBounds(600,300,1000,350);
		
		LaminaMuelle milamina = new LaminaMuelle();
		
		add(milamina);
		
		setVisible(true);
		
		
	}
}


class LaminaMuelle extends JPanel{
	
	public LaminaMuelle() {
		
		JButton bton1 = new JButton("Boton1");
		
		JButton bton2 = new JButton("Boton2");
		
		JButton bton3 = new JButton("Boton3");
		
		SpringLayout milayout = new SpringLayout();
		
		setLayout(milayout);
		
		add(bton1);
		
		add(bton2);
		
		add(bton3);
		
		Spring mimuelle = Spring.constant(0,10,100);
		
		Spring muelleRigido = Spring.constant(10);
		
		milayout.putConstraint(SpringLayout.WEST, bton1, mimuelle, SpringLayout.WEST, this);
		
		//borde izquierdo del boton1---Borde izquierdo del contenedor
		
		milayout.putConstraint(SpringLayout.WEST, bton2, muelleRigido, SpringLayout.EAST, bton1);
		
		//borde izquierdo de boton2------borde derecho boton1
		
		milayout.putConstraint(SpringLayout.WEST, bton3, muelleRigido, SpringLayout.EAST, bton2);
		
		//borde izquierdo boton3------- borde derecho boton2
		
		milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, bton3);
		
		//Borde derecho contenedor------- borde izquierdo boton3

		
		
		
		
	}
}