package poo;

public class SobrecargaConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleadosc trabajador1 = new Empleadosc("manuel");  //instancias de clase
		Empleadosc trabajador2 = new Empleadosc("Renee");
		Empleadosc trabajador3 = new Empleadosc("Rosa");
		Empleadosc trabajador4 = new Empleadosc("pedroo");
		
		trabajador1.cambiaSeccion("informatico");
		
//		System.out.println(trabajador2.devuelveDatos());
//		
//		System.out.println(trabajador3.devuelveDatos());
//		
//		System.out.println(trabajador4.devuelveDatos());
	
		System.out.println(trabajador1.devuelveDatos()+ "\n"+ 
				           trabajador2.devuelveDatos()+ "\n"+
			               trabajador3.devuelveDatos()+ "\n"+
				           trabajador4.devuelveDatos()+ "\n");
		
		System.out.println(Empleadosc.dameIdSiguiente() );
		

	}

}


class Empleadosc{
	
	private final String nombre; //final hace que nombre nunca se pueda cambiar, constante
	private String seccion;
	private int id;
	private static int IdSiguiente=1;
	
	public Empleadosc(String nom) {
		
		nombre=nom;
	
		seccion="administracion";
		
		id=IdSiguiente++;
	   // IdSiguiente++;
		
	}
	
	public static String dameIdSiguiente() {  //en en static se llama la clase y luego el metoso
		                                      // Empleadosc.dameIdSiguiente
		return "El IdSiguiente es el " + IdSiguiente;
	}
	
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
		
	}

	
	public String devuelveDatos() {
		
		return "el nombre es: " + nombre + " y la seccion es "+ seccion
				+" y el id: " + id;
	}
	
}