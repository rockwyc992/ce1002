package ce1002.q2.s102502044;

import java.awt.*;
import javax.swing.border.*;
import javax.swing.*;

class MyPanel extends JPanel {

    Color color;
    int x;
    int y;
    int dx;
    int dy;
    String graph_text;
    boolean lock;
    Thread thread;

    //設定初始值
    MyPanel() {
        Border border = new LineBorder(Color.black, 5);
        setBorder(border); 
        x = y = 50;
        graph_text = "";
        color = Color.blue;
        lock = false;
    }
    class moving implements Runnable {
        public void run() {
            while(true) {
                repaint();
                try {
                    Thread.sleep(10);
                } catch(InterruptedException e) {
                }
            }
        }
    }

    //setter
    void set_graph_color(Color color) {
        this.color = color;
    }

    void set_graph_text(String graph_text) {
        this.graph_text = graph_text;
    }

    //繪圖
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(lock) {
            if(get_mouse_X() != -1)
                x = get_mouse_X() - dx;
            if(get_mouse_Y() != -1)
                y = get_mouse_Y() - dy;
        }

        if(graph_text.matches("Circle")) {
            g.setColor(color);
            g.fillOval(x, y, 50, 50);
        } else if(graph_text.matches("Rectangle")) {
            g.setColor(color);
            g.fillRect(x, y, 50, 50);
        }
    }

    //判斷是否在圖形內
    boolean is_in_graph() {
        int x = get_mouse_X();
        int y = get_mouse_Y();
        if(graph_text.matches("Circle")) {
            int dx = x - (this.x+25);
            dx = Math.abs(dx);
            int dy = y - (this.y+25);
            dy = Math.abs(dy);
            double lenth = Math.sqrt(dx*dx + dy*dy);
            if(lenth <= 25) {
                return true;
            }
        } else if(graph_text.matches("Rectangle")) {
            if(this.x <= x && x<=(this.x+50)) {
                return true;
            }
        }
        return false;
    }

    //讓圖案跟著滑鼠
    void lock() {
        if(is_in_graph()) {
            this.lock = true;
            dx = get_mouse_X() - x;
            dy = get_mouse_Y() - y;
            thread = new Thread(new moving());
            thread.start();
        }
    }

    int get_mouse_X() {
        Point point = getMousePosition();
        if(point == null)
            return -1;
        return (int)getMousePosition().getX();
    }

    int get_mouse_Y() {
        Point point = getMousePosition();
        if(point == null)
            return -1;
        return (int)getMousePosition().getY();
    }


    //讓圖案固定
    void unlock() {
        if(this.lock) {
            this.lock = false;
            thread.stop();
        }
    }
}
