package io.javalab.BuilderDesignPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Pizza pizza= new Pizza.PizzaBuilder().setAvl(true).setSize(10).setType("veg").setVendor("dominoz").build();
        System.out.println(pizza);
    }
}
