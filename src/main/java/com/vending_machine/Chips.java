package com.vending_machine;

public class Chips extends Product {

    @Override
    public String productName() {
        return "chips";
    }

    @Override
    public int productPrice() {
        return 250;
    }

    @Override
    public String getDescription() {
        return "cheese flavoured chips";
    }
}
