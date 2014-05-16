package ce1002.e11.s102502044;

import java.awt.*;
import java.util.*;
import javax.swing.JPanel; 

class Graphs extends JPanel{

    Color[] colors;
    Timer timer; 

    Graphs() {
        setBounds(10, 10, 250, 250);
        
        colors = new Color[3];
        colors[0] = Color.red;
        colors[1] = Color.green;
        colors[2] = Color.blue;

        TimerTask draw_on = new Draw_on();

        timer = new Timer();
        int delay = 1000;
        timer.schedule(draw_on, delay, delay);
    }
    
    public void paintComponent(Graphics g) { 
        super.paintComponent(g);
        Random rand = new Random();
        int x = rand.nextInt(200);
        int y = rand.nextInt(200);
        Color color = colors[rand.nextInt(3)];
        g.setColor(color); 
        if(rand.nextBoolean()) {
            g.fillOval(x, y, 50, 50); 
        } else {
            g.fillRect(x, y, 50, 50);
        }
    }

    class Draw_on extends TimerTask {

        Draw_on() {
        }
        
        public void run() {
            repaint();
        }
    }
}
