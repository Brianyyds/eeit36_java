package tw.brad.myjava;

public class Brad43 {

	// Exception => 例外/異常 => X => 創造開發者的彈性
	public static void main(String[] args) {
		Bird b1 = new Bird();
		
		b1.setLegsV1(-2);
		System.out.println(b1.getLegs());
		
		try {
			b1.setLegsV2(-2);
		} catch (Exception e) {
			//System.out.println("err");
			// 或是其他處理方式
		}
		
		System.out.println(b1.getLegs());
	}

}

class Bird {
	private int legs;
	
	public void setLegsV1(int legs) {
		if (legs >= 0 && legs <= 2) {
			this.legs = legs;
		}
		// 其他不合理的值, 不接受, 不處理 => 不理你
	}

	public void setLegsV2(int legs) throws Exception {
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
