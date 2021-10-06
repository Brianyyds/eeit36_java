package tw.brad.myjava;

import java.util.HashSet;

public class Brad38 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();	// <泛型>
		names.add("Brad");
		//names.add(123);
		names.add("Eric");
		names.add("Peter");
		names.add("Andy");
		System.out.println(names);
	}

}
