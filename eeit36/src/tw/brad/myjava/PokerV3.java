package tw.brad.myjava;

public class PokerV3 {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int nums = 52;
		int[] poker = new int[nums];
		
		// 文具行買回來的
		for (int i = 0; i < nums; i++) poker[i] = i;
		
		// 開始洗牌
		for (int i = nums -1 ; i > 0 ; i--) {
			int rand = (int)(Math.random() * (i+1));
			// poker[rand] <=> poker[i];
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		long endTime = System.currentTimeMillis();
		
		for(int card : poker) {
			System.out.println(card);
		}
		System.out.println("---");
		System.out.println(endTime - startTime);
		
	}

}
