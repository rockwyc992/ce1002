package ce1002.a7.s102502044;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

class MyPanel extends JPanel {

    JLabel info;
    JLabel image;
    JPanel status;

    MyPanel(Hero hero, int x, int y, int width, int height) {
        setBounds(x, y, width, height);
        Border border = new LineBorder(Color.black, 5);
        setBorder(border); 

        setRoleState(hero);
        add(info);
        add(image);
        add(status);
    }

    //設定圖片與角色狀態
    public void setRoleState(Hero hero) {
        String title = hero.name();
        title += " HP:" + hero.health_point();
        title += " MP:" + hero.magic_point();
        title += " PP:" + hero.power_point();
        info = new JLabel(title);

        image = new JLabel(hero.image());

        status = new StatusPanel(hero);
    }

}
