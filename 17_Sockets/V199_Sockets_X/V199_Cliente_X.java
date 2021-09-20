package V199_Sockets_X;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.System.Logger;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.*;

public class V199_Cliente_X {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MarcoCliente mimarco = new MarcoCliente();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCliente extends JFrame  {

	public MarcoCliente() {

		setBounds(600, 300, 280, 350);

		LaminaMarcoCliente milamina = new LaminaMarcoCliente();

		add(milamina);

		setResizable(false);

		setVisible(true);
		
		addWindowListener(new EnvioOnline());
	}

}

//--------------------ENVIO SEÑAL ONLINE--------------------------------

class EnvioOnline extends WindowAdapter{
	
	public void windowOpened(WindowEvent e) {
		
		try {
			Socket miSocket = new Socket("192.168.1.38", 5000);
					
			PaqueteEnvio datos = new PaqueteEnvio(); //creo paquete tipo paqueteenvio
			
			datos.setMensaje(" online");
			
			ObjectOutputStream paqueteDatos = new ObjectOutputStream(miSocket.getOutputStream());
			
			paqueteDatos.writeObject(datos);
			
			miSocket.close();
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}
//---------------------------------------------------------------------------------	
	
}



class LaminaMarcoCliente extends JPanel  implements Runnable{

	public LaminaMarcoCliente() {
		
		
		//PETICION DEL NICK DEL USUARIO
		
		String nombre =  JOptionPane.showInputDialog("Introduzca nick");

		camponick = new JLabel(nombre);

		add(camponick);
	

		JLabel texto = new JLabel("    Online");

		add(texto);
		
		//LISTA DESPLEGABLE CON LAS IPS DE HOST CONECTADOS

		//campoIP = new JTextField(8);
		
		campoIP = new JComboBox();
		
		campoIP.addItem("192.168.1.60");
		
		campoIP.addItem("192.168.1.97");
		
		campoIP.addItem("192.168.1.38");

		add(campoIP);

		
		//AREA DE TEXTO DONDE SE ESCRIBE LA CONVERSACION
		
		campochat = new JTextArea(12, 20);

		add(campochat);
		
		
		//CAMPO DONDE ESCRIBIMOS NUESTROS MENSAJES A MANDAR
		
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
			//servidorSocket escuchado por el puerto 9000 del cliente
			
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

		
			//añadimos al areatext lo que escribe el cliente para ver toda la conversacion
			
			campochat.setForeground(Color.blue);
			
			campochat.append("\n Yo: " + campo1.getText());
			
		try {
		
			//Envio de datos

				Socket misocket = new Socket("192.168.1.38", 5000);

				PaqueteEnvio datos = new PaqueteEnvio();

				//guardamos los valores de los campos de los JTextArea
				//y JTextField a los atributos de la clase PaqueteEnvio
				// y lo tenermos empaquetado en datos
				
				datos.setNick(camponick.getText()); 
				
				//datos.setIp(campoIP.getText());
				datos.setIp(campoIP.getSelectedItem().toString());
				
				datos.setMensaje(campo1.getText());
				
				//utilizamos ObjectOutPutStream porque es un objeto
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(misocket.getOutputStream());
				
				
				paquete_datos.writeObject(datos);
				
				misocket.close();
				
				//una vez enviado el mensaje lo borramos para volver a escribir
				
				campo1.setText(""); 
				
				


			} catch (UnknownHostException e1) {

				e1.printStackTrace();

			} catch (IOException e1) {

				System.out.println("error al conectar: " + e1.getMessage());

				e1.printStackTrace();
			}

		}

	}

	private JTextField campo1;
	
	private JComboBox campoIP;
	
	private JLabel camponick;

	private JButton miboton;

	private JTextArea campochat;



}

//--------------CLASE QUE UTILIZO PARA CREAR UN OBJETO PARA LUEGO ENVIAR TODO JUNTO---------

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

//class CheckIP {
////    static private final Logger LOGGER = Logger.getLogger("mx.com.hash.checkip.CheckIP");
//
//	String obtenerIP() throws UnknownHostException {
//		InetAddress ip = InetAddress.getLocalHost();
//		return ip.getHostAddress();
//	}
//}


