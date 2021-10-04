package tw.brad.myjava;

import javax.swing.JFrame;

public class Brad28 extends JFrame{ // Brad28 extends JFrame => Brad28的物件 is-a JFrame
	public Brad28() {
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad28();
	}

}
