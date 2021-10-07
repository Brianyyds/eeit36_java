package tw.brad.myclass;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.LinkedList;

public class MyDrawer extends JPanel {	// MyDrawer的物件實體 is-a JPanel
	private LinkedList<HashMap<String, Integer>> line;
	
	public MyDrawer() {
		setBackground(Color.yellow);
	
		line = new LinkedList<>();
		
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseMotionListener(myMouseListener);
	}

//	@Override
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
//		if (g instanceof DebugGraphics) System.out.println("debug1");
//		if (g instanceof Graphics2D) System.out.println("debug2");
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4.123f));
		for (int i=1; i<line.size(); i++) {
			HashMap<String, Integer> p0 = line.get(i-1);
			HashMap<String, Integer> p1 = line.get(i);
			g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"),p1.get("y"));
		}
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			line.add(point);
			repaint();
		}
	}
	
}

