package MisPruebasHilos1;

public class HilosNumeroLEtras implements Runnable {

	public HilosNumeroLEtras(int tipo) {
		
		this.tipo=tipo;
	}	
	
	public void run() {
		
		
		while(true) {
			
			switch (tipo) {
			
			case 1:
				
				for (int i=0; i<30; i++) {
					
					System.out.println(i);
				}
				break;
				
			case 2:
				
				for (char c='a'; c<'z'; c++) {
					
					System.out.println(c);
					
					
				}

			default:
				break;
			}
			
		}
		
	}
	
	private int tipo;

}
