package ce1002.a7.s102502044;

import javax.swing.*;

class Hero {

    String name;
    double health_point;
    double  magic_point;
    double  power_point;
    ImageIcon image;

    //初始化所有能力點為30
    Hero() {
        health_point = magic_point = power_point = 30.0;
    }

    //getter
    double health_point() {
        return health_point;
    }

    double magic_point() {
        return magic_point;
    }

    double power_point() {
        return power_point;
    }

    ImageIcon image() {
        return image;
    }

    String name() {
        return name;
    }

    //setter
    void set_health_point(double health_point) {
        this.health_point = health_point;
    }

    void set_magic_point(double magic_point) {
        this.magic_point = magic_point;
    }

    void set_power_point(double power_point) {
        this.power_point = power_point;
    }

}

