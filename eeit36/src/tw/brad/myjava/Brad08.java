package tw.brad.myjava;

import javax.swing.JOptionPane;

public class Brad08 {

	public static void main(String[] args) {
		String strX =  JOptionPane.showInputDialog("x = ?");
		String strY =  JOptionPane.showInputDialog("y = ?");
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		//-----------------------------------
	
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r41 = x / y;
		int r42 = x % y;
		double r5 = x*1.0 / y;
		
		System.out.printf("%d + %d = %d\n", x , y , r1);
		System.out.printf("%d - %d = %d\n", x , y , r2);
		System.out.printf("%d x %d = %d\n", x , y , r3);
		System.out.printf("%d / %d = %d ...... %d\n", x , y , r41, r42);
		System.out.printf("%d / %d = %f\n", x , y , r5);
		
	}

}
