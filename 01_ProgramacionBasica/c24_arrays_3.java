
public class c24_arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] Aleatorios = new int[100];
		
		for (int i=0; i<Aleatorios.length; i++) {
			
			Aleatorios[i]= (int)Math.round(Math.random()*100);
		}

		for(int numero:Aleatorios) {
			
			System.out.print(numero + " ");
		}
	}

}
