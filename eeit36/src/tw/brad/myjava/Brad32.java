package tw.brad.myjava;

import tw.brad.myclass.TWId;

public class Brad32 {

	public static void main(String[] args) {
		String id = "Y120239847";
		if (TWId.checkTWId(id)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("---");
		
		double d = Math.random();
		System.out.println(d);
		
	}
	
}
