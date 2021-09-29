package tw.brad.myjava;

public class PokerV1 {

	public static void main(String[] args) {
		// 1. 洗牌 2. 發牌 => 4個玩家(13) 3. 理牌 + 攤牌
		int nums = 49;
		int[] poker = new int[nums];	// poker[0] = 0, poker[1] = 0,...... poker[51] = 0
		for (int i=0; i<poker.length; i++) {
			int brad = (int)(Math.random() * nums);	// 0 <= rand <= 51
			
			// 檢查機制
			boolean isRepeat = false;
			for (int j=0; j<i; j++) {
				if (poker[j] == brad) {
					isRepeat = true;
					break;
				}
			}
			
			if (!isRepeat) {
				poker[i] = brad;	
			}else {
				i--;
			}
		}
		
		for(int card : poker) {
			System.out.println(card);
		}
		
		

	}

}
