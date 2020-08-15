package io.javalab.BuilderDesignPattern;

import java.time.LocalDate;

public class Pizza {

    private String size;
    private String toastedType;
    private String toppings;
    private double price;
    private LocalDate delivaryTime;

    public Pizza(String size, String toastedType, String toppings, double price, LocalDate delivaryTime) {
        this.size = size;
        this.toastedType = toastedType;
        this.toppings = toppings;
        this.price = price;
        this.delivaryTime = delivaryTime;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", toastedType='" + toastedType + '\'' +
                ", toppings='" + toppings + '\'' +
                ", price=" + price +
                ", delivaryTime=" + delivaryTime +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToastedType() {
        return toastedType;
    }

    public void setToastedType(String toastedType) {
        this.toastedType = toastedType;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDelivaryTime() {
        return delivaryTime;
    }

    public void setDelivaryTime(LocalDate delivaryTime) {
        this.delivaryTime = delivaryTime;
    }
}
