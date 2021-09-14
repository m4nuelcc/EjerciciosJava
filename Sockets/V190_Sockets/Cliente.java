package V190_Sockets;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel {

	public LaminaMarcoCliente() {

		JLabel texto = new JLabel("CLIENTE");

		add(texto);

		campo1 = new JTextField(20);

		add(campo1);

		miboton = new JButton("Enviar");

		EnviaTexto mievento = new EnviaTexto();

		miboton.addActionListener(mievento);

		// miboton.addActionListener(new EnviaTexto()); //tambien se puede hacer

		add(miboton);

	}

	class EnviaTexto implements ActionListener { // clase interna escucha boton y recoge datos de campo1

		@Override
		public void actionPerformed(ActionEvent e) {

			//System.out.println(campo1.getText());
			
			try {
				
				Socket misocket = new Socket("192.168.1.38", 5000);
				
				DataOutputStream flujoSalida = new DataOutputStream(misocket.getOutputStream());
				
				flujoSalida.writeUTF(campo1.getText());
				
				flujoSalida.close();
				
				
			} catch (UnknownHostException e1) {
				
				e1.printStackTrace();
				
			} catch (IOException e1) {

				System.out.println("error al conectar: " + e1.getMessage());
				e1.printStackTrace();
			}
			
		

		}

	}

	private JTextField campo1;

	private JButton miboton;

}
