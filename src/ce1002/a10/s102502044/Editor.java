package ce1002.a10.s102502044;

import java.io.*;
import java.awt.event.*;
import javax.swing.*;

class Editor extends JFrame {

    JButton save;
    JTextField filename;
    JTextArea message;

    //configure
    Editor() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("A10-102502044");
     
        new_all_member();

        setSize(450, 300);
        setVisible(true);
    }

    //new all member
    void new_all_member() {
        save = new JButton("Save");
        save.setBounds(5,5,75,30);
        ActionListener saving = new Saving();
        save.addActionListener(saving);
        add(save);

        filename = new JTextField();
        filename.setBounds(85, 5, 355, 30);
        filename.setColumns(10);
        add(filename);

        message = new JTextArea();
        message.setBounds(5, 40, 435, 215);
        message.setLineWrap(true);
        add(message);
    }
    
    //button的listener
    class Saving implements ActionListener {

        JFrame frame;
        String name;
        String content;

        Saving() {
        }

        //button的function
        public void actionPerformed(ActionEvent event) {
            name = filename.getText();
            content = message.getText();
            if(name.isEmpty()) {
                show_empty();
            } else {
                name += ".txt";;
                save_into_file();
                show_save_success();
            }
        }

        //存檔
        void save_into_file() {
            try {
                FileWriter fout = new FileWriter(name);
                fout.write(content);
                fout.flush();
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        //跳出empty的視窗
        void show_empty() {
             JOptionPane.showMessageDialog(null, "File name can't be empty!", "A10", JOptionPane.ERROR_MESSAGE);
        }

        //跳出success的視窗 
        void show_save_success() {
             JOptionPane.showMessageDialog(null, "File " + name + " saved!", "A10", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
