package com.pluralsight;

public class Chips extends Product implements Priceable {
    private String type;
    private double price = 1.50;

    public Chips(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String printItem() {
        return "";   }

    @Override
    public double getPrice() {
        return price;
    }
}
