package deadline10_11_2;

import javax.swing.*;
class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("DrawTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        drawComponent c = new drawComponent();
        add(c);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static final int DEFAULT_WIDTH = 900;
    public static final int DEFAULT_HEIGHT = 600;
}