package exercises.gui.ring1;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Graphics2D;

public class RingPanel extends JPanel{

    //private static final long serialVersionUID = 2L;
    
    @Override
    public void paintComponent(Graphics g) {

        g.setColor(Color.BLUE);
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g.drawOval(100,100,100,100);
        g.setColor(Color.BLACK);
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g.drawOval(210,100,100,100);
        g.setColor(Color.RED);
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g.drawOval(320,100,100,100);
        g.setColor(Color.YELLOW);
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g.drawOval(155, 150, 100, 100);
        g.setColor(Color.GREEN);
        ((Graphics2D) g).setStroke(new BasicStroke(2.0f));
        g.drawOval(265, 150, 100, 100);
        
    }

}
