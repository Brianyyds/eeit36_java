package tw.brad.myjava;

import java.util.HashSet;
import java.util.Iterator;

public class Brad38 {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>();	// <泛型>
		names.add("Brad");
		//names.add(123);
		names.add("Eric");
		names.add("Peter");
		names.add("Andy");
		System.out.println(names);
		
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		System.out.println(names.contains("Brad"));
		System.out.println(names.contains("Mark"));
		
		System.out.println("---");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		
	}

}
