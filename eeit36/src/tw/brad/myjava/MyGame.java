package tw.brad.myjava;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;


public class MyGame extends JFrame{
	private MyPanel myPanel;
	
	public MyGame() {
		setLayout(new BorderLayout());
		
		myPanel = new MyPanel();
		add(myPanel, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class MyPanel extends JPanel {
		public MyPanel() {
			setBackground(Color.YELLOW);
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			try {
				BufferedImage img = ImageIO.read(new File("dir1/ball.png"));
				g.drawImage(img, 0, 0, null);
				
			} catch (IOException e) {
				System.out.println(e.toString());
			} 
			
		}
	}
	
	
	public static void main(String[] args) {
		new MyGame();
	}

}
