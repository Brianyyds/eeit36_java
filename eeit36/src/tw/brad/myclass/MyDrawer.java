package tw.brad.myclass;

import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;
import java.awt.*;

public class MyDrawer extends JPanel {	// MyDrawer的物件實體 is-a JPanel
	public MyDrawer() {
		setBackground(Color.yellow);
	}

//	@Override
//	protected void paintComponent(Graphics g) {
//		// TODO Auto-generated method stub
//		super.paintComponent(g);
//	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (g instanceof DebugGraphics) System.out.println("debug1");
		if (g instanceof Graphics2D) System.out.println("debug2");
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4.123f));
		
		g2d.drawLine(0,0, 200,200);
	}
	
}
