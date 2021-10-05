package tw.brad.myjava;

public class Brad32 {

	public static void main(String[] args) {
		String id = "A123456789";
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
		System.out.println(id.charAt(0));	// char '' 65 <= <= 90
		// 寫一個陣列(字串)讓他比對在不在裡面
		// Character.isUpperCase(c1)也可以用嗎
		String alphaString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		if (id.length() == 10) {
			char c1 = id.charAt(0);
			
//			if (c1 >= 65 && c1 <=90) {
//				System.out.println("OK1");
//			}
			
//			if(alphaString.indexOf(c1) >= 0) {
//				//System.out.println("OK1");
//				
//			}
			
			if (Character.isUpperCase(c1)) {
			}
			
		}
		
		
		return isRight;
	}
	
}
