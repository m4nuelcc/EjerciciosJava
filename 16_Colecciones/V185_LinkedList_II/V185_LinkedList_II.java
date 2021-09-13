package V185_LinkedList_II;

import java.util.LinkedList;
import java.util.ListIterator;

public class V185_LinkedList_II {

	public static void main(String[] args) {

		
		LinkedList<String> pares = new LinkedList<String>();           
        
		pares.add("Dos");                                              
		                                                               
		pares.add("Cuatro");                                           
		                                                               
		pares.add("Seis");                                             
		                                                               
		pares.add("Ocho");                                             
		                                                               
		pares.add("Diez");                                             
		                                                               
		LinkedList<String> impares = new LinkedList<String>();         
		                                                               
		impares.add("Uno");                                            
		                                                               
		impares.add("Tres");                                           
		                                                               
		impares.add("Cinco");                                          
		                                                               
		impares.add("Siete");                                          
		                                                               
		impares.add("Nueve");                                          
		                                                               
		ListIterator<String> itpares = pares.listIterator();           
		                                                               
		ListIterator<String> itimpares = impares.listIterator();       
		                                                               
		// System.out.println(pares);                                  
		                                                               
		// System.out.println(impares);                                
		                                                               
		while (itpares.hasNext()) {       //se comprueba que hay un siguiente elemnto en la lista                             
		                                                               
			if (itimpares.hasNext()) {    //se comprueba que hay un siguiente elemnto en la lista                                  
		                                                               
				itimpares.next();         // movemos una posicion para poder agregar el elemento de la lista pares                                 
		                                                               
			}                                                            
		                                                               
			itimpares.add(itpares.next());     //se añade en la posicion actua de la lista pares, la posicion de la lista impares                          
		                                                               
		}                                                              
		                                                               
		System.out.println("impares" + impares);                                     
		                                                               
		System.out.println("pares" + pares);
		
		
		itpares = pares.listIterator();  //para que el puntero vuelva al inicio
		
		while (itpares.hasNext()) {  //borramos las posiciones pares
			
			itpares.next();
			
			if (itpares.hasNext()) {
				
				itpares.next();
				itpares.remove();
			}
		
		}
		
		System.out.println("pares"+ pares);
		
		//  borrar los elementos de la lista impares  en la de pares
		
				
		impares.removeAll(pares);
		
		System.out.println("Impares" +  impares);
		
		
	}
}



