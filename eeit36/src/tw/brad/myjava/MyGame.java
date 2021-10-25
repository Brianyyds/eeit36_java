package tw.brad.myjava;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.MouseInputAdapter;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
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
		private LinkedList<BallTask> balls;
		private int viewW, viewH;
		private BufferedImage imgBall;
		
		public MyPanel() {
			setBackground(Color.YELLOW);
			
			try {
				imgBall = ImageIO.read(new File("dir1/ball0.png"));
			} catch (IOException e) {
				System.out.println(e.toString());
			} 
			
			balls = new LinkedList<>();
			timer = new Timer();
			timer.schedule(new Refresh(), 0, 16);
			addMouseListener(new MyMouseAdapter());
			
		}
		
		private class BallTask extends TimerTask {
			int x, y, dx, dy;
			public BallTask(int x, int y) {
				this.x = x; this.y = y;
				dx = dy = 12;		
			}
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
		
		private class MyMouseAdapter extends MouseAdapter {

			@Override
			public void mouseClicked(MouseEvent e) {
				BallTask ball = new BallTask(e.getX()-36, e.getY()-36);
				timer.schedule(ball, 1*1000, 30);
				balls.add(ball);
			}
			
		}
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			
			for(BallTask ball : balls) {
				g.drawImage(imgBall, ball.x, ball.y, null);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new MyGame();
	}

}
