package deadline24_11_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class DrawPicBut {
    static class DFrame extends JFrame {

        JButton bDay = new JButton("DAY");
        JButton bNight = new JButton("NIGHT");
        drawPicDay PicDay = new drawPicDay();
        drawPicNight PicNight = new drawPicNight();
        JPanel buttons = new JPanel();

        public DFrame() {
            setTitle("DrawTest");
            setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
            Container c = getContentPane();
            bDay.addActionListener(new CustomActionListener());
            bNight.addActionListener(new CustomActionListener());
            c.add(PicDay);

            buttons.add(bDay);
            buttons.add(bNight);
            c.add(buttons, "North");

            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
        public static final int DEFAULT_WIDTH = 1500;
        public static final int DEFAULT_HEIGHT = 900;


        class CustomActionListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bDay) {
                getContentPane().removeAll();
                getContentPane().add(PicDay, "Center");
                getContentPane().add(buttons, "North");
                getContentPane().revalidate();
                getContentPane().repaint();
            }
            if (e.getSource() == bNight) {
                getContentPane().removeAll();
                getContentPane().add(PicNight, "Center");
                getContentPane().add(buttons, "North");
                getContentPane().revalidate();
                getContentPane().repaint();
            }
        }
        }
    }
    static class drawPicDay extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            double leftX = 300;
            double topY = 50;
            double width = 300;
            double height = 400;
            g2.setPaint(new Color(0x6F004CFF, true));
            g2.fillRect(0, 0, getSize().width- 1, getSize().height- 1);


            Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
            g2.setPaint(new Color(0x8CBEA9A1, true));
            g2.fill(rect);
            g2.setPaint(Color.BLACK);
            g2.draw(rect);

            Rectangle2D rect2 = new Rectangle2D.Double(leftX+10, topY+10, width/2 - 20, 120);
            g2.setPaint(new Color(0x4C004CFF, true));
            g2.fill(rect2);
            g2.setPaint(Color.BLACK);
            g2.draw(rect2);

            Rectangle2D rect3 = new Rectangle2D.Double(leftX+10, topY+140, width/2 - 20, 240);
            g2.setPaint(new Color(0x4C004CFF, true));
            g2.fill(rect3);
            g2.setPaint(Color.BLACK);
            g2.draw(rect3);

            Rectangle2D rect4 = new Rectangle2D.Double(leftX+width/2 +10, topY+10, width/2 - 20, 120);
            g2.setPaint(new Color(0x4C004CFF, true));
            g2.fill(rect4);
            g2.setPaint(Color.BLACK);
            g2.draw(rect4);

            Rectangle2D rect5 = new Rectangle2D.Double(leftX+ width/2 + 10, topY+140, width/2 - 20, 240);
            g2.setPaint(new Color(0x4C004CFF, true));
            g2.fill(rect5);
            g2.setPaint(Color.BLACK);
            g2.draw(rect5);


            Rectangle2D rect6 = new Rectangle2D.Double(leftX-10, topY+height, width+20, 15);
            g2.setPaint(new Color(0x8CBEA9A1, true));
            g2.fill(rect6);
            g2.setPaint(Color.BLACK);
            g2.draw(rect6);

            Rectangle2D rect7 = new Rectangle2D.Double(leftX+20, topY+height-60, 50, 60);
            g2.setPaint(new Color(0x99F6800E));
            g2.fill(rect7);
            g2.setPaint(Color.BLACK);
            g2.draw(rect7);

            g2.setPaint(Color.GREEN);
            g2.draw(new Line2D.Double(leftX+45, topY+height-60, leftX+45, topY+height-80));


            Ellipse2D ellipse1 = new Ellipse2D.Double(leftX+35, topY+height-100,20, 20);
            g2.setPaint(Color.RED);
            g2.fill(ellipse1);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse1);


            Ellipse2D ellipse2 = new Ellipse2D.Double(leftX+width/2 +60, topY+20, 50, 50);
            g2.setPaint(Color.YELLOW);
            g2.fill(ellipse2);
            //ellipse2.setFrame(rect4);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse2);
        }
    }
    static class drawPicNight extends JComponent {
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            double leftX = 300;
            double topY = 50;
            double width = 300;
            double height = 400;
            g2.setPaint(new Color(0x6F004CFF, true));
            g2.fillRect(0, 0, getSize().width- 1, getSize().height- 1);


            Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
            g2.setPaint(new Color(0x8CBEA9A1, true));
            g2.fill(rect);
            g2.setPaint(Color.BLACK);
            g2.draw(rect);

            Rectangle2D rect2 = new Rectangle2D.Double(leftX+10, topY+10, width/2 - 20, 120);
            g2.setPaint(new Color(0xCC031026, true));
            g2.fill(rect2);
            g2.setPaint(Color.BLACK);
            g2.draw(rect2);

            Rectangle2D rect3 = new Rectangle2D.Double(leftX+10, topY+140, width/2 - 20, 240);
            g2.setPaint(new Color(0xCC031026, true));
            g2.fill(rect3);
            g2.setPaint(Color.BLACK);
            g2.draw(rect3);

            Rectangle2D rect4 = new Rectangle2D.Double(leftX+width/2 +10, topY+10, width/2 - 20, 120);
            g2.setPaint(new Color(0xCC031026, true));
            g2.fill(rect4);
            g2.setPaint(Color.BLACK);
            g2.draw(rect4);

            Rectangle2D rect5 = new Rectangle2D.Double(leftX+ width/2 + 10, topY+140, width/2 - 20, 240);
            g2.setPaint(new Color(0xCC031026, true));
            g2.fill(rect5);
            g2.setPaint(Color.BLACK);
            g2.draw(rect5);


            Rectangle2D rect6 = new Rectangle2D.Double(leftX-10, topY+height, width+20, 15);
            g2.setPaint(new Color(0x8CBEA9A1, true));
            g2.fill(rect6);
            g2.setPaint(Color.BLACK);
            g2.draw(rect6);

            Rectangle2D rect7 = new Rectangle2D.Double(leftX+20, topY+height-60, 50, 60);
            g2.setPaint(new Color(0x99F6800E));
            g2.fill(rect7);
            g2.setPaint(Color.BLACK);
            g2.draw(rect7);

            g2.setPaint(Color.GREEN);
            g2.draw(new Line2D.Double(leftX+45, topY+height-60, leftX+45, topY+height-80));


            Ellipse2D ellipse1 = new Ellipse2D.Double(leftX+35, topY+height-100,20, 20);
            g2.setPaint(Color.RED);
            g2.fill(ellipse1);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse1);


            Ellipse2D ellipse2 = new Ellipse2D.Double(leftX+width/2 +60, topY+20, 50, 50);
            g2.setPaint(new Color(0xCC878A14, true));
            g2.fill(ellipse2);
            //ellipse2.setFrame(rect4);
            g2.setPaint(Color.BLACK);
            g2.draw(ellipse2);
        }
    }
    public static void main(String[] args) {
        DFrame frame = new DFrame();
    }
}
