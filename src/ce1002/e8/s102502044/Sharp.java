package ce1002.e8.s102502044;

import javax.swing.*;
import java.util.*;

class Sharp extends JFrame {

    Sharp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(685, 300);
        setLayout(null);
        setLocationRelativeTo(null);

        List<Graph> graphs = Graph.new_many();

        for(Graph graph : graphs) {
            add(graph);
        }

        setVisible(true);
    }
}
