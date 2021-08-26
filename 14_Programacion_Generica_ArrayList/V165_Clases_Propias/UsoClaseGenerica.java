package V165_Clases_Propias;

public class UsoClaseGenerica {

	public static void main(String[] args) {
		
		
		ClaseGerica<String> uno = new ClaseGerica<String>();
		
		uno.setValorClaseGenerica("Manuel");
		
		System.out.println(uno.getValorClaseGenerica());
		
		
		
		Persona persona1 = new Persona("persona1");
		
		ClaseGerica<Persona>  dos = new ClaseGerica<Persona>();
		
		dos.setValorClaseGenerica(persona1);
		

		
		System.out.println(dos.getValorClaseGenerica().getNombre());
		
	

	}

}


class Persona {
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	private String nombre;
}