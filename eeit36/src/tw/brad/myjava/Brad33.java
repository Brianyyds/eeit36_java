package tw.brad.myjava;

public class Brad33 {
	public static void main(String[] args) {
		Brad331 obj1 = new Brad331();
		obj1.m1();
		System.out.println("---");
		Brad332 obj2 = new Brad332();
		System.out.println("---");
		Brad334 obj3 = new Brad334();
		System.out.println("---");
		
		Brad331 obj4 = new Brad332();	// Brad332的物件實體 is-a Brad331
		obj4.m1();
		System.out.println("---");
		Brad332 obj5 = (Brad332)obj4;
		obj5.m1();
		obj5.m2();
		System.out.println("---");
		Brad331 obj6 = new Brad333();
		System.out.println("---");
		
		go(obj4);
		go(obj6);
		System.out.println("---");
		
		if (obj4 instanceof Object) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("---");
		//Brad334 obj7 = (Brad334)obj4;
		// 轉型 => 物件多型
		
	}
	
	public static void go(Brad331 obj) {
		obj.m1();
	}
}

class Brad331 extends Object{
	Brad331(){
		System.out.println("Brad331()");
	}
	void m1() {System.out.println("Brad331:m1()");}
}

class Brad332 extends Brad331 {
	Brad332(){
		System.out.println("Brad332()");
	}
	void m1() {System.out.println("Brad332:m1()");}
	void m2() {System.out.println("Brad332:m2()");}
}

class Brad333 extends Brad331 {
	Brad333(){
		System.out.println("Brad333()");
	}
	void m1() {System.out.println("Brad333:m1()");}
}

class Brad334 extends Brad332 {
	Brad334(){
		System.out.println("Brad334()");
	}
}


