package tw.brad.myjava;

import java.util.HashSet;

import tw.brad.myclass.Bike;

public class Brad37 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Brad");
		System.out.println(set.size());
		set.add("Brad");
		System.out.println(set.size());
		set.add(new Bike());
		System.out.println(set.size());
		set.add(new Bike());
		System.out.println(set.size());
		set.add(123);	// int => auto-boxing(自動封箱) => Integer物件實體
						// Integer => unboxing => int
		System.out.println(set.size());
		System.out.println("---");
		
		Integer i1 = 123;	// auto-boxing
		int a = i1;
		System.out.println(a);
		System.out.println("---");
		
		Integer a1 = new Integer(10);
		Integer a2 = new Integer(3);
		Integer a3 = a1 + a2;
		System.out.println(a3);
		System.out.println(new Bike());
		
		
		
		
	}

}
