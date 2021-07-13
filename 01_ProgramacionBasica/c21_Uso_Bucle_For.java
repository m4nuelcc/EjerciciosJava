import javax.swing.JOptionPane;

public class c21_Uso_Bucle_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroTabla = Integer.parseInt(JOptionPane.showInputDialog("indique el numero de la tabla"));

		for (int i=1; i<=10; i++) {
			
			System.out.println(numeroTabla + " x " + i + " = " + numeroTabla*i);
		}
	}

}
