import javax.swing.*;

public class c20_peso_ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero = "";

		do {

			genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");

		} while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

		int altura = Integer.parseInt(JOptionPane.showInputDialog("iIntroduce la altura"));

		if (genero.equalsIgnoreCase("H")) {

			System.out.println("El peso ideal para un hombre de altura: " + altura + " centrimetros es de: "
					+ (altura - 110) + " Kg");

		} else
			System.out.println("El peso ideal para una mujer de altura: " + altura + " Centimetroses de: "
					+ (altura - 120) + " Kg");

	}

}
