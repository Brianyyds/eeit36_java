package tw.brad.myjava;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JButton goButton;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private int rank;
	
	public Racing() {
		super("Racing Game");
		
		setLayout(new GridLayout(9,1));
		
		goButton = new JButton("Go!");
		add(goButton);
		
		for (int i=0; i<8; i++) {
			lanes[i] = new JLabel( (i+1) + ". " );
			add(lanes[i]);
		}
		
		goButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(1280,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void go() {
		rank = 0;
		for (int i=0; i<8; i++) {
			lanes[i].setText((i+1) + ". " );
		}		
		for (int i=0; i<8; i++) {
			cars[i] = new Car(i);
			cars[i].start();
		}
		
	}
	
	private class Car extends Thread {
		int lane;
		Car(int lane){this.lane = lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				if (i == 99) {
					lanes[lane].setText(lanes[lane].getText() + ">" + ++rank);
				}else {
					lanes[lane].setText(lanes[lane].getText() + ">");
				}
				
				try {
					Thread.sleep(50 + (int)(Math.random()*150));	// 50 ~ 199
				}catch (Exception e) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
