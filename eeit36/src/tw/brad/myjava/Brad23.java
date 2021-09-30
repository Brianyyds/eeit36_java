package tw.brad.myjava;

import java.util.Scanner;

public class Brad23 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		Scanner scanner = new Scanner(System.in);
		System.out.print("n = ");
		int n = scanner.nextInt();
		
		int counter = 1, sum = 0;
		while (counter <= n) {
			sum += counter++;
		}
		
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);
		
		
	}

}
