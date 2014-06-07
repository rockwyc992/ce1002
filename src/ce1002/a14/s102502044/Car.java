package ce1002.a14.s102502044;

import java.util.Random;

class Car {

    public int id;
    public float distance;

    //set id
    Car(int id) {
        this.id = id;
    }

    //get a random integer is match r"100|([1-9]?[0-9])"
    public float random_speed() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    //get name string
    public String get_name() {
        return "Car no." + id;
    }
}
