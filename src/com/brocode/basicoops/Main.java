package com.brocode.basicoops;

public class Main {
    public static void main(String[] args) {

        Car myCar1 = new Car();
        System.out.println(myCar1.price);

        Car myCar2 = new Car();
        System.out.println(myCar2.name);


        myCar2.brake();
    }
}
