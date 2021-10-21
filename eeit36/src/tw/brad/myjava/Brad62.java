package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad62 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://www.iii.org.tw");
			URLConnection connection = url.openConnection();
			
			BufferedReader reader = 
					new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String line; int i = 1;
			while ( (line = reader.readLine())!= null) {
				System.out.println(i++ + "." + line );
			}
			reader.close();
			
			System.out.println("-------------------");
			System.out.println("OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}

}
