package io.javalab.BuilderDesignPattern;

import java.time.LocalDate;

public class PizzaBuilder {

    private String size;
    private String toastedType;
    private String toppings;
    private double price;
    private LocalDate delivaryTime;

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setToastedType(String toastedType) {
        this.toastedType = toastedType;
        return this;
    }

    public PizzaBuilder setToppings(String toppings) {
        this.toppings = toppings;
        return this;
    }

    public PizzaBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public PizzaBuilder setDelivaryTime(LocalDate delivaryTime) {
        this.delivaryTime = delivaryTime;
        return this;
    }

    public Pizza getPizza(){
        return new Pizza(size,toastedType,toppings,price,delivaryTime);
    }
}
