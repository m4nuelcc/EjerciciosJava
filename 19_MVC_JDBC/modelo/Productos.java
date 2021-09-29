package modelo;

public class Productos {
	
	public Productos () {
		
		nArticulo="";
		seccion="";
		precio ="";
		paisDeOrigen="";
		
	}

	
	
	public String getnArticulo() {
		return nArticulo;
	}

	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}



	private String nArticulo;
	
	private String seccion;
	
	private String precio;
	
	private String paisDeOrigen;
	
	
}
