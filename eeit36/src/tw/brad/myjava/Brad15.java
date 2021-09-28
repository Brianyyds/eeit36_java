package tw.brad.myjava;

public class Brad15 {

	public static void main(String[] args) {
		// for
		
		for (int i = 0; i<10; i++) {
			System.out.println(i);
		}
		// --------------
		System.out.println("----");
		
		int i = 0;
		for ( header() ; i<10 ; ) {
			System.out.println(i++);
		}
	}
	
	public static void header() {
		System.out.println("Brad Big Company");
		System.out.println("------");
	}

}
