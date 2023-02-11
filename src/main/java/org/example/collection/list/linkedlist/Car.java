package org.example.collection.list.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Car {
    String model;

    public Car(String model) {
        this.model = model;
    }
    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Veyron");
        Car lambo = new Car("Lamborghini Diablo");
        Car ford = new Car("Ford Mondeo");
        Car fiat = new Car("Fiat Ducato");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(lambo);
        System.out.println(cars);

        cars.addFirst(ford);
        cars.addLast(fiat);
        System.out.println(cars);

        System.out.println("===peeks===");
        System.out.println(cars.peekFirst());
        System.out.println(cars.peekLast());
        System.out.println("===poolls===");
        System.out.println(cars.pollFirst());
        System.out.println(cars.pollLast());
        System.out.println(cars);
        System.out.println("===to Array===");
        Car[] cars1 = cars.toArray(new Car[3]);
        System.out.println(Arrays.toString(cars1));
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

}
