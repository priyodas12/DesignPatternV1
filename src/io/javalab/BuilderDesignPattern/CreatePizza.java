package io.javalab.BuilderDesignPattern;

import java.time.LocalDate;

public class CreatePizza {
    public static void main(String[] args) {

        //traditional way with new keyword.
        Pizza pizza1=new Pizza("Medium","Hand Toasted","Capsicum-Onion-Paneer",300.55, LocalDate.now());

        System.out.println(pizza1);

        Pizza pizza2=new PizzaBuilder().setSize("Large").setToppings("Chicken").setPrice(100).getPizza();

        System.out.println(pizza2);
    }
}
