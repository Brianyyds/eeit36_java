package tw.brad.myclass;

import java.io.Serializable;

public class Student implements Serializable{
	private int ch, math, eng;
	private Bike bike;
	
	public Student(int ch, int math, int eng, Bike bike) {
		this.ch = ch;
		this.math = math;
		this.eng = eng;
		this.bike = bike;
	}
	public int sum() {
		return ch + math + eng;
	}
	
	public double avg() {
		return sum() / 3.0;
	}
	
	public double getBikeSpeed() {
		return bike.getSpeed();
	}
}
