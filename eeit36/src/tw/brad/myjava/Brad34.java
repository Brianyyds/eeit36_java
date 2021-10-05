package tw.brad.myjava;

public class Brad34 {
	public static void main(String[] args) {
		//Brad341 obj1 = new Brad341();
		Brad341 obj1 = new Brad342();
		Brad342 obj2 = new Brad342();
	}
}

abstract class Brad341 {
	void m1() {System.out.println("Brad341:m1()");}
	abstract void m2();
}
class Brad342 extends Brad341 {
	void m2() {System.out.println("Brad342:m2()");}
}
class Brad343 extends Brad341 {
	void m2() {System.out.println("Brad343:m2()");}	
}
