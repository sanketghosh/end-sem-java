package com.brocode.interfaces;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }
}
