package tw.brad.myjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import tw.brad.myclass.Bike;
import java.awt.*;

public class GuessNumber extends JFrame {
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	
	public GuessNumber() {
		super("猜數字遊戲");
		
		// 成員 member 初始化
		input = new JTextField();
		guess = new JButton("猜");
		log = new JTextArea();
		
		// 配置版面
		layoutView();
		
		// 處理使用者的事件
		
		setVisible(true);
		setSize(640,480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// 配置版面
	private void layoutView() {
		// 室內設計師
		setLayout(new BorderLayout());
		JPanel topJPanel = new JPanel(new BorderLayout());
		
		add(topJPanel, BorderLayout.NORTH);
		add(log, BorderLayout.CENTER);
		
		topJPanel.add(guess, BorderLayout.EAST);
		topJPanel.add(input, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		new GuessNumber();
	}

}
