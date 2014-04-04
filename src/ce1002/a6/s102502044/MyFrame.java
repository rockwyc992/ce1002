package ce1002.a6.s102502044;

import java.awt.Color;

import javax.swing.*;

class MyFrame extends JFrame {

    MyFrame() {
        new_many_hero();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280, 750);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    void new_many_hero() {
        Hero hero = new Wizard();
        MyPanel panel = new MyPanel(hero, 5, 5, 270, 230);
        this.add(panel);

        hero = new Swordsman();
        panel = new MyPanel(hero, 5, 240, 270, 230);
        this.add(panel);

        hero = new Knight();
        panel = new MyPanel(hero, 5, 475, 270, 230);
        this.add(panel);
    }

}
