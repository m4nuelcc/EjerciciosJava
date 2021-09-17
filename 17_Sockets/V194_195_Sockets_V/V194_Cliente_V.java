package V194_195_Sockets_V;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class V194_Cliente_V {

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

class LaminaMarcoCliente extends JPanel  implements Runnable{

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
		
		Thread hilo1 = new Thread(this); //this porque es la propia clase que tien el hilo
		
		hilo1.start();                   //si el hilo estuviera en otra clase tendria que crear una instacia

	}
	
	// metodo del Runnable  (hilos) para poner en escucha un servidor
	@Override
	public void run() {
		
		try {
			//servidorSocket escuchado por el puerto 9000
			
			ServerSocket servidorCliente = new ServerSocket(9090);
			
			Socket cliente;
			
			PaqueteEnvio paqueteRecibido;
			
			while (true) {
				
				cliente=servidorCliente.accept();
				
				ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido = (PaqueteEnvio) flujoEntrada.readObject();
				
				campochat.append("\n" + paqueteRecibido.getNick()+ ": " + paqueteRecibido.getMensaje());
				
				
				
			}
			
			
			
		} catch (IOException | ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
		
		}
		
	}

	class EnviaTexto implements ActionListener { // clase interna escucha boton y recoge datos de campo1

		@Override
		public void actionPerformed(ActionEvent e) {

			// System.out.println(campo1.getText());
			//añadimos al areatext lo que escribe el cliente para ver toda la conversacion
			
			campochat.setForeground(Color.blue);
			
			campochat.append("\n Yo: " + campo1.getText());
			
			campo1.setText(""); 
			
			
			
			

			try {
				//OBTENER LA IP LOCAL DEL EQUIPO
				
				CheckIP ip = new CheckIP();
				
				String IP = ip.obtenerIP();
				
				System.out.println(IP);
				//Envio de datos

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

//CLASE PARA OBTENER LA IP DEL EQUIPO

class CheckIP {
//    static private final Logger LOGGER = Logger.getLogger("mx.com.hash.checkip.CheckIP");

    String obtenerIP() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        return ip.getHostAddress();
    }
}

