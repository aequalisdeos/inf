import javax.swing.*;
import java.awt.*;
public class z5 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.LIGHT_GRAY);
        for (int i = 1; i <= 8; i++) {
            int x = 100 * i;
            g2d.drawLine(x, 50, x, 500);
        }
        for (int i = 1; i <= 10; i++) {
            int y = 500 - 50 * i;
            g2d.drawLine(50, y, 750, y);
        }
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(150, 450, 100, 250);
        g2d.drawLine(100, 250, 200, 200);
        g2d.drawArc(200, 100, 200, 200, 0, 180);
        g2d.drawLine(400, 200, 550, 150);
        g2d.drawLine(550, 150, 350, 400);
        g2d.drawLine(350, 400, 150, 450);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        g2d.drawLine(550, 250, 650, 150);
        g2d.drawLine(650, 150, 700, 350);
        g2d.drawArc(500, 250, 200, 200, 0, -180);
        g2d.drawLine(500, 350, 600, 400);
        g2d.drawLine(600, 400, 550, 250);
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Serif", Font.PLAIN, 12));
        g2d.drawString("-6", 40, 525);
        g2d.drawString("-4", 143, 525);
        g2d.drawString("-2", 243, 525);
        g2d.drawString("0", 346, 525);
        g2d.drawString("2", 446, 525);
        g2d.drawString("4", 546, 525);
        g2d.drawString("6", 646, 525);
        g2d.drawString("-3", 27, 503);
        g2d.drawString("-2", 27, 453);
        g2d.drawString("-1", 27, 403);
        g2d.drawString("0", 27, 353);
        g2d.drawString("1", 27, 303);
        g2d.drawString("2", 27, 253);
        g2d.drawString("3", 27, 203);
        g2d.drawString("4", 27, 153);
        g2d.drawString("5", 27, 103);
        g2d.drawString("6", 27, 53);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("График");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        z5 panel = new z5();
        frame.add(panel);
        frame.setVisible(true);
    }
}
