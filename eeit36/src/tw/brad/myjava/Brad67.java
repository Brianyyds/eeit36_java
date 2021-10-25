package tw.brad.myjava;

public class Brad67 {

	public static void main(String[] args) {
		MyThread1 mt1 = new MyThread1("A");
		
		MyTest1 mt2 = new MyTest1("B");
		Thread mt3 = new Thread(mt2);
		
		mt1.start();
		mt3.start();
		
		
	}
	
}
class MyThread1 extends Thread {
	private String name;
	public MyThread1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

class MyTest1 implements Runnable {
	private String name;
	public MyTest1(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
		}
	}
}

