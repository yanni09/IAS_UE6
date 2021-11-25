package exercises.gui.ring1;

import javax.swing.*;

class Rings {
    public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        RingPanel RingPanel = new RingPanel();

        frame.add(RingPanel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}