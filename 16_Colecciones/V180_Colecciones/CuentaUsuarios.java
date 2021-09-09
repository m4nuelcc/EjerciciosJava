package V180_Colecciones;

import java.util.*;

public class CuentaUsuarios {

	public static void main(String[] args) {

		Cliente cl1 = new Cliente("manu", "001", 55000);

		Cliente cl2 = new Cliente("renee", "002", 35000);

		Cliente cl3 = new Cliente("sofia", "003", 15000);

		Cliente cl4 = new Cliente("pedro", "004", 75000);

		Cliente cl5 = new Cliente("manu", "001", 35000);

		Set<Cliente> listaClientes = new HashSet<Cliente>();

		listaClientes.add(cl1);

		listaClientes.add(cl2);

		listaClientes.add(cl3);

		listaClientes.add(cl4);

		listaClientes.add(cl5);
		
		//Se añade cl5 porque aun no hemos modificado en la clase cliente el equals

		for (Cliente clientes : listaClientes) {

			System.out.println("******************************\n");

			System.out.println("Nombre: " + clientes.getNombre());

			System.out.println("N Cuenta: " + clientes.getN_Cuenta());

			System.out.println("Saldo: " + clientes.getSaldo() + "\n");

		}

	}

}
