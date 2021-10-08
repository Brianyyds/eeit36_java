package tw.brad.myjava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import tw.brad.myclass.MyDrawer;

public class MySign extends JFrame{
	private JButton clearButton, undoButton, redoButton, saveButton;
	private MyDrawer myDrawer;
	
	public MySign() {
		super("簽名");
	
		clearButton = new JButton("Clear");
		undoButton = new JButton("Undo");
		redoButton = new JButton("Redo");
		saveButton = new JButton("Save");
		
		myDrawer = new MyDrawer();
		
		// 版面配置
		layoutView();
		
		setEvent();
		
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
		
		add(myDrawer, BorderLayout.CENTER);
	}
	
	private void setEvent() {
		clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.clear();
			}
		});
		undoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.undo();
			}
		});
		redoButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.redo();
			}
		});
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
