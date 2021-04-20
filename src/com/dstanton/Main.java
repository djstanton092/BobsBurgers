package com.dstanton;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        ArrayList<Addition> additions = new ArrayList<Addition>();
//
//        additions.add(new Addition("lettuce", 0.25f));
//        additions.add(new Addition("tomato", 0.50f));
//        additions.add(new Addition("carrot", 0.75f));
//
//        for (Addition x: additions) {
//            System.out.println(x.name);
//            System.out.println(x.price);
//        }
//
//        System.out.println("additions.size() = " + additions.size());

        Burger burger = new Burger("Base Burger", "White bun", "bison", 2.50f );

        burger.addAddition("lettuce", 0.25f);
        burger.addAddition("tomato", 0.25f);
        burger.addAddition("onions", 0.25f);
        burger.addAddition("pickles", 0.25f);
        burger.addAddition("carrots", 0.25f);
        burger.printReceipt();
        System.out.println("");

        Healthy healthy = new Healthy("Horse", 1.00f);
        System.out.println("");
        healthy.addAddition("addition1", 0.01f);
        healthy.addAddition("addition2", 0.01f);
        healthy.addAddition("addition3", 0.01f);
        healthy.addAddition("addition4", 0.01f);
        healthy.addAddition("addition5", 0.01f);
        healthy.addAddition("addition6", 0.01f);
        healthy.addAddition("addition7", 0.01f);
        System.out.println("");
        healthy.printReceipt();
        System.out.println("");

//        Deluxe deluxe = new Deluxe("Deluxe Burger", "Sourdough", "chicken", 5.00f );
//        deluxe.addAddition(new Addition("addition1", 0.01f));
//        deluxe.printReceipt();

    }
}


