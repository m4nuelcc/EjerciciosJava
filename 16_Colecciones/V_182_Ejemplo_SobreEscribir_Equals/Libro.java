package V_182_Ejemplo_SobreEscribir_Equals;

import java.util.Objects;

public class Libro {

	public Libro(String autor, String titulo, int indice) {

		this.autor = autor;

		this.titulo = titulo;

		this.indice = indice;
	}
	
	

	
	
	@Override
	public int hashCode() {
		return Objects.hash(indice);
	}





//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Libro other = (Libro) obj;
//		return indice == other.indice;
//	}


	public boolean equals(Object obj) {
		
		if(obj instanceof Libro) {
			
			Libro otro= (Libro) obj;
			
			if(this.indice==otro.indice) {
				
				return true;
			}else {
				
				return false;
			}
		}else {
			
			return false;
		}
	}


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	private String autor;

	private String titulo;

	private int indice;
}
