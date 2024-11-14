package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Product implements Priceable {
    private String size;
    private String breadType;
    private List<String> toppings;
    private List <String> meat;
    private List <String> cheese;
    private List <String> sauces;
    private boolean toasted;


    public Sandwich(String size, String breadType, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = new ArrayList<>();
        this.meat = new ArrayList<>();
        this.cheese = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.toasted = toasted;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public List<String> getMeat() {
        return meat;
    }

    public void setMeat(List<String> meat) {
        this.meat = meat;
    }

    public List<String> getCheese() {
        return cheese;
    }

    public void setCheese(List<String> cheese) {
        this.cheese = cheese;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
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
                case "1":
                    total += 5.50;

                    //calculate the cost of the meats
//                if(this.meat.size() >= 1) {
//                    total += 1;
//
//                    for (int i = this.meat.size() - 1; i > 0; --i) {
//                        total += .50;
//                    }
//                }

//                    //calculate the cost of the cheeses
//                    if (this.cheese.size() >= 1) {
//                        total += .75;
//
//                        for (int i = this.cheese.size() - 1; i > 0; --i) {
//                            total += .30;
//                        }
//                    }
                    break;
                case "2":
                    total += 7;
                    //calculate the cost of the meats
//                    if (this.meat.size() >= 1) {
//                        total += 2;
//
//                        //for loop to calculate price of extra meat
//                        for (int i = this.meat.size() - 1; i > 0; --i) {
//                            total += 1;
//                        }
//                    }
//
//                    //calculate the cost of the cheeses
//                    if (this.cheese.size() >= 1) {
//                        total += 1.50;
//
//                        //for loop to calculate extra cheese
//                        for (int i = this.cheese.size() - 1; i > 0; --i) {
//                            total += .60;
//                        }
//                    }

                    break;
                case "3":
                    total += 8.50;
                    //calculate the cost of the meats
//                    if (this.meat.size() >= 1) {
//                        total += 3.00;
//
//                        //for loop to calculate price of extra meat
//                        for (int i = this.meat.size() - 1; i > 0; --i) {
//                            total += 1.50;
//                        }
//                    }
//
//                    //calculate the cost of the cheeses
//                    if (this.cheese.size() >= 1) {
//                        total += 2.25;
//
//                        //for loop to calculate extra cheese
//                        for (int i = this.cheese.size() - 1; i > 0; --i) {
//                            total += .90;
//                        }
//                    }
                    break;
            }

            return total;
        }




    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", breadType='" + breadType + '\'' +
                ", toppings=" + toppings +
                ", meat=" + meat +
                ", cheese=" + cheese +
                ", sauces=" + sauces +
                ", toasted=" + toasted +
                '}';
    }
}

