package tw.brad.myjava;

import java.util.HashSet;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("買幾組: ");
		int nums = scanner.nextInt();
		for (int i=0; i<nums; i++) {
			System.out.println((i+1) + ". " + createLottery());
		}
	}
	
	static String createLottery() {
		HashSet<Integer> lottery = new HashSet<>();
		while (lottery.size() < 6) {
			lottery.add((int)(Math.random()*49+1));
		}
		
		StringBuffer sb = new StringBuffer();
		for(Integer value : lottery) {
			sb.append(String.format("%02d  ", value));
		}
		return sb.toString();
	}
	

}
