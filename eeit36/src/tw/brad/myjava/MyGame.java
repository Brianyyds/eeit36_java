package tw.brad.myjava;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;


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
		private Timer timer;
		private int x, y, dx, dy;
		private int viewW, viewH;
		
		public MyPanel() {
			setBackground(Color.YELLOW);
			timer = new Timer();
			timer.schedule(new Refresh(), 0, 16);
			timer.schedule(new BallTask(), 1*1000, 30);
			x = y = 0;
			dx = dy = 12;
		}
		
		private class BallTask extends TimerTask {
			@Override
			public void run() {
				if (x < 0 || x + 72 >= viewW ) {
					dx *= -1;
				}
				if (y < 0 || y + 72 >= viewH) {
					dy *= -1;
				}
				
				x += dx;
				y += dy;
				
			}
		}
		
		private class Refresh extends TimerTask {
			@Override
			public void run() {
				repaint();		
			}
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			
			try {
				BufferedImage img = ImageIO.read(new File("dir1/ball0.png"));
				g.drawImage(img, x, y, null);
				
			} catch (IOException e) {
				System.out.println(e.toString());
			} 
		}
	}
	
	
	public static void main(String[] args) {
		new MyGame();
	}

}
