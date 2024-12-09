package com.vending_machine;

public class Coffee extends Product {
    public Coffee() {
        this.setDescription("black coffee made by our finest coffee beans");
    }

    @Override
    public String productName() {
        return "black coffee";
    }

    @Override
    public int productPrice() {
        return 100;
    }
}
