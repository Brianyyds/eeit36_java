package tw.brad.myjava;

import java.io.File;
import java.io.IOException;

public class Brad44 {

	public static void main(String[] args) {
		File file1 = new File("./dir1/file1.txt");

		if (file1.exists()) {
			System.out.println("OK");
		}else {
			try {
				if (file1.createNewFile()) {
					System.out.println("Create OK");
				}else {
					System.out.println("filename is exist!");
				}
			}catch (IOException e) {
				System.out.println("Ooop!");
			}
		}
		System.out.println("---");
		File dir4 = new File("dir4");
		if (!dir4.exists()) {
			dir4.mkdir();
		}
	}

}
