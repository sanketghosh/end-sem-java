package com.brocode.methodoverriding;

public class Doggo extends Animal {

    @Override
    void speaks() {
        System.out.println("The dog goes *BARK*");
    }
}
