package ce1002.a3.s102502044;

import java.util.*;

public class Car {

    private int id;// 賽車id
    private float maxSpeed;// 最高速
    private boolean isTurbo;// 有無渦輪
    Scanner scanner;

    //建構子
    Car(int id) {
        scanner = new Scanner(System.in);
        this.id = id;//id初始化
        this.maxSpeed = get_max_speed();
        this.isTurbo = true;
    }

    //new 一個car陣列，並且放入id
    static List<Car> new_many(int size) {
        List<Car> cars = new ArrayList<Car>(size);
        for(int i=0 ; i<size ; i++) {
            Car car = new Car(i);
            cars.add(car);
        }
        return cars;
    }

    //取出id
    int id() {
        return id;
    }

    //取出maxSpeed
    float max_speed() {
        return maxSpeed;
    }

    //取出isTurbo
    boolean is_turbo() {
        return isTurbo;
    }

    //設定maxSpeed
    void set_max_speed(float value) {
        maxSpeed = value;
    }

    //設定isTurbo
    void set_is_turbo(boolean value) {
        isTurbo = value;
    }

    void status() {
        System.out.println("Car id is "		   + id()		 + ".");
        System.out.println("Car max speed is " + max_speed() + ".");
        System.out.println("Car turbo is "	   + is_turbo()	 + ".");
    }

    float get_max_speed() {
        System.out.println("Please input the max speed of this car(" + id() + "): ");
        String input = scanner.nextLine();
        while(input.matches("^([1-9]\\d*(\\.\\d+)?|0\\.\\d+)$")) {
            System.out.println("Out of range!");
            System.out.println("Please input the max speed of this car(" + id() + "): ");
            input = scanner.nextLine();
        }
        return Float.parseFloat(input);
    }
}
