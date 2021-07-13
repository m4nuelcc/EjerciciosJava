import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce el nombre por favor:");
		
		String  edad = JOptionPane.showInputDialog("introduce la edad por favor:");
		
		int edad_usuario = Integer.parseInt(edad);
		
		//edad_usuario++;
		
		System.out.println("hola " + nombre_usuario + " el año que viene tendras: " + edad_usuario);
		

	}

}
