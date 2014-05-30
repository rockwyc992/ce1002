package ce1002.q2.s102502044;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends JFrame {

    MyPanel paper;
    JTextField which_graph;
    JButton change_blue;
    JButton change_red;
    JLabel graph_text;

    //設定Frame
    MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Q2-102502044");
     
        new_all_member();

        setSize(400, 400);
        setVisible(true);
    }

    void new_all_member() {
        //畫圖的panel
        paper = new MyPanel();
        paper.setBounds(80, 50, 200, 200);
        MouseListener mouse_listener = new Mouse_listener();
        paper.addMouseListener(mouse_listener);
        add(paper);

        //輸入形狀
        which_graph = new JTextField();
        which_graph.setBounds(60, 10, 200, 20);
        add(which_graph);

        //藍色按鈕
        change_blue = new JButton("Blue");
        change_blue.setBounds(10, 80, 60, 20);
        ActionListener change_color = new Change_color(Color.blue);
        change_blue.addActionListener(change_color);
        add(change_blue);

        //紅色按鈕
        change_red = new JButton("Red");
        change_red.setBounds(10, 50, 60, 20);
        change_color = new Change_color(Color.red);
        change_red.addActionListener(change_color);
        add(change_red);

        //毫無反應，只是個Label
        graph_text = new JLabel("Graph :");
        graph_text.setBounds(10, 10, 50, 20);
        add(graph_text);
    }

    //拉圖案
    class Mouse_listener implements MouseListener {

        public void mousePressed(MouseEvent event) {
            if(event.getButton() == event.BUTTON1) {
                paper.lock();
            }
        }

        public void mouseExited(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
            if(event.getButton() == event.BUTTON1) {
                paper.unlock();
            }
        }

        public void mouseClicked(MouseEvent event) {
        }
    }

    //按下按鈕換顏色
    class Change_color implements ActionListener {

        Color color;
        String graph_text;

        Change_color(Color color) {
            this.color = color;
        }

        public void actionPerformed(ActionEvent event) {
            graph_text = MyFrame.this.which_graph.getText();
            paper.set_graph_text(graph_text);
            paper.set_graph_color(color);
            paper.repaint();

            if(graph_text.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Graph name can't be empty!", "Q2", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
