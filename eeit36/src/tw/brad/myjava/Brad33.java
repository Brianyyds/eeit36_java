package tw.brad.myjava;

public class Brad33 {
	public static void main(String[] args) {
		Brad331 obj1 = new Brad331();
		System.out.println("---");
		Brad332 obj2 = new Brad332(2);
		System.out.println("---");
		Brad334 obj3 = new Brad334();
	}
}

class Brad331 extends Object{
	Brad331(){
		System.out.println("Brad331()");
	}
}

class Brad332 extends Brad331 {
	Brad332(int a){
		System.out.println("Brad332()");
	}
}

class Brad333 extends Brad331 {
	Brad333(){
		System.out.println("Brad333()");
	}
}

class Brad334 extends Brad332 {
	Brad334(){
		super(2);
		System.out.println("Brad334()");
	}
}


