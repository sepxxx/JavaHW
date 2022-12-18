package deadline24_11_2;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPicBut {
    static class DFrame extends JFrame {

        JButton switch_ch = new JButton("SWITCH CHANNEL");
        DrawTV1 TV1 = new DrawTV1();
        DrawTV2 TV2 = new DrawTV2();
        JPanel buttons = new JPanel();

        public DFrame() {
            setTitle("DrawTest");
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            Container c = getContentPane();
            switch_ch.addActionListener(new CustomActionListener());
            c.add(TV1);

            switch_ch.setSize(100, 100);
            buttons.add(switch_ch);
            c.add(buttons, "North");

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public static final int DEFAULT_WIDTH = 1500;
        public static final int DEFAULT_HEIGHT = 900;


        class CustomActionListener implements ActionListener {
            int was_first = 1;
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == switch_ch) {
                getContentPane().removeAll();
                if (was_first==1) {
                    getContentPane().add(TV1, "Center");
                    was_first = 0;
                } else {
                    getContentPane().add(TV2, "Center");
                    was_first = 1;
                }
                getContentPane().add(buttons, "North");
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        }
        }
    }
    static class DrawTV1 extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
//        double leftX = 300;
//        double topY = 200;
            double width = 300;
            double height = 200;
            double leftX = (getSize().width - width) / 2;
            double topY = (getSize().height - height) / 2;

            Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
            g2.setPaint(new Color(0x987654));
            g2.fill(rect);
            g2.setPaint(Color.BLACK);
            g2.draw(rect);

            Rectangle2D rect2 = new Rectangle2D.Double(leftX+12, topY+25,200, 150);
            g2.setPaint(Color.GRAY);
            g2.fill(rect2);
            g2.setPaint(Color.BLACK);
            g2.draw(rect2);

            Rectangle2D rect3 = new Rectangle2D.Double(leftX+222, topY+25,60, 150);
            g2.setPaint(new Color(0x20F6800E, true));
            g2.fill(rect3);
            g2.setPaint(Color.BLACK);
            g2.draw(rect3);

            Ellipse2D ellipse1 = new Ellipse2D.Double(leftX+235, topY+50,35, 35);
            g2.setPaint(Color.GRAY);
            g2.fill(ellipse1);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse1);

            Ellipse2D ellipse2 = new Ellipse2D.Double(leftX+235, topY+100,35, 35);
            g2.setPaint(Color.GRAY);
            g2.fill(ellipse2);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse2);


            g2.draw(new Line2D.Double(leftX+150, topY, leftX+20, topY-40));
            g2.draw(new Line2D.Double(leftX+150, topY, leftX +280, topY-40));

            Ellipse2D ellipse3 = new Ellipse2D.Double(leftX+80, topY+50,80, 80);
            g2.setPaint(Color.YELLOW);
            g2.fill(ellipse3);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse3);

            Ellipse2D ellipse4 = new Ellipse2D.Double(leftX+95, topY+70,15, 15);
            g2.setPaint(Color.BLACK);
            g2.fill(ellipse4);
            g2.draw(ellipse4);

            Ellipse2D ellipse5 = new Ellipse2D.Double(leftX+130, topY+70,15, 15);
            g2.setPaint(Color.BLACK);
            g2.fill(ellipse5);
            g2.draw(ellipse5);

            g2.setPaint(Color.BLACK);
            g2.fillArc((int)leftX+110,(int)topY+100,20, 20, 0, 360);


        }
    }

    static class DrawTV2 extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
//        double leftX = 300;
//        double topY = 200;
            double width = 300;
            double height = 200;
            double leftX = (getSize().width - width) / 2;
            double topY = (getSize().height - height) / 2;

            Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
            g2.setPaint(new Color(0x987654));
            g2.fill(rect);
            g2.setPaint(Color.BLACK);
            g2.draw(rect);

            Rectangle2D rect2 = new Rectangle2D.Double(leftX + 12, topY + 25, 200, 150);
            g2.setPaint(Color.GRAY);
            g2.fill(rect2);
            g2.setPaint(Color.BLACK);
            g2.draw(rect2);

            Rectangle2D rect3 = new Rectangle2D.Double(leftX + 222, topY + 25, 60, 150);
            g2.setPaint(new Color(0x20F6800E, true));
            g2.fill(rect3);
            g2.setPaint(Color.BLACK);
            g2.draw(rect3);

            Ellipse2D ellipse1 = new Ellipse2D.Double(leftX + 235, topY + 50, 35, 35);
            g2.setPaint(Color.GRAY);
            g2.fill(ellipse1);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse1);

            Ellipse2D ellipse2 = new Ellipse2D.Double(leftX + 235, topY + 100, 35, 35);
            g2.setPaint(Color.GRAY);
            g2.fill(ellipse2);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse2);


            g2.draw(new Line2D.Double(leftX + 150, topY, leftX + 20, topY - 40));
            g2.draw(new Line2D.Double(leftX + 150, topY, leftX + 280, topY - 40));


            Ellipse2D ellipse3 = new Ellipse2D.Double(leftX+80, topY+50,80, 80);
            g2.setPaint(Color.RED);
            g2.fill(ellipse3);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse3);

            Ellipse2D ellipse4 = new Ellipse2D.Double(leftX+95, topY+70,15, 15);
            g2.setPaint(Color.BLACK);
            g2.fill(ellipse4);
            g2.draw(ellipse4);

            Ellipse2D ellipse5 = new Ellipse2D.Double(leftX+130, topY+70,15, 15);
            g2.setPaint(Color.BLACK);
            g2.fill(ellipse5);
            g2.draw(ellipse5);

            g2.setPaint(Color.BLACK);
            g2.fillArc((int)leftX+110,(int)topY+100,20, 20, 0, 180);

        }
    }

    public static void main(String[] args) {
        DFrame frame = new DFrame();
    }
}
