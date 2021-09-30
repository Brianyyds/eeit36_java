package tw.brad.myjava;

public class PokerV3 {

	public static void main(String[] args) {
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
		
		// 以下發給4個玩家, 各家13張
		int[][] players = new int[4][13];
		for (int i=0; i<nums; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		String[] suits = {"黑桃", "紅心","方塊","梅花" };	//
		String[] values = {"A ","2 ","3 ","4 ","5 ","6 ","7 ",
				"8 ","9 ","10","J ","Q ","K "};
		
		// 四家攤牌
		for (int[] player : players) {
			for (int card : player) {
				System.out.print(suits[card/13] + values[card%13] + " ");
			}
			System.out.println();
		}
		
//		System.out.println("---");
//		
//		for (int j=0; j<13; j++) {
//			for (int i=0; i<players.length; i++) {
//				// [i][j]
//				System.out.print(players[i][j] + " ");
//			}
//			System.out.println();
//		}
		
	}

}
