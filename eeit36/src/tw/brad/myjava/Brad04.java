package tw.brad.myjava;

public class Brad04 {

	public static void main(String[] args) {
		byte var1 = 10;
		byte var2 = 3;
		// var1 = 128;	// 	紅線 => 或是 x => 無法編譯 => 無法執行
		byte var3 = (byte)(var1 + var2);	// 10 + 3 => 13 => 放在哪裡? 記憶體 => 多大的空間 => int
		// (byte, short, int) + (byte, short, int) => int
		System.out.println(var3);
		byte var4 = -126;
		var4--;	// -126 -1
		System.out.println(var4);
		var4--;	// 
		System.out.println(var4);
		var4--;	// 
		System.out.println(var4);
		// 失去精確度
		var1 = 127; var2 = 3;
		var3 = (byte)(var1 + var2);
		System.out.println(var3);
		
		short var5 = 123, var6 = 10;
		int var7 = var5 + var6;
	}

}
