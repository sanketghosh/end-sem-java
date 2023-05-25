package com.brocode.interfaces;

public class Fish implements Prey, Predator {

    @Override
    public void flee() {
        System.out.println("The small fish is fleeing");
    }

    @Override
    public void hunt() {
        System.out.println("The big fish is hunting");
    }
}
