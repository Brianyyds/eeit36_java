package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Brad55 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("dir1/file1.txt"));
			String line1 = br.readLine();
			System.out.println(line1);
			String line2 = br.readLine();
			System.out.println(line2);
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
