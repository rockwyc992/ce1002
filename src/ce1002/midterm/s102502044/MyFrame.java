package ce1002.midterm.s102502044;

import java.awt.Color;

import javax.swing.*;

class MyFrame extends JFrame {

    protected MyPanel rectangle;
    protected MyPanel circle;
    protected Graph[] graph;

    //config Frame
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        let_s_draw_it();

        setSize(800, 600);
        setVisible(true);
    }

    //new all graph and panel
    void let_s_draw_it() {
        graph = new Graph[2];
        graph[0] = new Circle();
        graph[1] = new Rectangle();

        circle = new MyPanel(graph[0]);
        rectangle = new MyPanel(graph[1]);

        circle.setLocation(10, 10);
        rectangle.setLocation(410, 10);

        add(circle);
        add(rectangle);
    }
}
