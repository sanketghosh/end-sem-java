package com.brocode.constructors;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Jax", 27, 86.5);
        Human human2 = new Human("Sarah", 22, 56.5);

        System.out.println(human1.name);
        human1.eat();
        human2.sleep();

    }
}
