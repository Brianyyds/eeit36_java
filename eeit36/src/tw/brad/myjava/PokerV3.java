package tw.brad.myjava;

public class PokerV3 {

	public static void main(String[] args) {
		
		int nums = 52;
		int[] poker = new int[nums];
		
		// 文具行買回來的
		for (int i = 0; i < nums; i++) poker[i] = i;
		
		// 開始洗牌
		for (int i = nums -1 ; i > 0 ; i-- ) {
			System.out.println(i);
		}
		
		
		
	}

}
