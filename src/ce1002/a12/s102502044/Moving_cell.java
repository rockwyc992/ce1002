package ce1002.a12.s102502044;

import javax.swing.*;

public class Moving_cell extends JButton implements Runnable {
    int height;
    int width;
    int bounce_counter;
    double x;
    double y;
    double dx;
    double dy;

    Moving_cell(int height, int width) {
        this.height = height - 80;
        this.width = width - 50;
        x = width / 2;
        y = height / 2;

        setBounds((int)x, (int)y, 50, 50);

        double r = Math.random() * Math.PI * 2;
        dx = 3 * Math.cos(r);
        dy = 3 * Math.sin(r);
    }

    public void run() {
        while(true) {
            x += dx;
            y += dy;

            if(x<0 || x>width || y<0 || y>height) {
                if(x < 0) {
                    x = -x;
                    dx = -dx;
                } else if (x > width) {
                    x = -x + 2* width;
                    dx = -dx;
                }

                if(y < 0) {
                    y = -y;
                    dy = -dy;
                } else if (y > height) {
                    y = -y +2* height;
                    dy = -dy;
                }
                bounce_counter++;
            }

            setText(bounce_counter+"");
            setLocation((int)x, (int)y);

            try {
                Thread.sleep(10); 
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
