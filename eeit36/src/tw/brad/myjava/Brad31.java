package tw.brad.myjava;

public class Brad31 {

	public static void main(String[] args) {
		String s1 = "brad";	// "..." => 一個字串物件了
		String s2 = "brad";
		System.out.println(s1);
		System.out.println(s2);
		int a = 10, b = 10;
		System.out.println(a == b);
		System.out.println(s1 == s2);
		String s3 = new String("brad");
		String s4 = new String("brad");
		System.out.println(s3 == s4);
		System.out.println(s1 == s3);
		System.out.println("----");
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s3.equals(s4));
		System.out.println("----");
		System.out.println("abcdefg".charAt(6));
		System.out.println("abcdefg".length());
		
	}

}
