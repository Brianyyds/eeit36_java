package tw.brad.myjava;

import javax.swing.*;
import java.awt.*;	// * 表示在 java.awt Package 下所有的東西
import java.awt.event.*;

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
		setEvent();
		
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
	
	// 處理使用者的事件
	private void setEvent() {
		guess.addActionListener(new MyEventListener());
	}
	
	
	
	
	public static void main(String[] args) {
		new GuessNumber();
	}
}

class MyEventListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK");
	}
}



