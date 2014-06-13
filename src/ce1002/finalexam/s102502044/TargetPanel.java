package ce1002.finalexam.s102502044;

import javax.swing.*;
import java.awt.*;

//draw a blue rectangle, means target
class TargetPanel extends JPanel {

    TargetPanel() {
        setSize(100, 100);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(0, 0, 100, 100);
        g.setColor(Color.blue);
        g.fillRect(5, 5, 90, 90);
    }
}

