package tw.brad.myjava;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Brad61 {

	public static void main(String[] args) {
		String mesg = "Hello, 資策會\n1234567\nabcdefg\n7654321"; 
		
		try {
			Socket socket = new Socket(InetAddress.getByName("127.0.0.1"),9999);
			
			OutputStream out = socket.getOutputStream();
			out.write(mesg.getBytes());
			out.flush();
			out.close();
			
			socket.close();
			System.out.println("Client OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
