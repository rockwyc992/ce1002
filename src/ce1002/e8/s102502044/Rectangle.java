package ce1002.e8.s102502044;

import java.awt.*;
import javax.swing.*;

class Rectangle extends JPanel {

    Rectangle() {
        setBounds(10, 10, 200,150);
    }

    public void paintComponent(Graphics g) { 
        g.setColor(Color.blue); 
        g.fillRect(5, 5, 190, 140); 
    }
}
