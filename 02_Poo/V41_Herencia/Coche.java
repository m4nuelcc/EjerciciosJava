package V41_Herencia;

public class Coche {

	private int ruedas; // Encapsulacion propiedades del objeto

	private int largo;

	private int ancho;

	private int motor;

	private int peso_plataforma;

	private String color;

	private int peso_total;

	private boolean asientos_cuero, climatizador;

	public Coche() { // inicializando las propiedades con un constructor

		ruedas = 4;

		largo = 2000;

		ancho = 300;

		peso_plataforma = 5000;

		motor = 1600;

	}

	public String dime_datos_generales() { // METODO GETTER

		return "la plataforma del coche tiene " + ruedas + " ruedas" + ". Mide " + largo / 100
				+ " metros con un ancho de " + ancho + " cm y un peso de plataforma " + peso_plataforma + " kg";

	}

	public void establece_color(String Color_coche) { // METODO SETTER

		color = Color_coche;
	}

	public String dime_color() { // METODO GETTER

		return "el color del coche es: " + color;
	}

	public void configura_asientos(String asientos_cuero) { // SETTER

		if (asientos_cuero.equalsIgnoreCase("si")) {

			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}

	};

	public String dime_asientos() { // GETTER

		if (asientos_cuero == true) {
			return "Los asientos son de Cuero";
		} else {
			return "los asientos son de serie";
		}
	};

	public void configura_climatizador(String climatizador) { // SETTER

		if (climatizador.equalsIgnoreCase("si")) {

			this.climatizador = true;

		} else {

			this.climatizador = false;
		}
	}

	public String dime_climatizador() {

		if (climatizador == true) {
			return "El coche incorpora climatizador";
		} else {
			return "el coche lleva Aire Acondicionado";
		}
	}

	public String dime_peso_coche() { // GETTER + SETTER

		int peso_carroceria = 5000;

		peso_total = peso_plataforma + peso_carroceria;

		if (asientos_cuero == true) {

			peso_total = peso_total + 20;

		}

		if (climatizador == true)

			peso_total = peso_total + 30;

		return "el peso total del coche es: " + peso_total;

	}

	public int precio_coche() {

		int precioFinal = 10000;

		if (asientos_cuero = true) {

			precioFinal += 2000;

		}

		if (climatizador = true) {

			precioFinal += 1500;
		}

		return precioFinal;
	}

}
