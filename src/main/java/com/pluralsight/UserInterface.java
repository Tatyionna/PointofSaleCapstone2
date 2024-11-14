package com.pluralsight;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
//    static final String[] meats = {"steak","chicken","bacon"};






    private Order userOrder;

    //Start application, display Home-screen
    static Scanner scan = new Scanner(System.in);

    public static void display() {
        while (true) {
            displayHomeScreen();
            int userOptions = scan.nextInt();

            switch (userOptions) {
                case 1:
                    addToOrder();
                    break;
                case 0:
                    System.out.println("Thank you for visiting, see you again soon! 😊");
                    scan.close(); // Close the scanner before exiting
                    return; // Exit the loop
            }


        }
    }
    






    public static void displayHomeScreen () {
        System.out.println("""
                 
                 Welcome to Taystee's  Sandwich Shop!🥪🌯🥖🥗
                 Please select from the following choices:
                 \t1. New Order
                 \t0. Exit
                 Enter choice:""");

    }
    public static void OrderScreen() {
        System.out.println("""
               Order Screen
               Please select from the following options:
               \t1. Add Sandwich
               \t2. Add Drink
               \t3. Add Chips
               \t4. Checkout
               \t5. Cancel Order
               \t0. Exit
               Enter choice:
              """);
    }

    public static void addToOrder() {
        //method to create a new order

        boolean isOrdering = true;

        while(isOrdering) {
            OrderScreen();
            int orderInput = scan.nextInt();
            switch (orderInput) {
                case 1:
                    // method to add Sandwich
                    addSandwich();
                    break;
                case 2:
                    //method to add drink
                case 3:
                    //method to add chips
                case 4:
                    //method to save order to receipt
                case 5:
                    isOrdering = false;
            }

        }


    }


    private static void addSandwich(){
        //initialized Scanner again because it wasn't accepting userinputs, I could parse all inputs to get rid of this
        scan = new Scanner(System.in);
        /* ask user what size they want
        display the sizes */
        System.out.println("""
                Select sandwich size:
                (1) small
                (2) medium
                (3) Large """);


        String size = scan.nextLine().trim();
        System.out.println("Size entered: " + size);

        //ask user bread type
        System.out.printf("""
                which bread would you like?:
                (1) White
                (2) Wheat
                (3) Rye
                (4) Wrap\n""");


        String breadType = scan.nextLine().trim();

        System.out.printf("Would you like your sandwich toasted? Yes or No?");
        String toastedInput = scan.nextLine();
        //turns the String into a boolean and sets yes to true
        boolean isToasted = toastedInput.equalsIgnoreCase("yes");

        // now create a sandwich object that already has size,breadtype, and toasted status

        Sandwich sandwich = new Sandwich(size,breadType,isToasted);

        // ask user what meat
        // display meat to user

        System.out.printf("""
                What Meats would you like? (note:It is an upcharge for more than one)
                (1) Steak
                (2) Chicken
                (3) Bacon
                """);
//        displayMeats();
//
//        String[] selectedMeats = scan.nextLine().split(",");
//        sandwich.setMeat(addMeatsToSandwich(selectedMeats));


        System.out.println("Your Sandwich Total is: $"+ sandwich.getPrice());


        // what cheese

        // do the same thing u did for meats



    }


//    static void displayMeats(){
//
//        System.out.println("select meat. if u want more than 1 separate by commas");
//
//        for(int i = 0; i< meats.length;i++){
//            System.out.println(i+1 + ")" + meats[i]);
//        }
//    }
//
//
//    static ArrayList<String> addMeatsToSandwich(String[] selected){
//        ArrayList<String> meatsCopy = new ArrayList<>();
//        for(String selection: selected){
//            String meat = meats[Integer.parseInt(selection)-1];
//            meatsCopy.add(meat);
//        }
//        return meatsCopy;
//
//    }
}

