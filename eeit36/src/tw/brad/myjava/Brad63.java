package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad63 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://upload.wikimedia.org/wikipedia/commons/4/45/A_small_cup_of_coffee.JPG");
			URLConnection connection =  url.openConnection();
			connection.connect();

			try(BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir1/brad.jpg"));
					BufferedInputStream bin = new BufferedInputStream(connection.getInputStream())){
				byte[] buf = new byte[4*1024];
				int len;
				while ( (len = bin.read(buf)) != -1) {
					bout.write(buf, 0, len);
				}
				bout.flush();
			}
			
			
			System.out.println("download OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
