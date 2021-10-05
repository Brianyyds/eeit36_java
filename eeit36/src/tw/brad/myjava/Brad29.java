package tw.brad.myjava;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

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
		equ.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calAdd();
			}
		});
		
		
		
		
		
		setSize(800, 72);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void calAdd() {
		int intX = Integer.parseInt(x.getText());
		int intY = Integer.parseInt(y.getText());
		int intResult = intX + intY;
		result.setText("" + intResult);
		
		
	}

	public static void main(String[] args) {
		new Brad29();
	}

}
