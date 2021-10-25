package tw.brad.myjava;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

import tw.brad.myclass.MyClock;
import tw.brad.myclass.MyDrawer;

public class MySign extends JFrame{
	private JButton clearButton, undoButton, redoButton, saveButton, chColorButton;
	private JButton saveObjButton, loadObjButton;
	private MyDrawer myDrawer;
	private MyClock myClock;
	
	public MySign() {
		super("簽名");
	
		clearButton = new JButton("Clear");
		undoButton = new JButton("Undo");
		redoButton = new JButton("Redo");
		saveButton = new JButton("Save");
		chColorButton = new JButton("Color");
		saveObjButton = new JButton("Save Obj");
		loadObjButton = new JButton("Load Obj");
		myClock = new MyClock();
		
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
		topPanel.add(chColorButton);
		topPanel.add(saveObjButton);topPanel.add(loadObjButton);
		topPanel.add(myClock);
		
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
		chColorButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showColorDialog();
			}
		});
		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myDrawer.saveJPEG();
			}
		});
		saveObjButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.saveObj();
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "XXXXXXX");
				}
			}
		});
		loadObjButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myDrawer.loadObj();
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "XXXXXXX");
				}
			}
		});
		
	}

	private void showColorDialog() {
		Color newColor = JColorChooser.showDialog(null, "選擇畫筆顏色", myDrawer.getDefaultColor());
		if (newColor != null) {
			myDrawer.setDefaultColor(newColor);
		}
	}
	
	public static void main(String[] args) {
		new MySign();
	}

}
