package com.pluralsight;

public abstract class Product implements Priceable{
  public int size;

  public Product(int size) {
    this.size = size;
  }

  public abstract String printItem();
}
