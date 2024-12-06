package com.vending_machine;

public abstract class CoffeeDecorator implements Product {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String name() {
        return coffee.productName();
    }

    public int price() {
        return coffee.productPrice();
    }

    public String description() {
        return coffee.productDescription();
    }
}
