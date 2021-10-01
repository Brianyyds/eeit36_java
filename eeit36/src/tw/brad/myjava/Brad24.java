package tw.brad.myjava;

import tw.brad.myclass.Bike;

public class Brad24 {

	public static void main(String[] args) {
		Bike bike;
		bike = new Bike();
		Bike bike2 = new Bike();
		
		System.out.println(bike);
		System.out.println(bike2);
		
		System.out.println("-----");
		
		System.out.println(bike.getSpeed());
		System.out.println(bike2.getSpeed());
		
		System.out.println("-----");
		
//		bike.upSpeed();bike.upSpeed();bike.upSpeed();bike.upSpeed();bike.upSpeed();
//		System.out.println(bike.getSpeed());
//		bike.downSpeed();bike.downSpeed();
		
		while (bike.getSpeed() < 10) {
			bike.upSpeed();
		}
		
		//for(;bike.getSpeed()<10; bike.upSpeed());

		//bike.speed = 10.1;
		
		System.out.println(bike.getSpeed());
		
	}

}
