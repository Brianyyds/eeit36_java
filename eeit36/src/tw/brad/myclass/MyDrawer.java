package tw.brad.myclass;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import java.util.LinkedList;

public class MyDrawer extends JPanel {	// MyDrawer的物件實體 is-a JPanel
	private LinkedList<LinkedList<HashMap<String, Integer>>> lines, recycler;
	private Color defaultColor;
	
	public MyDrawer() {
		setBackground(Color.yellow);
	
		lines = new LinkedList<>();
		recycler = new LinkedList<>();
		
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseMotionListener(myMouseListener);
		addMouseListener(myMouseListener);
		
		defaultColor = Color.GREEN;
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
		
		//g2d.setColor(defaultColor);
		
		g2d.setStroke(new BasicStroke(4.123f));

		// 畫所有在 lines 中的每一個 line
		for (LinkedList<HashMap<String, Integer>> line : lines) {

			g2d.setColor(new Color(line.get(0).get("color")));
			
			// 畫一條 line
			for (int i=1; i<line.size(); i++) {
				HashMap<String, Integer> p0 = line.get(i-1);
				HashMap<String, Integer> p1 = line.get(i);
				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"),p1.get("y"));
			}			
		}
		
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			
			// point 放在 lines 中, 最後的那一條線中
			lines.getLast().add(point);
			repaint();
		}

		@Override
		public void mousePressed(MouseEvent e) {
			HashMap<String, Integer> point = new HashMap<>();
			point.put("x", e.getX()); point.put("y", e.getY());
			point.put("color", defaultColor.getRGB());
			
			LinkedList<HashMap<String, Integer>> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			
			recycler.clear();
		}
	}
	
	public void clear() {
		lines.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size() > 0) {
			recycler.add(lines.removeLast()) ;
			repaint();
		}
	}

	public void redo() {
		if (recycler.size() > 0) {
			lines.add(recycler.removeLast()) ;
			repaint();
		}
	}
	
	public Color getDefaultColor() {return defaultColor;}
	public void setDefaultColor(Color color) {defaultColor = color;}

	
}

