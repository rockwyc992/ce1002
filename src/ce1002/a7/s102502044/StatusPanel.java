package ce1002.a7.s102502044;

import java.awt.*;
import javax.swing.*;

class StatusPanel extends JPanel{

    JLabel[] name;
    JLabel[] value;

    StatusPanel(Hero hero) {
        setSize(200, 200);
        setLayout(new GridLayout(3, 2, 50, 50));
        setState(hero);

        for(int i=0 ; i<3 ; i++) {
            //name[i].setSize(50,50);  
            add(name[i]);
            add(value[i]);
        }
    }

    public void setState(Hero hero) {
        name = new JLabel[3];
        name[0]  = new JLabel("HP");
        name[1]  = new JLabel("MP");
        name[2]  = new JLabel("PP");
        value    = new JLabel[3];
        value[0] = new JLabel("" + hero.health_point());
        value[1] = new JLabel("" + hero.magic_point);
        value[2] = new JLabel("" + hero.power_point());
    }
}
