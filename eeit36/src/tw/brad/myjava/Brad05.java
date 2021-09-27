package tw.brad.myjava;

public class Brad05 {

	public static void main(String[] args) {
		int v1 = 100;
		int v2 = 37;
		
		int r1 = v1 + v2;
		int r2 = v1 - v2;
		int r3 = v1 * v2;
		int r4 = v1 / v2;
		int r41 = v1 % v2;
		
		System.out.printf("%d + %d = %d\n", v1, v2, r1);
		System.out.printf("%d - %d = %d\n", v1, v2, r2);
		System.out.printf("%d x %d = %d\n", v1, v2, r3);
		System.out.printf("%d / %d = %d ...... %d\n", v1, v2, r4, r41);
		
		double v11 = v1;
		double r5 = v11 / v2;
		System.out.printf("%d / %d = %f\n", v1, v2, r5);
		// 閱讀性 => 維護性
	}

}
