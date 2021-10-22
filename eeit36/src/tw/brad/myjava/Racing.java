package tw.brad.myjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class Racing extends JFrame {
	private JButton goButton;
	private JLabel[] lanes = new JLabel[8];
	
	public Racing() {
		super("Racing Game");
		
		setLayout(new GridLayout(9,1));
		
		goButton = new JButton("Go!");
		add(goButton);
		
		for (int i=0; i<8; i++) {
			lanes[i] = new JLabel( (i+1) + ". " );
			add(lanes[i]);
		}
		
		
		setSize(800,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
