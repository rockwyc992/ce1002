package ce1002.finalexam.s102502044;

import javax.swing.*;
import java.awt.event.*;

class MyFrame extends JFrame {

    JPanel player;
    JPanel target;
    JButton[] forward;
    int dx;
    int dy;

    //frame constructor
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Final-102502044");
     
        new_all_member();

        setSize(600, 600);
        setVisible(true);
    }

    //new four forward button, keylistener, player, and target
    void new_all_member() {
        dx = dy = 10;
        forward = new JButton[4];
        new_forward(0, "↑",   0, -dy);
        new_forward(1, "↓",   0,  dy);
        new_forward(2, "←", -dx,   0);
        new_forward(3, "→",  dx,   0);
        forward[0].setLocation(450, 10);
        forward[1].setLocation(450, 60);
        forward[2].setLocation(400, 60);
        forward[3].setLocation(500, 60);
        
        player = new MyPanel();
        player.setLocation(10, 10);
        add(player);

        target = new TargetPanel();
        target.setLocation(450, 450);
        add(target);

        KeyListener listener = new Forward_Key_listener(10, 10);
        addKeyListener(listener);

        repaint();
    }

    //new a forward button
    void new_forward(int i, String name, int dx, int dy) {
        Forward_listener listener = new Forward_listener(dx, dy);
        forward[i] = new JButton(name);
        forward[i].addActionListener(listener);
        forward[i].setSize(50, 50);
        forward[i].setFocusable(false);
        add(forward[i]);
    }

    //check is playertouch the target
    void Check() {
        int px = player.getX();
        int py = player.getY();
        int tx = target.getX();
        int ty = target.getY();
        if((px<=tx && tx<=px+100) || (tx<=px && px<=tx+100)) {
            if((py<=ty && ty<=py+100) || (ty<=py && py<=ty+100)) {
                JOptionPane.showMessageDialog(null, "Mission completed", "Final", JOptionPane.CLOSED_OPTION);
            }
        }
    }

    //keyboard listener, it can move player
    class Forward_Key_listener implements KeyListener {

        int dx;
        int dy;

        Forward_Key_listener(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        public void keyReleased(KeyEvent event) {
        }

        public void keyPressed(KeyEvent event) {
            int key_code = event.getKeyCode();
            int px = player.getX();
            int py = player.getY();
            if(key_code == KeyEvent.VK_UP) {
                player.setLocation(px   , py-dy);
            } else if (key_code == KeyEvent.VK_DOWN) {
                player.setLocation(px   , py+dy);
            } else if (key_code == KeyEvent.VK_LEFT) {
                player.setLocation(px-dx, py);
            } else if (key_code == KeyEvent.VK_RIGHT) {
                player.setLocation(px+dx, py);
            } else {
                return;
            }
            Check();
        }

        public void keyTyped(KeyEvent event) {
        }
    }

    //button listener, it can move the player, too
    class Forward_listener implements ActionListener {

        int dx;
        int dy;

        Forward_listener(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }

        public void actionPerformed(ActionEvent event) {
            int px = player.getX();
            int py = player.getY();
            player.setLocation(px+dx, py+dy);
            Check();
        }
    }
}

