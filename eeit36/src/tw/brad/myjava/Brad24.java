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
		
		System.out.println(bike.speed);
		System.out.println(bike2.speed);
		
		System.out.println("-----");
		
		bike.upSpeed();bike.upSpeed();bike.upSpeed();bike.upSpeed();bike.upSpeed();
		System.out.println(bike.speed);
		bike.downSpeed();bike.downSpeed();
		System.out.println(bike.speed);
		
	}

}
