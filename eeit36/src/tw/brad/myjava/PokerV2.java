package tw.brad.myjava;

public class PokerV2 {

	public static void main(String[] args) {
		// 1. 洗牌 2. 發牌 => 4個玩家(13) 3. 理牌 + 攤牌
		long startTime = System.currentTimeMillis();
		int nums = 52;
		int[] poker = new int[nums];	// poker[0] = 0, poker[1] = 0,...... poker[51] = 0
		int brad;
		boolean isRepeat;
		for (int i=0; i<poker.length; i++) {
			
			do {
				brad = (int)(Math.random() * nums);	// 0 <= rand <= 51
				// 檢查機制
				isRepeat = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == brad) {
						isRepeat = true;
						break;
					}
				}
			}while (isRepeat);
			
			poker[i] = brad;
			
		}

		long endTime = System.currentTimeMillis();
		for(int card : poker) {
			System.out.println(card);
		}
		System.out.println("---");
		System.out.println(endTime - startTime);
		

	}

}
