package ce1002.a14.s102502044;

import java.util.*;
import javax.swing.*;

class CarRace implements Runnable {

    List<Car> cars;
    float total_distance;

    //new cars, set distance
    CarRace() {
        cars = new ArrayList<Car>();
        total_distance = 5000;
    }

    //add a car
    public void add_car() {
        int amount = car_amount();
        Car car = new Car(amount);
        cars.add(car);
    }

    //thread run
    public void run() {
        for(Car car : cars) {
            car.distance = 0;
        }

        race_start();
    }

    //race start
    private void race_start() {
        while(true) {
            for(Car car : cars) {
                car.distance += car.random_speed();
                if(car.distance > total_distance) {
                    show_winner(car);
                    return ;
                }
            }
        }
    }

    //total cars amount
    public int car_amount() {
        return cars.size();
    }

    //show which car is winner
    public void show_winner(Car car) {
        JOptionPane.showMessageDialog(null, "The winner is "+car.get_name()+"!", "Race Finish", JOptionPane.ERROR_MESSAGE);
    }

}
