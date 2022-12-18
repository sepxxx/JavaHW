package deadline10_11_1;
import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
class DrawComponent extends JComponent {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        double leftX = 300;
        double topY = 200;
        double width = 300;
        double height = 200;

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
        g2.fillArc((int)leftX+110,(int)topY+100,20, 20, 0, 180);


        //устанавливаем белый цвет
        g2.setPaint(Color.BLUE);

        //устанавливаем шрифт
        Font f = new Font("Serif", Font.BOLD, 5000);

        //подписываем рисунок
        g2.drawString("Чертеж телевизора", (int)(leftX+100), (int)(topY + 300));

    }
}