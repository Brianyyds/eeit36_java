package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brad64 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://data.nhi.gov.tw/resource/mask/maskdata.csv");
			URLConnection connection =  url.openConnection();
			connection.connect();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir1/brad.csv"));
			
			BufferedInputStream bin = new BufferedInputStream(connection.getInputStream());
			byte[] buf = new byte[4*1024];
			int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			bin.close();
			
			bout.flush();
			bout.close();
			System.out.println("download OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
