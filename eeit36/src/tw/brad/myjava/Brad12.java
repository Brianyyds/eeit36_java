package tw.brad.myjava;

public class Brad12 {

	public static void main(String[] args) {
		// switch (值){}
		// const, goto => X
		// final => 變數 => 常數
		//       => 類別 => 無法繼承的類別
		// goto => 物件導向之後 => 絕種
		// break
		int a = 10;
		final int b = 8;
		switch(a) {	// byte, short, int, char, String, enum
			case 1:
				System.out.println("A");
				break;
				
			case 10:
				System.out.println("B1");
				//break;
				
			case b+1:
				System.out.println("B2");
				//break;
				
			case 100:
				System.out.println("C");
				break;
			
			default:
				System.out.println("Z");
				break;
		}
		System.out.println("------");
	}

}
