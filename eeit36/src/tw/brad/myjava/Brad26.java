package tw.brad.myjava;

import tw.brad.myclass.Scooter;

public class Brad26 {

	public static void main(String[] args) {
		Scooter scooter;
		scooter = new Scooter();	// 執行了 Constructor => tw.brad.myclass.Scooter@1234567
									// new => 在記憶體配置空間出來
		System.out.println(scooter.getGear());
		
	}

}
