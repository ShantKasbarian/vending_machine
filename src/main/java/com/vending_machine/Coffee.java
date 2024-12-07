package com.vending_machine;

import java.util.List;

public class Coffee implements Product {
    private List<CoffeeDecorator> toppings;

    public Coffee(List<CoffeeDecorator> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String productName() {
        return "black coffee";
    }

    @Override
    public int productPrice() {
        return 100;
    }

    @Override
    public String productDescription() {
        return "black coffee made by our finest coffee beans";
    }

    public void removeTopping(CoffeeDecorator coffeeDecorator) {
        toppings.remove(coffeeDecorator);
    }

    public void addTopping(CoffeeDecorator coffeeDecorator) {
        toppings.add(coffeeDecorator);
    }

    public List<CoffeeDecorator> getToppings() {
        return toppings;
    }

    public void setToppings(List<CoffeeDecorator> toppings) {
        this.toppings = toppings;
    }
}
