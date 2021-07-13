import javax.swing.JOptionPane;

public class c23_usos_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//my_array[0]=1;
		
		//my_array[1]=2;
		
		//my_array[2]=3;
		
		//my_array[3]=4;
		
		//my_array[4]=5;
		
		
		//int [] my_array = {5,7,8,9,10};
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("escriba el tamaño del array"));
		
		int [] my_array = new int[numero];
		
		for(int i=0; i<my_array.length; i++) {
			
			my_array[i]=i;
			
			System.out.println("la posisicon " + i + " contiene el valor: " + my_array[i]);
			
				
		};
		
		

	}

}
