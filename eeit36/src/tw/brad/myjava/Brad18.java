package tw.brad.myjava;

public class Brad18 {

	public static void main(String[] args) {
		int[] p = new int[7];	// p[0] = 0, p[1] = 0, ... p[5] = 0, p[6] = 0
		
		for (int i=0; i<100; i++) {
			int point = (int)(Math.random()*6) + 1;	// point => 1 ~ 6
			p[point]++;
		}

		for (int i = 1; i<=6; i++) {	// i => 0, 1, 2, 3, 4, 5
			System.out.printf("%d點出現%d次\n", i, p[i]);
		}
		
		System.out.println("---");
		
		for (int value : p) {
			System.out.println(value);
		}
		
	}

}
