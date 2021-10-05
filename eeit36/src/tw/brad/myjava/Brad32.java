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
			
			
		}
		
		
		return isRight;
	}
	
}
