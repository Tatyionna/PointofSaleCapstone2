package com.pluralsight;

public class Drinks extends Product implements Priceable {

    private String flavor;
    private String size;

    public Drinks(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
    }

    @Override
    public String printItem() {
        return "";
    }

    @Override
    public double getPrice() {
        double total = 0;
        switch (size) {
            case "Small": total += 2.00;
            break;
            case "Medium": total += 2.50;
            break;
            case "Large": total += 3.00;
            break;
            default:
                System.out.println("Invalid size. Defaulting to Medium.");
                total += 2.50;
                break;
        }
        return total;
    }
}
