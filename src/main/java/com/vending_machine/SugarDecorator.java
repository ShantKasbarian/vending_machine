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
        return 50;
    }

    @Override
    public String productDescription() {
        return " and sugar";
    }
}
