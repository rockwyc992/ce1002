package ce1002.a5.s102502044;

import java.util.*;

class Hero {

    String name;
    double health_point;
    double  magic_point;
    double  power_point;

    //初始化所有能力點為30
    Hero() {
        health_point = magic_point = power_point = 30.0;
    }

    //輸出，控碼hack
    void status() {
        System.out.println( name + " HP:" + health_point() + " MP:" + magic_point() + " PP:" + power_point());
    }

    //宣告陣列
    static List<Hero> new_many() {
        List<Hero> heros = new ArrayList<Hero>(3);

        Hero wizard = new Wizard();
        heros.add(wizard);
        
        Hero swordsman = new Swordsman();
        heros.add(swordsman);
        
        Hero knight = new Knight();
        heros.add(knight);
        
        return heros;
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

