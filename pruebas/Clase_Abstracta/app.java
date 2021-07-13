package Clase_Abstracta;

public class app {

	public static void main(String[] args) {
		
		Plantas planta = new Plantas();
		
		planta.comer();
		
	    AnimalCarnivoro leon = new AnimalCarnivoro();
	    
	    leon.comer();
	    
	    AnimalHervivoro elefante = new AnimalHervivoro();
	    
	    elefante.comer();

	}

}
