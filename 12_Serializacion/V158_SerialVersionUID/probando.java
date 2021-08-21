package V158_SerialVersionUID;

public class probando {

	public static void main(String[] args) {

		V158_SerialVersionUID_Receptor_II receptor = new V158_SerialVersionUID_Receptor_II();

		Empleado[] lista;

		lista = receptor.lectura();

		for (Empleado e : lista) {

			System.out.println(e);

			System.out.println("nombre: " + e.getNombre());
		}

	}

}
