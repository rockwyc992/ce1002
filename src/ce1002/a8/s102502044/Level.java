package ce1002.a8.s102502044;

import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.util.*;

class Level extends JPanel {

    JPanel rect_up;
    JPanel rect_down;
    JLabel text;
    JLabel number;

    String name;
    double persent;

    //getter
    String name() {
        return name;
    }

    double persent() {
        return persent;
    }
    
    //設定name, persent，new rect_{up,down}, text, number
    //並且add 進Level
    Level(String name, double persent) {
        setLayout(null);
        this.name = name;
        this.persent = persent;

        new_rect();
        text = new JLabel(this.name);
        text.setBounds(0, 90, 50, 20);
        number = new JLabel(persent + "%");
        number.setBounds(0,110, 50, 20);

        add(rect_up);
        add(rect_down);
        add(text);
        add(number);
    }

    //計算每個Student屬於哪個Level
    //new 4個Level，並加入ArrayList
    static List<Level> new_many(List<Student> students) {
        List<Level> levels = new ArrayList<Level>(4);
        double[] count = new double[4];
        for(Student student : students) {
            int grade = student.grade;
            int which = 0;
            if(grade > 75) {
                which = 3;
            }else if(grade > 50) {
                which = 2;
            }else if(grade > 25) {
                which = 1;
            }
            count[which] += 12.5;
        }
        for(int i=0 ; i<4 ; i++)
        {
            Level level = new Level("Level " + i, count[i]);
            level.setBounds(i*55+5, 5, 50, 150);
            levels.add(level);
            System.out.println(level.name() + " is " + level.persent() + "%");
        }
        return levels;
    }

    //產生上下兩個Panel表示長條圖
    void new_rect() {
        rect_up = new JPanel();
        rect_up.setBackground(Color.gray);
        rect_up.setBounds(10, 0, 30, 80 - (int)(0.8 * persent));
        System.out.println(0.8*persent);

        rect_down = new JPanel();
        rect_down.setBackground(Color.red);
        rect_down.setBounds(10, 0, 30, 80);
    }
}
