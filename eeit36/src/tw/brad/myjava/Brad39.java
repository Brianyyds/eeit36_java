package tw.brad.myjava;

import java.util.Iterator;
import java.util.LinkedList;

public class Brad39 {

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("Brad");	// 0
		list1.add("John");	// 1
		list1.add("Andy");	// 2
		list1.add(0, "Amy");	// 3
		list1.add("Tony");	// 4
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println("---");
		for (String value : list1) {
			System.out.println(value);
		}
		System.out.println("---");
		System.out.println(list1.get(3));
	}

}
