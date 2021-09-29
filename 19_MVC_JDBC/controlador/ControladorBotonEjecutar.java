package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.EjecutaConsultas;
import vista.MarcoAplicacion;

public class ControladorBotonEjecutar  implements ActionListener{

	public ControladorBotonEjecutar (MarcoAplicacion marco) {
		
		this.marco =marco;
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		String seleccionpais = (String) marco.paises.getSelectedItem();
		
		String seleccionseccion = (String) marco.secciones.getSelectedItem();
		
			
		marco.resultado.append(consultas.filtraBBDD(seleccionseccion, seleccionpais));
		
		
		marco.resultado.append("\n");
		
	}
	
	
	
	
	private MarcoAplicacion marco; 
	
	EjecutaConsultas consultas = new EjecutaConsultas();
	

}
