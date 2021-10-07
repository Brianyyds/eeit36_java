package tw.brad.myjava;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySign extends JFrame{
	private JButton clearButton, undoButton, redoButton, saveButton;
	
	public MySign() {
		super("簽名");
	
		clearButton = new JButton("Clear");
		undoButton = new JButton("Undo");
		redoButton = new JButton("Redo");
		saveButton = new JButton("Save");
		
		// 版面配置
		layoutView();
		
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	// 版面配置
	private void layoutView() {
		setLayout(new BorderLayout());
		
		JPanel topPanel = new JPanel(new FlowLayout());
		add(topPanel, BorderLayout.NORTH);
		
		topPanel.add(clearButton); topPanel.add(undoButton);
		topPanel.add(redoButton); topPanel.add(saveButton);
		
		
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
