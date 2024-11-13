package com.pluralsight;

public class Toppings {
    protected String name;
    protected double price;
    protected String type;

    public Toppings(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public double getPrice () {
        return 0;
    }
}
