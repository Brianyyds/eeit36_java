package tw.brad.myjava;

import tw.brad.myclass.Brad01;
import tw.brad.myclass.Brad02;

public class Brad27 {

	public static void main(String[] args) {
		Brad01 obj1 = new Brad01();
		Brad01 obj3 = new Brad01(1);
		obj1.m1();
		System.out.println("---");
		Brad02 obj2 = new Brad02();
		System.out.println("---");
		obj2.m1();
		
	}

}
