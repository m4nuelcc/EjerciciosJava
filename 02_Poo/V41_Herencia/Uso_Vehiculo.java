package V41_Herencia;


public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1= new Coche();
		
		micoche1.establece_color("ROJO");
		
		Furgoneta miFurgo2 = new Furgoneta(5,580);
		
		miFurgo2.establece_color("VERDE");
		
		miFurgo2.configura_asientos("si");
		
		miFurgo2.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales()+ " Color es:" + micoche1.dime_color());
		
		System.out.println(miFurgo2.dime_datos_generales()+ miFurgo2.dimeDatosFurgoneta());
		
	
	}
	
	
}




























/*/import javax.swing.JOptionPane;*/
/*Coche micoche = new Coche(); //ESto es instanciar- coche()-- es el metodo constructor
		                             // micoche es la instacia
		
		micoche.establece_color("rojo");
		
		micoche.configura_asientos("si");
		
		micoche.configura_climatizador("no");
		
		micoche.configura_asientos("si");
		
		
		System.out.println(micoche.dime_datos_generales() + "\n");
		
		System.out.println(micoche.dime_color());
		
		System.out.println(micoche.dime_asientos() + "\n" +
				           micoche.dime_climatizador() + "\n" +
				           micoche.dime_peso_coche());
 */