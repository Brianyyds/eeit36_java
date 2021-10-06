package tw.brad.myjava;

import javax.swing.*;
import java.awt.*;	// * 表示在 java.awt Package 下所有的東西
import java.awt.event.*;

public class GuessNumber extends JFrame implements ActionListener{
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	private int counter;
	
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
		
		// 直接開新局
		newGame();
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
//		guess.addActionListener(new MyEventListener());
//		guess.addActionListener(this);
		guess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println("OK3");
				doGuess();
			}
		});
	}
	
	private void doGuess() {
		counter++;
		String userInput = input.getText();
		String result = checkAB(userInput);
		log.append(counter + ". " + userInput + " => " + result + "\n");
		input.setText("");
		
		if (result.equals("3A0B")) {
			JOptionPane.showMessageDialog(null, "恭喜老爺,賀喜夫人");
		}else if (counter == 10) {
			JOptionPane.showMessageDialog(null, "XXXXXXX");
		}
		
	}

	private void newGame() {
		counter = 0;
		setAnswer(3);
		//System.out.println(answer);
	}
	
	private String checkAB(String gString) {
		int A, B; A = B = 0;
		for (int i=0; i<answer.length(); i++) {
			char gc = gString.charAt(i);
			char ac = answer.charAt(i);
			if (gc == ac) {
				A++;
			}else if(answer.indexOf(gc) >= 0) {
				B++;
			}
		}
		return String.format("%dA%dB", A, B);
	}
	
	private void setAnswer(int digits) {
		int nums = 10;
		int[] poker = new int[nums];
		
		// 文具行買回來的
		for (int i = 0; i < nums; i++) poker[i] = i;
		
		// 開始洗牌
		for (int i = nums -1 ; i > 0 ; i--) {
			int rand = (int)(Math.random() * (i+1));
			// poker[rand] <=> poker[i];
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
		}
		
		StringBuffer sBuffer = new StringBuffer();
		for (int i=0; i<digits; i++) {
			sBuffer.append(poker[i]);
		}
		answer = sBuffer.toString();
	}
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK2");
	}
	
	
	public static void main(String[] args) {
		new GuessNumber();
	}
}

class MyEventListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("OK1");
	}
}



