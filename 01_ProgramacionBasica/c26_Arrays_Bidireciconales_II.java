
public class c26_Arrays_Bidireciconales_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][]= {
				{10,12,45,78,55},
				{1,2,4,5,6,},
				{12,34,45,65,43},
				{65,342,543,34,2,}
		};

		for(int i=0; i<4; i++) {
			System.out.println();
			
			for(int x=0; x<5; x++) {
				
				System.out.println("posicion: " + i + "," + x + "," + matrix[i][x]);
				
				
			}
		}
		
		for(int[] fila:matrix) {
			
			System.out.println();
			
			for(int columna:fila) {
				
				System.out.print(columna + " ");
			}
		}
	}

}
