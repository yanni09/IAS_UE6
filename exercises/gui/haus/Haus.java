package exercises.gui.haus;

import java.awt.Color;

import javax.swing.JFrame;

public class Haus {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HausPanel haus = new HausPanel();
		haus.setBackground(Color.WHITE); //funktioniert nicht
		
		frame.add(haus);
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
}