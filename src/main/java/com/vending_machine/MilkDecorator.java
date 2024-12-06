package com.vending_machine;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String productName() {
        return this.name() + " milk";
    }

    @Override
    public int productPrice() {
        return this.price() + 50;
    }

    @Override
    public String productDescription() {
        return this.description() + " and milk";
    }
}
