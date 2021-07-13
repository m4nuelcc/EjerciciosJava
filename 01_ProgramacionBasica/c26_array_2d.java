
public class c26_array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double acumulado;
		
		double interes=0.10; //10%
		
		double[][] saldo = new double[10][5];
		
		int saldo2;
		
		
		for (int i=0; i<10; i++) {
			
			System.out.println();
			
			saldo[i][0]=100000;
			acumulado=100000;
			
			for(int x=1; x<5; x++) {
				
			acumulado=acumulado+(acumulado*interes);
			saldo[i][x]=acumulado;	
				
			}
			interes=interes+0.01;
		}
		
		for (int fila=0; fila<10; fila++) {
			
			System.out.println();
			
			for(int columna=0; columna<5; columna++) {
				
				//int saldo2 = (int) Math.ceil(saldo[fila][columna]);
				
				System.out.print(saldo2 = (int) Math.ceil(saldo[fila][columna]) );
				System.out.print("  ");
			
			}
		}
			
		
	}

}
