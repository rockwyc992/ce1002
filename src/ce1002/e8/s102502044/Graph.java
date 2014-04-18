package ce1002.e8.s102502044;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.Color;
import java.util.*;

class Graph extends JPanel {

    JPanel image;
    JLabel name;
    JLabel info;

    Graph(JPanel image) {
        Border border = new LineBorder(Color.black, 5);
        setBorder(border); 
        setLayout(null);

        this.image = image;
        
        name = new JLabel();
        name.setBounds(10, 165, 200, 20);
        
        info = new JLabel();
        info.setBounds(10, 190, 200, 20);
        
        add(image);
        add(name);
        add(info);
    }

    static List<Graph> new_many() {
        List<Graph> graphs = new ArrayList<Graph>(3);
        Graph graph;
        JPanel image;

        image = new Rectangle();
        graph = new Graph(image);
        graph.name.setText("Graph: 長方形");
        graph.info.setText("Info : 為四個內角相等的四邊形");
        graph.setBounds(5, 5, 220, 250);
        graphs.add(graph);

        image = new Oval();
        graph = new Graph(image);
        graph.name.setText("Graph: 橢圓");
        graph.info.setText("Info : 平面上到兩個固定點的距離之和是常數的軌跡");
        graph.setBounds(230, 5, 220, 250);
        graphs.add(graph);

        image = new Polygon();
        graph = new Graph(image);
        graph.name.setText("Graph: 多邊形");
        graph.info.setText("Info : 平面的封閉、由有限線段（大於2）組成，且首尾相連的形狀");
        graph.setBounds(455, 5, 220, 250);
        graphs.add(graph);

        return graphs;
    }
}
