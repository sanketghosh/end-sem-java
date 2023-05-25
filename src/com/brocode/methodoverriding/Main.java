package com.brocode.methodoverriding;

public class Main {
    public static void main(String[] args) {

        Doggo dog = new Doggo();
        dog.speaks();

        Animal animal = new Animal();
        animal.speaks();
    }
}
