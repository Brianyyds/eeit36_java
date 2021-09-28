package tw.brad.myjava;

public class Brad11 {

	public static void main(String[] args) {
		
		double rand = Math.random();
		int score = (int)(rand * 101) + 0;	// 0 <= score <= 100 => 共有 101 個整數數字, 從 0 開始
		System.out.println(score);
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		
	}

}
