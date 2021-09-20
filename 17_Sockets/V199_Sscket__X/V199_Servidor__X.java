package V199_Sscket__X;

import javax.swing.*;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class V199_Servidor__X {

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

		Thread hilo1 = new Thread(this); // creamos hilo

		hilo1.start(); // ponemos en marcha hilo1

	}

	private JTextArea areatexto;

	@Override
	public void run() {

		try {

			// --------------SERVIDOR EN ESCUCHA PRA RECIBIR DATOS---------------

			ServerSocket misoket = new ServerSocket(5000); // pone el servidor en escucha

			String nick, ip, mensaje;

			PaqueteEnvio paqueteRecibido = new PaqueteEnvio(); // instanciamos la clase paqueteenvio

			while (true) {

				Socket miSocket = misoket.accept(); // poner a la escucha


					ObjectInputStream paqueteDatos = new ObjectInputStream(miSocket.getInputStream());

					paqueteRecibido = (PaqueteEnvio) paqueteDatos.readObject();

					nick = paqueteRecibido.getNick();

					ip = paqueteRecibido.getIp();

					mensaje = paqueteRecibido.getMensaje();

					if (!mensaje.equals(" online")) {  //para saber que se abre la ventana por primera vez
						
					areatexto.append("\n" + nick + ": " + mensaje + " para " + ip);

					// ------------SERVIDOR ENVIA DATOS A
					// DESTINATARIO---------------------------------------

					Socket enviaDestinatario = new Socket(ip, 9090);

					// -----------creacion objeto "paqueteReenvio" para
					// enviar-------------------------------

					ObjectOutputStream paqueteReenvio = new ObjectOutputStream(enviaDestinatario.getOutputStream());

					// ------------------ ENVIAMOS
					// OBJETO---------------------------------------------------

					paqueteReenvio.writeObject(paqueteRecibido);

					// ---------------------CERRAR LOS
					// SOCKETS-----------------------------------------------

					paqueteReenvio.close();

					enviaDestinatario.close();

					miSocket.close();

				}else {
					// ---------------DETECTA CLIENTES ONLINE-------------------

					InetAddress localizacion = miSocket.getInetAddress();

					String IpRemota = localizacion.getHostAddress();

					System.out.println("online " + IpRemota);

					// ---------------------------------------------------------
				}
			}

		} catch (IOException | ClassNotFoundException e) {

			e.printStackTrace();
		}

	}
}
