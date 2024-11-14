package com.pluralsight;

import java.io.IOException;
import java.util.Scanner;

public class UserInterface {
    private Order userOrder;

    //Start application, display Home-screen
    static Scanner scan = new Scanner(System.in);

    public static void display() {
        while (true) {
            displayHomeScreen();
            int userOptions = scan.nextInt();

            switch (userOptions) {
                case 1:
                    addOrder();
                    break;
                case 0:
                    System.out.println("Thank you for visiting, see you again soon! 😊");
                    scan.close(); // Close the scanner before exiting
                    return; // Exit the loop
            }


        }
    }
    






    public static void displayHomeScreen () {
        System.out.printf("""
                 
                 Welcome to Taystee's  Sandwich Shop!🥪🌯🥖🥗
                 Please select from the following choices:
                 \t1. New Order
                 \t0. Exit
                 Enter choice:
                 
                """);

    }
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

    public static void addOrder() {
        //method to create a new order
        OrderScreen();
        int orderInput = scan.nextInt();
        switch (orderInput) {
            case 1:
                System.out.println("What size sandwich would you like?");


        }


    }
}

