package com.vending_machine;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String productName() {
        return "sugar";
    }

    @Override
    public int productPrice() {
        return this.price() + 50;
    }

    @Override
    public String productDescription() {
        return this.description() + " and sugar";
    }
}
