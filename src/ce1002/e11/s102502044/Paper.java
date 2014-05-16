package ce1002.e11.s102502044;

import javax.swing.*;

class Paper extends JFrame {

    JPanel graphs;

    Paper() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("E11-102502044");

        graphs = new Graphs();
        add(graphs);

        setSize(300, 300);
        setVisible(true);
    }

}
