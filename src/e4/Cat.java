package ce1002.e4.s102502044;

import java.util.*;

class Cat extends Animal{

    Cat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Cat's sound: ");
        String sound = scanner.next();
        set_type("Cat");
        set_sound(sound);
    }

    void status() {
        System.out.println(type() + ": " + sound());
    }
}
