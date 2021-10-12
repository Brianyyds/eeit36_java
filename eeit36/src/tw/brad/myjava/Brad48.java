package tw.brad.myjava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad48 {

	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("dir1/file1.txt");
			
			int c;
			while ( (c = reader.read()) != -1) {
				System.out.println((char)c);
			}
			
			
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
