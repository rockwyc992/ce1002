package ce1002.e7.s102502044;

import javax.swing.*;

class MyFrame extends JFrame{

    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        JPanel panel = new MyPanel();
        add(panel);
        
        setSize(500, 540);
        setVisible(true);
    }
}
