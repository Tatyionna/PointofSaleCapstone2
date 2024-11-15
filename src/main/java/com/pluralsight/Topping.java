package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Topping implements Priceable {
    private String name;
    private double price;

    @Override
    public double getPrice() {
        return 0;
    }

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//    public static List<Topping> addSelectedMeats(String[] selectedChoices) {
//        List<String> meatsList = Topping.getMeatOptions();
//        List<Topping> selectedMeats = new ArrayList<>();
//
//        for (String choice : selectedChoices) {
//            try {
//                int index = Integer.parseInt(choice.trim()) - 1;
//                if (index >= 0 && index < meatsList.size()) {
//                    selectedMeats.add(meatsList.get(index));
//                } else {
//                    System.out.println("Invalid selection: " + choice);
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input: " + choice);
//            }
//        }

//        return selectedMeats;
//    }

    public static List<String> getMeatOptions() {
        List<String> meats = new ArrayList<>();
        meats.add("\s(1) Steak\n");
        meats.add("(2) Ham\n");
        meats.add("(3) Salami\n");
        meats.add("(4) Roastbeef\n");
        meats.add("(5) Chicken\n");
        meats.add("(6) Bacon\n");
        meats.add("(7) None\n");
        return meats;
    }

    public static List<String> getToppingsOptions() {
        List<String> toppings = new ArrayList<>();
        toppings.add("lettuce");
        toppings.add("tomato");
        toppings.add("Onion");
        toppings.add("Peppers");
        toppings.add("Jalapenos");
        toppings.add("Cucumbers");
        toppings.add("Pickles");
        toppings.add("Guacamole");
        toppings.add("Mushrooms");
        return toppings;
    }

    public static List<String> getCheeseOptions() {
        List<String> cheese = new ArrayList<>();
        cheese.add("Monterey Jack");
        cheese.add("Provolone");
        cheese.add("Pepper Jack");
        cheese.add("Cheddar");
        return cheese;

    }
    public static List<String> geSauceOptions() {
        List<String> sauce = new ArrayList<>();
        sauce.add("SpecialSauce");
        sauce.add("Mayo");
        sauce.add("Ranch");
        sauce.add("Vinaigrette");
        return sauce;
    }
    public static List<String> geSideOptions() {
        List<String> sides = new ArrayList<>();
        sides.add("ColdCrunch");
        sides.add("Chocolate-Chip Cookie");
        return sides;
    }
}
