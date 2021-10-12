package tw.brad.myjava;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyEditor extends JFrame {
	private JButton openBtn, saveBtn, saveAsBtn;
	private JTextArea textArea;
	
	public MyEditor() {
		super("我的編輯器");
	
		openBtn = new JButton("Open");
		saveBtn = new JButton("Save");
		saveAsBtn = new JButton("Save as");
		
		textArea = new JTextArea();
		
		layoutView();
		
		setEvent();
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void layoutView() {
		setLayout(new BorderLayout());
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(openBtn); top.add(saveBtn); top.add(saveAsBtn);
		
		add(top, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
	}
	
	private void setEvent() {
		
	}
	
	
	public static void main(String[] args) {
		new MyEditor();
	}

}
