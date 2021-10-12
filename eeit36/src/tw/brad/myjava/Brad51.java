package tw.brad.myjava;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad51 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/brad.ok");
			DataOutputStream oout = new DataOutputStream(fout);

			oout.writeInt(123);
			oout.writeBoolean(false);
			oout.writeDouble(12.3);
			
			//oout.writeObject(new Bike());
			
			fout.flush();
			fout.close();
			
			System.out.println("save OK");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
