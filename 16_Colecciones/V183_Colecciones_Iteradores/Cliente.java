package V183_Colecciones_Iteradores;

import java.util.Objects;

public class Cliente {

	public Cliente(String nombre, String N_Cuenta, double saldo) {

		this.nombre = nombre;

		this.N_Cuenta = N_Cuenta;

		this.saldo = saldo;
	}

	
	
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", N_Cuenta=" + N_Cuenta + ", saldo=" + saldo + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(N_Cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		
		Cliente other = (Cliente) obj;
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return Objects.equals(N_Cuenta, other.N_Cuenta);
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
