package tw.brad.myjava;

public class Brad42 {

	// Exception 例外, 異常
	public static void main(String[] args) {
		int a = 10, b = 0;
		int c;
		int[] d = {1,2,3,4};
		
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[4]);
		}catch (ArithmeticException e) {
			System.out.println("....1");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("....2");
		}
		
		System.out.println("OK");
	}

}
