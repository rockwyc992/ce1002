package ce1002.a5.s102502044;

import java.util.*;

public class A5 {

    //宣告陣列，輸出所有的hero
    A5() {
        List<Hero> heros = Hero.new_many();
        show_status(heros);
    }

    //輸出
    void show_status(List<Hero> heros) {
        for(Hero hero : heros) {
            hero.status();
        }
    }

    public static void main (String[] argv) {
        new A5();
    }
}
