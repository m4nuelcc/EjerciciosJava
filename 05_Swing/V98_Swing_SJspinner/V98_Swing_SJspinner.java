package V98_Swing_SJspinner;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class V98_Swing_SJspinner {

	public static void main(String[] args) {

		MarcoSpinner miMarco = new MarcoSpinner();

		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoSpinner extends JFrame {

	public MarcoSpinner() {

		setTitle("Marco JSpinner");

		setBounds(500, 350, 600, 300);

		PanelSpinner panelSpinner = new PanelSpinner();

		add(panelSpinner);

		setVisible(true);

	}
}

class PanelSpinner extends JPanel {

	public PanelSpinner() {

		setLayout(new BorderLayout());
		JPanel lamina1 = new JPanel();
		add(lamina1, BorderLayout.NORTH);

		// Ejemplo Con el contructor por defecto, son numericos
		// Spinner = new JSpinner();
		Spinner = new JSpinner(new SpinnerNumberModel(5, 0, 100, 1));
		lamina1.add(Spinner);

		// Ejeplo con una lista de Colores

		String lista[] = { "Amarillo", "Azul", "Rojo", "verde" };
		colores = new JSpinner(new SpinnerListModel(lista));
		lamina1.add(colores);

		// Emjemplo con Fecha

		fecha = new JSpinner(new SpinnerDateModel());
		Calendar calendar = Calendar.getInstance();// Variable de Objeto Calendar
		// Obtenemos una fecha de inicio, será la fecha actual del sistema

		Date inicio = calendar.getTime();
		// Indicamos año hasta -100 del actual

		calendar.add(Calendar.YEAR, -100);
		// Guardamos la configuración en un DATE

		Date fechaAnterior = calendar.getTime();
		// Indicamos año hasta +200 del actual

		calendar.add(Calendar.YEAR, 200);
		// Guardamos la configuración en un DATE

		Date fechaPosterior = calendar.getTime();
		// Usamos el contructor de abajo para crear un modelo para el Spinner
		// SpinnerDateModel(Date value, Comparable start, Comparable end, int
		// calendarField)
		// Utilizamos los datos que creamos más arriba
		// Para fecha utilizamos Calendar.YEAR y para hora Calendar.HOUR, el resto puede
		// ser igual
		
		SpinnerModel fechaModel = new SpinnerDateModel(inicio, fechaAnterior, fechaPosterior, Calendar.YEAR);

		fecha.setModel(fechaModel);
		fecha.setEditor(new JSpinner.DateEditor(fecha, "dd/MM/yyyy"));
		Date fecha1 = new Date(GregorianCalendar.DAY_OF_WEEK);
		lamina1.add(fecha);

		// Ejemplo con las fuentes del sistema

		String fuentesSistema[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

		JPanel lamina2 = new JPanel();

		fuentes = new JSpinner(new SpinnerListModel(fuentesSistema));

		Dimension d = new Dimension(200, 20);

		fuentes.setPreferredSize(d);

		lamina1.add(fuentes);

	}

	JSpinner Spinner, fecha, colores, fuentes;
}