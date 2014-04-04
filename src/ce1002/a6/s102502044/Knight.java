package ce1002.a6.s102502044;

import javax.swing.*;

class Knight extends Hero {

    //姓名初始化
    Knight() {
        name = "Knight";
        image = new ImageIcon(name + ".jpg"); 
    }
    
    //getter override
    double health_point() {
        return health_point * 0.8;
    }

    double magic_point() {
        return magic_point * 0.1;
    }

    double power_point() {
        return power_point * 0.1;
    }

}

