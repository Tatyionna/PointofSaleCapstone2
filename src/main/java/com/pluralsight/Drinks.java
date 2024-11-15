package com.pluralsight;

public class Drinks extends Product implements Priceable {

    private String flavor;

    public Drinks(int size, String flavor) {
        super(size);
        this.flavor = flavor;

    }

    @Override
    public String printItem() {
        return "";
    }

    @Override
    public double getPrice() {
        double total = 0;
        switch (size) {
            case 1: total += 2.00;
            break;
            case 2: total += 2.50;
            break;
            case 3: total += 3.00;
            break;
            default:
                System.out.println("Invalid size. Defaulting to small.");
                total += 2.00;
                break;
        }
        return total;
    }
}
