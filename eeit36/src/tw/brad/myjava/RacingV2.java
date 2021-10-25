package tw.brad.myjava;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import tw.brad.myclass.MyClock;

public class RacingV2 extends JFrame {
	private JButton goButton;
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	
	private MyClock myClock;
	
	public RacingV2() {
		super("Racing Game");
		
		setLayout(new GridLayout(10,1));
		
		goButton = new JButton("Go!");
		add(goButton);
		
		myClock = new MyClock();
		add(myClock);
		
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
					lanes[lane].setText(lanes[lane].getText() + "> WINNER");
					stopGame();
				}else {
					lanes[lane].setText(lanes[lane].getText() + ">");
				}
				
				try {
					Thread.sleep(0 + (int)(Math.random()*200));	// 0 ~ 199
				}catch (InterruptedException e) {
					break;
				}
			}
		}
	}
	
	private void stopGame() {
		for (int i=0; i<8; i++) {
			cars[i].interrupt();
		}		
	}
	
	public static void main(String[] args) {
		new RacingV2();
	}

}
