package tw.brad.myjava;

public class Brad20 {

	public static void main(String[] args) {
		int[][] ary = new int[3][];
		ary[0] = new int[2];
		ary[1] = new int[4];
		ary[2] = new int[3];
		
		ary[0][0] = 12;
		ary[1][1] = 33;
		ary[2][2] = 44;
		
		for (int[] a  : ary) {
			for (int v : a) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
		// 1. 英文不好沒關係, 只要不怕英文
		// 2. 觀念先搞清楚, 實作最重要
		// 3. 先聽, 聽不懂, 馬上問, 不要先動手
		// Network, Database, FileSystem
		
		// Java Array => 1. 型別固定 2. 長度固定 => 難用 
		
		
		
		
	}

}
