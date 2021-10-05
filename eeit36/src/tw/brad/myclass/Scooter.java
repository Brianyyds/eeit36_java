package tw.brad.myclass;

public class Scooter extends Bike {	// Bike is Scooter => superclass父類別, Scotter is Bike => subclass子類別
	private int gear;	// 0, 1, 2, 3, 4, 5 => 屬性 => Scooter 物件所 has-a
	private String color;

	// 建構方法 / 建構式 / 建構子 Constructor => Brad Version : 初始化方法
	public Scooter(){
		System.out.println("Scooter()");
		gear = 4;
		color = "Yellow";
	}
	
	public int getGear() {	// 方法 method => (函數 function; f(x) = 2x + 1)
		
		return gear;
	}

	public void setGear(int gear) {
		if (gear >=0 && gear <= 5) {
			this.gear = gear;	// 	本類別所產生的物件 => this
		}else {
			System.out.println("xxx, xxxx");
		}
	}

	// 改寫, 改良 => Override 覆寫
	public void upSpeed(){
		speed = (speed < 1 && gear > 0) ? 1 : speed + 3 * gear;
	}
	
}
