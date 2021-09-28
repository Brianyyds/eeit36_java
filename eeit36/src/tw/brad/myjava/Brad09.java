package tw.brad.myjava;

public class Brad09 {

	public static void main(String[] args) {
		// byte, short, int, long
		// float, double
		// char 字元, 2^16 => 0 ~ 65535 
		// boolean
		
		// 字串 => 字元成一串 => 物件
		// 字元 => 一個字元
		// '' 單引號刮註一個字元 => 字元 => 基本型態
		// "" 雙引號刮註一個字串 => 字串 => 物件型態
		char c1 = 'a';	// 97
		char c2 = 100;	// 'a'
		char c3 = '資';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		boolean b1 = true;	// 1bit
		boolean b2 = false;	
		System.out.println(b2);
	}

}
