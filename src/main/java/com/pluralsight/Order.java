package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {
   private List<Product> items;
   private double totalPrice;

   public void Order(List<Product> items, double totalPrice) {
      this.items = new ArrayList<>();
      this.totalPrice = totalPrice;
   }
 public void addItemsToOrder(Product product) {
     this.items.add(product);

 }
      public double calculateTotalPrice() {
          double totalPrice = 0;
          for(Product product: items){
              totalPrice += product.getPrice();
          }
          return totalPrice;
     }
}
