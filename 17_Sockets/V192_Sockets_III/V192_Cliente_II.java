package V192_Sockets_III;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class V192_Cliente_II {

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

		setResizable(false);

		setVisible(true);
	}

}

class LaminaMarcoCliente extends JPanel {

	public LaminaMarcoCliente() {

		camponick = new JTextField(5);

		add(camponick);

		JLabel texto = new JLabel("-CHAT-");

		add(texto);

		campoIP = new JTextField(8);

		add(campoIP);

		campochat = new JTextArea(12, 20);

		add(campochat);

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

			// System.out.println(campo1.getText());

			try {

				Socket misocket = new Socket("192.168.1.38", 5000);

				PaqueteEnvio datos = new PaqueteEnvio();

				//guardamos los valores de los campos de los JTextArea
				//y JTextField a los atributos de la clase PaqueteEnvio
				// y lo tenermos empaquetado en datos
				
				datos.setNick(camponick.getText()); 
				
				datos.setIp(campoIP.getText());
				
				datos.setMensaje(campo1.getText());
				
				//utilizamos ObjectOutPutStream porque es un objeto
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				
				paquete_datos.writeObject(datos);
				
				misocket.close();
				


			} catch (UnknownHostException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				System.out.println("error al conectar: " + e1.getMessage());

				e1.printStackTrace();
			}

		}

	}

	private JTextField campo1, campoIP, camponick;

	private JButton miboton;

	private JTextArea campochat;

}

class PaqueteEnvio implements Serializable{

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	private String nick, ip, mensaje;
}

//				DataOutputStream flujoSalida = new DataOutputStream(misocket.getOutputStream());  // getOutputStream Devuelve un flujo de salida para este socket
//				
//				flujoSalida.writeUTF(campo1.getText());  //enviael texto de JTextField campo1
//				
//				flujoSalida.close();  //simpre hay que cerrar el flujo de datos