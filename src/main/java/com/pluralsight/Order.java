package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
   private List<Product> products;
   private double totalPrice;

   public Order(List<Product> items, double totalPrice) {
      this.products = new ArrayList<>();
      this.totalPrice = totalPrice;
   }


   public static void addSandwich() {
      System.out.println("Select your bread: ");

   }
}