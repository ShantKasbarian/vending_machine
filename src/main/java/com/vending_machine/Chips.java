package com.vending_machine;

public class Chips implements Product {

    @Override
    public String productName() {
        return "chips";
    }

    @Override
    public int productPrice() {
        return 250;
    }

    @Override
    public String productDescription() {
        return "cheese flavoured chips";
    }
}
