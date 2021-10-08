package tw.brad.myjava;

public class Brad43 {

	public static void main(String[] args) {
		Bird b1 = new Bird();
		b1.setLegs(2);
		b1.setLegs(1);
		System.out.println(b1.getLegs());
	}

}

class Bird {
	private int legs;
	
//	public void setLegs(int legs) {
//		if (legs >= 0 && legs <= 2) {
//			this.legs = legs;
//		}
//		// 其他不合理的值, 不接受, 不處理 => 不理你
//	}

	public void setLegs(int legs) throws Exception {
		if (legs >= 0 && legs <= 2) {
			this.legs = legs;
		}else {
			throw new Exception();	// 	出事了
		}
	}
	
	public int getLegs() {
		return legs;
	}
}
