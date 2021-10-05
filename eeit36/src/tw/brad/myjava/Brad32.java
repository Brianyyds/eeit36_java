package tw.brad.myjava;

public class Brad32 {

	public static void main(String[] args) {
		String id = "W123456789";
		if (checkTWId(id)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
	}
	
	public static boolean checkTWId(String id) {
		// 檢查的條件有哪些
		// 第一字元為英文
		// 第二個是1或2
		// 由9個連續數字組成
		// 10碼
		boolean isRight = false;
		
		if (id.matches("[A-Z][12][0-9]{8}")) {
			String letterString = "ABCDEFGHJKLMNPQRSTUVXYWZIO";	// 10 - 35 indexOf() => 0, 1, 2, ...
			char c1 = id.charAt(0);	// A
			int pos = letterString.indexOf(c1);	// 0 - 25
			int c12 = pos + 10;	// 10 - 35
			int n1 = c12 / 10;	// 十位數
			int n2 = c12 % 10;	// 個位數
			//System.out.println(n1 + ":" + n2);
			String s2 = id.substring(1, 2);
			int n3 = Integer.parseInt(s2);
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			
		}
		
		
		return isRight;
	}
	
}
