package com.pluralsight;

public class Chips extends Product implements Priceable {
    private String type;


    public Chips(int size, String type) {
        super(size);
        this.type = type;
    }

    @Override
    public String printItem() {
        return "";   }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
