package Swing;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class LearningSwing {
    public static void main(String[] args) {
        JFrame frame = new JFrame() {
            public void paint(Graphics g) {
                g.drawString("Learning", 110, 150);
                g.drawOval(100, 110, 90, 30);
            }
        };

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}