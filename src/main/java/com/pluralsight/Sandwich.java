package com.pluralsight;

import java.util.List;

public class Sandwich extends Products {
    private int size;
    private String breadType;
    private List <Toppings> toppings;
    private boolean toasted;

    @Override
    public double getCost() {
        return 0;
    }
}
