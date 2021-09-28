package tw.brad.myjava;

public class Brad99 {

	public static void main(String[] args) {
		int r, newi;
		for (int k = 0; k < 2; k++) {
			for (int j = 1; j <= 9 ; j++) {
				for (int i = 2; i <= 5 ; i++) {
					newi = i + k * 4;
					r = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}

}
