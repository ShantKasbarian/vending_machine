package com.vending_machine;

public class BeverageMachine extends VendingMachine {
    private ServeToppings serveToppings;

    public BeverageMachine() {
        this.serveToppings = new ServeToppings();
    }

    public Product serveProduct(Topping[] toppings, Product beverage) {
        int balance = this.getBalance();
        Product product = serveToppings.serveTopping(toppings, beverage);

        int total = product.productPrice();

        if (balance < total) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= total;

        this.setBalance(balance);

        return product;
    }
}
