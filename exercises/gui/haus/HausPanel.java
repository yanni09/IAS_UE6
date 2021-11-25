package exercises.gui.haus;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;


public class HausPanel extends JPanel {

	@Override
	public void paintComponent(Graphics g) {
		
		g.setColor(Color.BLACK);
		g.drawRect(100, 200, 100, 100);
		g.drawLine(100, 200, 150, 150);
		g.drawLine(150, 150, 200, 200);
		g.drawLine(100, 200, 200, 300);
		g.drawLine(200, 200, 100, 300);
		
	}
}

