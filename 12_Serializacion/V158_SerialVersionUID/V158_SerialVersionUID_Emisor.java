package V158_SerialVersionUID;

import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

import java.io.Serializable;
import java.util.*;



public class V158_SerialVersionUID_Emisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Administrador jefe=new Administrador("Juan", 80000, 2005,12,15);
		
		jefe.setIncentivo(5000);
		
		
		Empleado[] personal=new Empleado[3];
		
		personal[0]=jefe;
		
		personal[1]=new Empleado("Ana", 25000, 2008, 10,1);
		
		personal[2]=new Empleado("Luis", 18000, 2012, 9,15);
		
		
		try {
			
			// Serializamos Y guardamos en un fichero
			
			ObjectOutputStream fichero_salida = new ObjectOutputStream(new FileOutputStream("12_Serializacion/V158_SerialVersionUID/FicheroSerializadoII.dat"));
			
			fichero_salida.writeObject(personal);
			
			fichero_salida.close();
			
			
			//leemos fichero serializado lo guardamos en un array y lo leemos
			
//			ObjectInputStream lecturaFichero = new ObjectInputStream(new FileInputStream("12_Serializacion/V158_SerialVersionUID/FicheroSerializadoII.dat"));
//			
//			Empleado[] ficheroRecuperado = (Empleado[]) lecturaFichero.readObject();
//			
//			lecturaFichero.close();
//			
//			
//			for (Empleado empleado: ficheroRecuperado) {
//				
//				System.out.println(empleado);
//			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	
		
	}

}

//-----------------------------------------------------------------------------------------------------------

class Empleado implements Serializable{
	
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Empleado(String n, double s, int agno, int mes, int dia){
		
		nombre=n;
		
		sueldo=s;
		
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		
		fechaContrato=calendario.getTime();
		
		
		
		
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public Date getFechaContrato() {
		return fechaContrato;
	}

	
	public void subirSueldo(double porcentaje){
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	public String toString(){
		
		return "El Nombre eees =" + nombre + ",y su sueldo es =" + sueldo + ", fecha de contrato=" + fechaContrato;
		
	}

	private String nombre;
	
	private double sueldo;
	
	private Date fechaContrato;
	

	
}

//--------------------------------------------------------------------------------------------------------

class Administrador extends Empleado{
	
	


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public Administrador(String n, double s, int agno, int mes, int dia){
			
			super(n,s,agno,mes,dia);
			
			incentivo=0;
			
		}
		
		public double getSueldo(){
			
			double sueldoBase=super.getSueldo();
			
			return sueldoBase + incentivo;
			
		}
		
		public void setIncentivo(double b){
			
			incentivo=b;
		}
		
		
		public String toString(){
			
			return super.toString() + " Incentivo=" + incentivo;
			
		}
	
		private double incentivo;
	
}

