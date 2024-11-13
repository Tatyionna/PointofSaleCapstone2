package com.pluralsight;

import java.util.ArrayList;

public class Order {
   ArrayList<Products> items = new ArrayList<>();

   public static void OrderScreen() {
      System.out.printf("""
               Order Screen
               Please select from the following options:
               \t1. Add Sandwich
               \t2. Add Drink
               \t3. Add Chips
               \t4. Checkout
               \t5. Cancel Order
               \t0. Exit
               Enter choice:\s
              """);

   }
   public static void addSandwich() {
      System.out.println("Select your bread: ");

   }
}