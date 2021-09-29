package modelo;

public class EjecutaConsultas {
	
	
	public String filtraBBDD (String secciones, String paises) {
		
		String resultado="";
		
		
		if (!secciones.equals("Todos") && paises.equals("Todos")) {
			
			resultado = "has elegido secciones";
			
		}else if (!paises.equals("Todos") && secciones.equals("Todos")) {
			
			resultado = "has elegido paises";
			
		}else {
			
			resultado = "has elegido ambos";
		}
		
		
		
		return resultado;
		
	}

}
