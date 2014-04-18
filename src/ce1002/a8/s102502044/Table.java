package ce1002.a8.s102502044;

import javax.swing.*;
import java.util.*;

class Table extends JFrame {

    Table() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        
        //產生8個Student
        List<Student> students = Student.new_many(8);
        //產生4個Level
        List<Level> levels = Level.new_many(students);
        //for each level, add in Table
        for(Level level : levels) {
            add(level);
        }
        
        setSize(245, 200);
        setVisible(true);
    }
}
