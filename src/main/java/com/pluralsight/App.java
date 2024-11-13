package com.pluralsight;

public class App {
    public static void main(String[] args) {
        displayHomeScreen();
        Order.OrderScreen();

    }
    public static void displayHomeScreen () {
        System.out.printf("""
                 
                 Welcome to Taystee's  Sandwich Shop!
                 Please select from the following choices:
                 \t1. New Order
                 \t0. Exit
                 Enter choice:
                 
                """);

    }
}
