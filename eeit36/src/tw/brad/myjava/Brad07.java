package tw.brad.myjava;

import java.util.Scanner;

public class Brad07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x = ? ");
		int x = scanner.nextInt();
		
		System.out.print("y = ? ");
		int y = scanner.nextInt();
		
		//-----------------------------------
		
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r41 = x / y;
		int r42 = x % y;
		double r5 = (x*1.0) / y; // int * double => double / int => double
		
		System.out.printf("%d + %d = %d\n", x , y , r1);
		System.out.printf("%d - %d = %d\n", x , y , r2);
		System.out.printf("%d x %d = %d\n", x , y , r3);
		System.out.printf("%d / %d = %d ...... %d\n", x , y , r41, r42);
		System.out.printf("%d / %d = %f\n", x , y , r5);
		
	}

}
