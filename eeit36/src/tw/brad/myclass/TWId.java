package tw.brad.myclass;

public class TWId {
	// 屬性
	private String id;	// TWId 類別物件 has-a id 的屬性
	
	// TWId 的物件, 其 id 一定要有效的, 不是 null, 而且不能被變更

	// Overload 多載 => 參數 => 個數 型別
	// 無傳參數 => 沒有設限條件 => 亂數產生一組有效的 id
	public TWId() {
		this((int)(Math.random()*2) == 0);
	}
	// 依照指定 isMale (男/女) 的隨機有效 id
	public TWId(boolean isMale) {
		this(isMale, (int)(Math.random()*26));
	}
	// 依照指定 area (報戶口地區) 的隨機有效 id 
	public TWId(int area) {
		this((int)(Math.random()*2) == 0 , area);
	}
	
	public TWId(boolean isMale, int area) {
		StringBuffer sBuffer = new StringBuffer("ABCDEFGHJKLMNPQRSTUVXYWZIO".substring(area, area+1));
		sBuffer.append(isMale?"1":"2");
		for (int i=0; i<7; i++) {
			sBuffer.append((int)(Math.random()*10));
		}
		String temp = sBuffer.toString();
		for (int i=0; i<10; i++) {
			if (checkTWId(temp + i)) {
				id = temp + i;
				break;
			}
		}
	}
	
	public TWId(String urId) {
		
	}
	
	
	
	public static boolean checkTWId(String id) {
		boolean isRight = false;
		
		if (id.matches("[A-Z][12][0-9]{8}")) {
			String letterString = "ABCDEFGHJKLMNPQRSTUVXYWZIO";	// 10 - 35 indexOf() => 0, 1, 2, ...
			char c1 = id.charAt(0);	// A
			int pos = letterString.indexOf(c1);	// 0 - 25
			int c12 = pos + 10;	// 10 - 35
			int n1 = c12 / 10;	// 十位數
			int n2 = c12 % 10;	// 個位數
			//System.out.println(n1 + ":" + n2);
			String s2 = id.substring(1, 2);
			int n3 = Integer.parseInt(s2);
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 +
					n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			
			isRight = sum % 10 == 0;
		}
				
		return isRight;
	}

}
