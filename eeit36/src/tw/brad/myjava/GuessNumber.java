package tw.brad.myjava;

import javax.swing.JFrame;

import tw.brad.myclass.Bike;

public class GuessNumber extends JFrame {
	public GuessNumber() {
		super("猜數字遊戲");
		
		// 配置版面
		
		// 處理使用者的事件
		
		setVisible(true);
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GuessNumber();
	}

}
