package tw.brad.myjava;

public class Brad35 {
	public static void main(String[] args) {
		Brad352 obj1 = new Brad352();
		Brad351 obj2 = new Brad352();
		Brad353 obj3 = new Brad352();
	}
}

// interface 介面 => 規格 => 定義規格
interface Brad351 {
	void m1();
	int m1(int a);
	void m2();
}
interface Brad353 {
	void m4();
}
class Brad352 implements Brad351, Brad353 {
	public void m1() {}
	public int m1(int a) {return 1;}
	public void m2() {}
	void m3() {}
	public void m4() {}
}
