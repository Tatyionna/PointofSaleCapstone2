package com.pluralsight;

public abstract class Products {
    protected String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
  public abstract double getCost();
}
