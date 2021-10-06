package tw.brad.myjava;

public class Brad36 {

	public static void main(String[] args) {
		RectShape s1 = new RectShape(); s1.side1 = 2; s1.side2 = 3;
		CircleShape s2 = new CircleShape(); s2.r = 4;

		test1(s1);
		test1(s2);
	}
	
	public static void test1(Shape shape) {
		System.out.println("邊長:" + shape.length() + "; 面積:" + shape.area());
	}

}

interface Shape {
	double length();
	double area();
}

class RectShape implements Shape {
	double side1, side2;
	public double length() {return (side1 + side2) * 2;}
	public double area() {return side1 * side2;}
}
class CircleShape implements Shape {
	double r;
	public double length() {return 2*Math.PI*r;}
	public double area() {return Math.PI * r * r;}
}
