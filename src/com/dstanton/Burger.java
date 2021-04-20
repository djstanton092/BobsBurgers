package com.dstanton;

import java.util.ArrayList;

public class Burger {
    private String name;
    private String roll;
    private String meat;
    private double price;
    ArrayList<Addition> additions = new ArrayList<Addition>();
    protected int maxAdditions;

    public Burger (String name, String roll, String meat, double price) {
        this.name = name;
        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.maxAdditions = 4;
    }


    public void addAddition(String name, double price) {


        if (additions.size() < this.maxAdditions) {
            additions.add(new Addition(name,price));
            System.out.printf("Adding %s at %.2f%n", name, price);
        } else {
            System.out.println("Already at max number of additions");
        }
    }

    public void printReceipt() {
        float total = 0;
        //System.out.println(this.getClass().getSimpleName() +" -> printReceipt");
        //System.out.println("Base Price = " + this.price);
        System.out.println("RECEIPT");
        System.out.printf("Base Price = %.2f%n", this.price);
        total += this.price;

        for (Addition x: additions) {
            total += x.price;
            //System.out.println("Addon " + x.name + " price " + x.price);
            System.out.printf("Add %s %.2f%n", x.name, x.price);
        }
        System.out.println("Total " + total);
    }

}
