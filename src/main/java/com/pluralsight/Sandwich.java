package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product implements Priceable {
    private String breadType;
    private boolean toasted;
    private List<Topping> toppings;
    private List<String> meats;


    public Sandwich(int size, String breadType, boolean toasted) {
        super(size);
        this.breadType = breadType;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
        this.meats = new ArrayList<>();
    }
    public void setMeats(List<String> meats) {
        this.meats = meats;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateToppingsPrice() {
        double total = 0;
        for (Topping topping : toppings) {
            total += topping.getPrice(); // Call getPrice() from Topping which implements Priceable
        }
        return total;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }


    @Override
    public String printItem() {
        return "";
    }

    @Override
    public double getPrice() {

        double total = 0;
        //get the size of the sandwich

        switch (size) {
                case 1: total += 5.50;
                    total += meats.isEmpty() ? 0 : 1.00 + (meats.size() - 1) * 0.50;

                break;

                case 2: total += 7;
                    total += meats.isEmpty() ? 0 : 2.00 + (meats.size() - 1) * 1.00;

                break;
                case 3: total += 8.50;
                    total += meats.isEmpty() ? 0 : 3.00 + (meats.size() - 1) * 1.50;
                break;
                default:
                    System.out.println("Invalid size selected.");
                    return 0;
           }

                // Add price for each topping
                for (Topping topping : toppings) {
                    total += topping.getPrice();
                }


                return total;
        }

        @Override
        public String toString () {
            return "Sandwich[" +
                    "size=" + size + '\'' +
                    ", breadType=" + breadType + '\'' +
                    ", toasted=" + toasted +
                    ", toppings=" + toppings +
                    ']';
        }
    }

