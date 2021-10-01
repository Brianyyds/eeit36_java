package tw.brad.myjava;

public class Brad14 {

	public static void main(String[] args) {
		int a = 10, b = 3;

		if (++a > 10 | --b < 3) {
			System.out.printf("OK: a = %d; b = %d", a, b);
		}else {
			System.out.printf("XX: a = %d; b = %d", a, b);
		}
		System.out.println("---");
		
		int x = 2, y = 1 ;
		System.out.println( x & y);
		
		int var1 = 027;	// 0x 0X => 16進位; 0 開頭為 8 進位
		System.out.println(var1);	// 以十進位來顯示
		
		
	}

}
