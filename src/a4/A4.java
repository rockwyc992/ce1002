package ce1002.a4.s102502044;

import java.util.*;

public class A4 {
    Scanner scanner;

    //讀入資訊，輸出列表
    public A4() {
        scanner = new Scanner(System.in);
        int size = cars_size();
        List<Car> cars = new_many(size); 
        show_status(cars);
    }

    //輸出所有車輛
    void show_status(List<Car> cars) {
        System.out.println("Output car status");
        for (Car car : cars){
            car_status(car);
        }
    }

    //輸出單一車輛
    void car_status(Car car) {
        System.out.println("Car brand is "            + car.getBrand()             + ".");
        System.out.println("Car name is "             + car.getName()              + ".");
        System.out.println("Car max speed is "        + car.getMaxSpeed()          + ".");
        System.out.println("Car fuel consumption is " + car.get_fuel_consumption() + ".");
        System.out.println("Car price is "            + car.get_price()            + ".");
        System.out.println("StartTurbo!");
        car.startTurbo();
        System.out.println("Turbo status is "         + car.isTurbo()              + ".");
        Boolean is_turbo = car.isTurbo();
        System.out.println("Current speed is "        + car.currentSpeed(is_turbo) + ".");
        System.out.println();
    }

    //宣告陣列
    List<Car> new_many(int size) {
        List<Car> cars = new ArrayList<Car>(size);
        for(int i=0 ; i<size ; i++) {
            Car car = new_car();
            cars.add(car);
        }
        return cars;
    }

    //宣告單一車輛
    Car new_car() {
        Car car = new Car();
        System.out.println("Input car's");
        System.out.print("Brand: ");
        String brand = scanner.next();
        car.setBrand(brand);
        System.out.print("Name: ");
        String name = scanner.next();
        car.setName(name);
        System.out.print("Max speed: ");
        float max_speed = scanner.nextFloat();
        car.setMaxSpeed(max_speed);
        System.out.print("Fuel consumption: ");
        float fuel_consumption = scanner.nextFloat();
        car.set_fuel_consumption(fuel_consumption);
        System.out.print("Price: ");
        float price = scanner.nextFloat();
        car.set_price(price);
        System.out.println();
        return car;
    }

    //讀入陣列大小
    int cars_size() {
        System.out.println("Please input the number of cars: "); 
        String input = scanner.next();
        while(!input.matches("^[1-9]\\d*$")) {
            System.out.println("Out of range!");
            System.out.println("Please input the number of cars: "); 
            input = scanner.next();
        }
        return Integer.parseInt(input);
    }

    public static void main(String[] argv) {
        new A4();
    }
}
