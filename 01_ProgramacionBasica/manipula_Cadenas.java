
public class manipula_Cadenas {

	public static void main(String[] args) {
		
		String nombre="la polla records";
		
		System.out.println("mi nombre es " + nombre);
		
		System.out.println("el nombre " + nombre + " tiene " + nombre.length() + " letras");
		
		System.out.println("la primera letra de " + nombre + " es " + nombre.charAt(0));
		    
		System.out.println("la ultima letra de " + nombre + " es :" + nombre.charAt(nombre.length()-1));
		
		//la dos ultimas lineas hacen lo mismo k la de arriba
		
		int ultima_letra = nombre.length();
		
		System.out.println("la ultima letra de " + nombre + " es :" + nombre.charAt(ultima_letra-1));	}

}
