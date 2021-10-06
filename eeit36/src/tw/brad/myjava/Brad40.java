package tw.brad.myjava;

import java.util.LinkedList;

public class Brad40 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0, 111);
		list.add(0, 222);
		list.add(0, 333);
		list.add(0, 444);
		list.add(0, 555);
		list.add(0, 666);
		list.add(0, 777);
		
		for (Integer value : list) {
			System.out.println(value);
		}
	}

}
