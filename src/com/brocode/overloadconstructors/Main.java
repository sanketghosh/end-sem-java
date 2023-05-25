package com.brocode.overloadconstructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("Thick crust", "Tomato", "Mozzarella","Pepperoni");
        Pizza pizza2 = new Pizza("Thick crust", "Tomato", "Mozzarella");
        Pizza pizza3 = new Pizza("Thick crust", "Tomato");

        System.out.println(pizza2.topping); //null
        System.out.println(pizza.topping); // "Pepperoni"
        System.out.println(pizza3.cheese); //null
    }
}
