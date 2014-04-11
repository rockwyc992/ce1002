package ce1002.e7.s102502044;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {

    MyPanel () {
        setBounds(0, 0, 500, 500);
    }
    
    public void paintComponent(Graphics g) { 
        for (int i=0 ; i<10 ; i++) {
            for (int j=0 ; j<10 ; j++) { 
                if ((i+j) % 2 == 1) 
                    g.setColor(Color.black); 
                else 
                    g.setColor(Color.white); 
                g.fillRect(j*50, i*50, 50, 50); 
            } 
        }
    }
}
