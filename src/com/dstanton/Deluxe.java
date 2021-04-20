package com.dstanton;

public class Deluxe extends Burger{
    public Deluxe(String name, String roll, String meat, float price) {
        super(name, roll, meat, price);
        this.maxAdditions = 2;
        this.addAddition("DLX chips", 0.05f);
        this.addAddition("DLX drink", 0.05f);
    }
}
