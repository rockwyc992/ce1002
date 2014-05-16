package ce1002.a11.s102502044;

import java.io.*;
import javax.swing.*;
import java.awt.event.*;

class Decoder extends JFrame {

    JButton decrypt;
    JTextField key;
    JLabel result;
    ActionListener decode_listener;

    Decoder() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("A11-102502044");

        new_all_member();

        setSize(450, 300);
        setVisible(true);
    }

    void new_all_member() {
        decode_listener = new Decode_listener();

        decrypt = new JButton("Decrypt");
        decrypt.addActionListener(decode_listener);
        decrypt.setBounds(360, 5, 80, 30);
        add(decrypt);

        key = new JTextField(10);
        key.setBounds(5, 5, 350, 30);
        add(key);

        result = new JLabel("Result will be shown here.");
        result.setBounds(5, 40, 435, 215);
        add(result);
    }

    class Decode_listener implements ActionListener {

        String key;
        String content;

        Decode_listener() {
        }

        public void actionPerformed(ActionEvent e) {
            key = Decoder.this.key.getText();

            if(key.isEmpty()) {
                show_error_message("Can't be empty!!");
            } else if(key.matches("^[1-9]$")) {
                content = read_file("A11.txt");
                String str = "";
                int key_value = Integer.parseInt(key);
                for(char c : content.toCharArray()) {
                    str += (char)(c - key_value);
                }
                result.setText(str);
            } else {
                show_error_message("Out Of Range!");
            }
        }

        String read_file(String filename) {
            String content = "";
            try {
                FileReader file = new FileReader("A11.txt");
                BufferedReader input = new BufferedReader(file);
                while (input.ready()) {
                    content += input.readLine() + "\n";
                }
            } catch (IOException event) {
                event.printStackTrace();
            }
            return content;
        }

        void show_error_message(String massage) {
            JOptionPane.showMessageDialog(null, massage, "A10", JOptionPane.ERROR_MESSAGE);
        }
    }
}
