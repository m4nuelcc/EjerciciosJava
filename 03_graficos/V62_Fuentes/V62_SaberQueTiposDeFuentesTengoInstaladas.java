package V62_Fuentes;

import java.awt.GraphicsEnvironment;

import javax.swing.JOptionPane;

public class V62_SaberQueTiposDeFuentesTengoInstaladas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente = JOptionPane.showInputDialog("introduce la fuente");
		
		boolean estalafuente = false;
			
		String [] nombresDeFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(null);

		for(String nombrelafuente: nombresDeFuentes) {
			
			System.out.println(nombrelafuente);
			
			if(nombrelafuente.equals(fuente)) {
				
				estalafuente=true;
				
			}
		}
			
			if(estalafuente) {
				System.out.println("la fuente esta instalada");
			}else {
				
				System.out.println("la fuente no esta instalada");
			
		}
	}

}
