package tw.brad.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Brad58 {

	public static void main(String[] args) {
		String mesg = "Hello, World";
		byte[] data = mesg.getBytes();
		try {
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(data, data.length, 
					InetAddress.getByName("127.0.0.1"), 7777);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
