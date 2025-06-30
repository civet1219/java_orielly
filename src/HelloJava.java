import java.awt.*;
import javax.swing.*;

class HelloComponent extends JComponent {
    public void paintComponent(Graphics g) {
        g.drawString("Hello, Java!", 125, 95);
    }
}

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Java!");
        frame.setSize(300,150);
        frame.setVisible(true);

        frame.add(new HelloComponent());
        frame.setVisible(true);
    }
}
