package tw.brad.myjava;

public class Brad11 {

	public static void main(String[] args) {
		
		double rand = Math.random();
		int score = (int)(rand * 101) + 0;	// 0 <= score <= 100 => 共有 101 個整數數字, 從 0 開始
		System.out.println(score);
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		
	}

}
