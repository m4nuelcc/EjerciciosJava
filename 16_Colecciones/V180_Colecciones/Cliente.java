package V180_Colecciones;

import java.util.Objects;

public class Cliente {

	
	
	public Cliente(String nombre, String N_Cuenta, double saldo) {
		
		this.nombre = nombre;
		
		this.N_Cuenta = N_Cuenta;
		
		this.saldo = saldo;
	}
	
	
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN_Cuenta() {
		return N_Cuenta;
	}

	public void setN_Cuenta(String n_Cuenta) {
		N_Cuenta = n_Cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}




	private String nombre;
	
	private String N_Cuenta;
	
	private double saldo;
	
	
	
}
