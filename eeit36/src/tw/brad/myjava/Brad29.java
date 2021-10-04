package tw.brad.myjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

public class Brad29 extends JFrame {
	private JTextField x, y; 
	private JLabel add, result;
	private JButton equ;
	
	public Brad29() {
		super("加法運算器");
		
		setLayout(new FlowLayout());
		x = new JTextField(4);
		y = new JTextField(4);
		add = new JLabel("+");
		equ = new JButton("=");
		result = new JLabel();
		
		add(x); add(add); add(y); add(equ); add(result);
		
		setSize(800, 72);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad29();
	}

}
