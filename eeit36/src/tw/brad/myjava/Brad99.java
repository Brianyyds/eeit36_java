package tw.brad.myjava;

public class Brad99 {

	public static void main(String[] args) {
		int r, newi;
		final int START = 1;
		final int ROW = 4;
		final int COL = 5;
		
		
		for (int k = 0; k < ROW; k++) {
			for (int j = 1; j <= 9 ; j++) {
				for (int i = START; i < START + COL ; i++) {
					newi = i + k * COL;
					r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
