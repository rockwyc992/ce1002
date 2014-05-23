package ce1002.a12.s102502044;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;

class Wall extends JFrame {

    List<JButton> cells = new ArrayList<JButton>();

    //config this frame
    Wall() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("A12-102502044");
        setSize(800, 600);

        KeyListener listener = new Key_listener();
        addKeyListener(listener);

        setVisible(true);
    }

    //if typed new a buttom
    class Key_listener implements KeyListener {

        public void keyPressed(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
            JButton cell = new Moving_cell(getHeight(), getWidth());
            cells.add(cell);
            add(cell);

            Thread thread = new Thread((Runnable)cell);
            thread.start();
        }
    }
}
