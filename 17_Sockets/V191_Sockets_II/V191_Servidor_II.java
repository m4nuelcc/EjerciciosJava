package V191_Sockets_II;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class V191_Servidor_II {

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
			
			while(true) {
			
			Socket miSocket = servidor.accept();  //poner a la escucha
			
			DataInputStream flujoEntrada = new DataInputStream(miSocket.getInputStream());
			
			String mensaje_Texto =  flujoEntrada.readUTF();
			
			//areatexto.setText("\n"+mensaje_Texto);
			
			areatexto.append("\n"+mensaje_Texto);
			
			miSocket.close();
			
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
}
