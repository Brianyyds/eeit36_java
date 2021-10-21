package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad60 {

	public static void main(String[] args) {
		
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line;
			while ( (line = reader.readLine())!= null) {
				System.out.println(line);
			}
			reader.close();
			
			server.close();
			System.out.println("\nServer OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
