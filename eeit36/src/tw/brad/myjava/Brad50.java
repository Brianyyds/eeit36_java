package tw.brad.myjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad50 {

	public static void main(String[] args) {
		String data = "Hello, World!";
		byte[] buf = data.getBytes();
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/file2.txt", true);
			fout.write(buf);
			fout.close();
			System.out.println("OK");
		} catch (FileNotFoundException e1) {
			System.out.println(e1.toString());
		} catch (IOException e2) {
			System.out.println(e2.toString());
		}
	}

}
