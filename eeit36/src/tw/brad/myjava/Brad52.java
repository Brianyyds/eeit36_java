package tw.brad.myjava;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad52 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin = new FileInputStream("dir1/brad.ok");
			DataInputStream oin = new DataInputStream(fin);
			
			int data1 = oin.readInt();
			System.out.println(data1);
			
			boolean data2 = oin.readBoolean();
			System.out.println(data2);
			
			double data3 = oin.readDouble();
			System.out.println(data3);
			
			
			fin.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
