package tw.brad.myjava;

public class Brad35 {
	public static void main(String[] args) {

	}
}

// interface 介面 => 規格 => 定義規格
interface Brad351 {
	void m1();
	int m1(int a);
	void m2();
}
class Brad352 implements Brad351 {
	public void m1() {}
	public int m1(int a) {return 1;}
	public void m2() {}
	
}
