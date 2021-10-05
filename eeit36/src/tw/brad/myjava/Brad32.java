package tw.brad.myjava;

public class Brad32 {

	public static void main(String[] args) {
		String id = "C1234567Z9";
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
			
		}
		
		
		return isRight;
	}
	
}
