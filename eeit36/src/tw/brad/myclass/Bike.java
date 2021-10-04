package tw.brad.myclass;

public class Bike extends Object{
	// 成員 member => 屬性, 方法 => has-a => 物件變數.成員
	protected double speed;	// 屬性, Filed, public 存取修飾字 => 全世界, private => 本類別中
							// protected => 針對繼承的子類別, 或是相同 package
	
	public void upSpeed(){
		System.out.println("OK1");
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public String toString() {
		return "Speed = " + speed;
	}
}
