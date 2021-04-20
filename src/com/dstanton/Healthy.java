package com.dstanton;

public class Healthy extends Burger{
    public Healthy(String meat, float price) {

        super("Healthy Burger", "brown rye bread roll", meat, price);

        super.maxAdditions = 6;

    }
}
