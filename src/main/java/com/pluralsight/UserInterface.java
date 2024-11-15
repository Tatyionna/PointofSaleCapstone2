package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    static final String[] meats = {"Steak","Ham","Salami","Roastbeef","Chicken","Bacon"};


    private Order userOrder;

    //Start application, display Home-screen
    Scanner scan = new Scanner(System.in);


    public void display() {
       do {
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
       }while (false);
    }



    public void addToOrder() {
        //method to create a new order

        boolean isOrdering = true;

        while (isOrdering) {
            OrderScreen();
            int orderInput = scan.nextInt();
            switch (orderInput) {
                case 1:
                    // method to add Sandwich
                    addSandwichToOrder();
                    break;
                case 2:
                    addDrinkToOrder();
                    break;
                case 3:
                    addChipsToOrder();
                    break;
                case 4:
                    checkOutMethod();
                    break;
                case 5:
                    isOrdering = false;
            }

        }


    }


    private void addSandwichToOrder() {
        //initialized Scanner again because it wasn't accepting userinputs, I could parse all inputs to get rid of this
        scan = new Scanner(System.in);
        /* ask user what size they want
        display the sizes */
        System.out.println("""
                Select sandwich size:
                (1) Small
                (2) Medium
                (3) Large """);


        String sizeInput = scan.nextLine().trim();
        int size = Integer.parseInt(sizeInput); // Convert size to int


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
                                
                What Meats would you like? (note:It is an upcharge for more than one\n Please seperate meat choices by comma. Example: 1,2,6)
                Here's what we have:
                """);
        for(int i = 0; i< meats.length;i++){
            System.out.println(i+1 + ")" + meats[i]);
        }


        //Print out the list of meats
//        System.out.println(Arrays.toString(meats));


        String meatInput = scan.nextLine().trim();
        String[] meatChoices = meatInput.split(",");

        // Create a new ArrayList to hold the meats that the user chooses. Split the input by commas and map the choices to meat options
        List<String> selectedMeats = addMeatsToSandwich(meatChoices);
        sandwich.setMeats(selectedMeats);


//

        System.out.println(sandwich.toString());
        System.out.println("Your Sandwich Total is: $" + sandwich.getPrice());
    }


    //This method takes an array of strings and

    //It converts these numbers into the actual meat names from the meats array and returns a list of the selected meats.
    static ArrayList<String> addMeatsToSandwich(String[] selected){
        ArrayList<String> meatsPicked = new ArrayList<>();
        for(String selection: selected){
            String meat = meats[Integer.parseInt(selection)-1];
            meatsPicked.add(meat);
        }
        return meatsPicked;

    }

    public void addDrinkToOrder () {
        System.out.print("""
                What drink size would you like?
                (1) Small  
                (2) Medium  
                (3) Large
                Enter your choice: \n
                """);
        int size = scan.nextInt();
        scan.nextLine();

        System.out.print("""
                What flavor would you like? 
                (1) Sundrop  
                (2) Fanta 
                Enter your choice: \n
                """);

        String flavor = scan.nextLine().trim();


        userOrder = new Order(); // Ensure userOrder is initialized
        userOrder.addItemsToOrder(new Drinks(size,flavor));
    }
    public void addChipsToOrder () {
        System.out.print("""
                What chip flavor would you like? (note: all chips are a $1.50)
                (1) Doritos  
                (2) Lays Original 
                Enter your choice: \n
                """);
        String chipSize = "default";
        int chipType = scan.nextInt();
        userOrder.addItemsToOrder(new Chips(chipType, chipSize));
    }
    public void checkOutMethod () {
        System.out.println(userOrder.calculateTotalPrice());
    }
    public void displayHomeScreen() {
        System.out.println("""
                                 
                Welcome to Taystee's  Sandwich Shop!🥪🌯🥖🥗
                Please select from the following choices:
                \t1. New Order
                \t0. Exit
                Enter choice:""");

    }

    public void OrderScreen() {
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
    }



