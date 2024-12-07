package com.vending_machine;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String productName() {
        return "milk";
    }

    @Override
    public int productPrice() {
        return 50;
    }

    @Override
    public String productDescription() {
        return " and milk";
    }
}
