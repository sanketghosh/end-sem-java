package com.brocode.inheritance;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.go();
        System.out.println(car.speed);
        System.out.println(car.wheels);
        car.stop();


        Bicycle bicycle = new Bicycle();
        bicycle.go();
        bicycle.stop();
        System.out.println(bicycle.wheels);
        System.out.println(bicycle.pedals);
    }
}
