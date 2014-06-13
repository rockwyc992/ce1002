package ce1002.finalexam.s102502044;

import java.awt.*;
import javax.swing.*;

//draw a red circle means player
class MyPanel extends JPanel {

    MyPanel() {
        setSize(100, 100);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 100, 100);
        g.clearRect(5, 5, 90, 90);
        g.setColor(Color.red);
        g.fillOval(5, 5, 90, 90);
    }
}

