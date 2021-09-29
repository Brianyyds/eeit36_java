package tw.brad.myjava;

public class Brad21 {

	public static void main(String[] args) {
		int a = -10, b = 3;
		System.out.printf("a = %d, b = %d\n", a, b);

		int c = a;
		a = b;
		b = c;
		
//		a = a + b; 	// 13, 3
//		b = a - b;	// 13, 10
//		a = a - b; 	// 3, 10

//		a = a ^ b;	// xor
//		b = a ^ b;
//		a = a ^ b;
		
		System.out.printf("a = %d, b = %d\n", a, b);
	}

}
