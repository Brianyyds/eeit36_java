package tw.brad.myclass;

public class Bike {
	public double speed;	// 屬性, Filed, public 存取修飾字 => 全世界
	
	public void upSpeed(){
		speed = speed < 1 ? 1 : speed * 1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed * 0.7;
	}
	
}
