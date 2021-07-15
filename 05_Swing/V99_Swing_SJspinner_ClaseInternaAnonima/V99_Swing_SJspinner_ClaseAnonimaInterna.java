package V99_Swing_SJspinner_ClaseInternaAnonima;

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

public class V99_Swing_SJspinner_ClaseAnonimaInterna {

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

		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {

				return super.getPreviousValue();
			}

			public Object getPreviousValue() {

				return super.getNextValue();
			}
			
			
		});

		Dimension d = new Dimension(200, 20);

		control.setPreferredSize(d);

		add(control);
	}

	/*private class MimodeloSpinner extends SpinnerNumberModel {

		public MimodeloSpinner() {

			super(5, 0, 10, 1);
		}

		public Object getNextValue() {

			return super.getPreviousValue();
		}

		public Object getPreviousValue() {

			return super.getNextValue();
		}
	}*/

	JSpinner Spinner;
}