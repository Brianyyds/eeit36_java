package tw.brad.myclass;

public class Student {
	private int ch, math, eng;
	public Student(int ch, int math, int eng) {
		this.ch = ch;
		this.math = math;
		this.eng = eng;
	}
	public int sum() {
		return ch + math + eng;
	}
	
	public double avg() {
		return sum() / 3.0;
	}
}
