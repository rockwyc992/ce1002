package ce1002.a3.s102502044;

import java.util.*;

public class A3 {

    Scanner scanner;

    //設定cars的數量
    int cars_size() {
        System.out.println("Please input the number of cars: ");
        String input = scanner.nextLine();
        while(!input.matches("^[1-9]\\d*$")) {
            System.out.println("Out of range!");
            System.out.println("Please input the number of cars: ");
            input = scanner.nextLine();
        }
        return Integer.parseInt(input);
    }

    //輸出所有車子
    void show_cars_status(List<Car> cars) {
        for (Car it : cars) {
            it.status();
        }
    }

    //宣告，輸出
    public A3() {
        scanner = new Scanner(System.in);//init scanner
        int size = cars_size();
        List<Car> cars = Car.new_many(size);//init cars
        System.out.println("Output car status.");
        show_cars_status(cars); // show all status of cars
    }

    public static void main(String[] argv) {
        new A3();
    }
}

