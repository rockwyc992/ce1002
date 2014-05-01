package ce1002.midterm.s102502044;

import java.awt.*;
import javax.swing.*;

class MyPanel extends JPanel {

    Graph graph;

    //set size and graph
    MyPanel(Graph graph) {
        this.graph = graph;
        setSize(380, 580);
    }

    //draw the graph
    public void paintComponent(Graphics g) {
        graph.drawGraph(g);
    }
}
