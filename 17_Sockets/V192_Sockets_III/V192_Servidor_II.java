package V192_Sockets_III;



import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class V192_Servidor_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoServidor mimarco = new MarcoServidor();

		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}

class MarcoServidor extends JFrame implements Runnable {

	public MarcoServidor() {

		setBounds(1200, 300, 280, 350);

		JPanel milamina = new JPanel();

		milamina.setLayout(new BorderLayout());

		areatexto = new JTextArea();

		milamina.add(areatexto, BorderLayout.CENTER);

		add(milamina);

		setVisible(true);

		Thread hilo1 = new Thread(this);  //creamos hilo

		hilo1.start(); //ponemos en marcha hilo1
		

	}

	private JTextArea areatexto;

	@Override
	public void run() {

		// System.out.println("Estoy a la excucha");
		
		try {
			
			ServerSocket servidor = new ServerSocket(5000); //pone el servidor en escucha
			
			String nick, ip, mensaje;
			
			PaqueteEnvio paqueteRecibido = new PaqueteEnvio();
			
			while(true) {
			
			Socket miSocket = servidor.accept();  //poner a la escucha
			
			ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());
				
			paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();
			
			nick = paqueteRecibido.getNick();
			
			ip = paqueteRecibido.getIp();
			
			mensaje = paqueteRecibido.getMensaje();
			
			areatexto.append("\n" + nick + ": " + mensaje + " para "+ ip);
			
			miSocket.close();
		
			
			}
			
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
}
