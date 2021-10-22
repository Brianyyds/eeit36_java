package tw.brad.myjava;

public class Brad66 {

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("A");
		MyThread mt2 = new MyThread("B");
		
		mt1.start();
		mt2.start();
		
		System.out.println("OK");
	}

}

class MyThread extends Thread {
	String nameString;
	MyThread(String name){
		this.nameString = name;
	}
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(nameString + ":" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
}
