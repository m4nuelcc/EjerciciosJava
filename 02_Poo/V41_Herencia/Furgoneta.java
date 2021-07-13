package V41_Herencia;

public class Furgoneta extends Coche {
	
	
	private int capacidad_Carga;
	private int plazas_extra;
	
	
	public Furgoneta(int capacidad_Carga, int plazas_extra) {
		
		super(); //llama al contructor de la clase padre coche
		
		this.capacidad_Carga = capacidad_Carga;
		
		this.plazas_extra = plazas_extra;
	}
	
	public String dimeDatosFurgoneta() {
		
		return "la capacidad de carga es: " + capacidad_Carga + 
				" y el numero de plazas son: " + plazas_extra;
	}
	
	

}
