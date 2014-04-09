package ce1002.e4.s102502044;

import java.util.*;

class Dog extends Animal{

    Dog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Dog's sound: ");
        String sound = scanner.next();
        set_type("Dog");
        set_sound(sound);
    }

    void status() {
        System.out.println(type() + ": " + sound());
    }
}
