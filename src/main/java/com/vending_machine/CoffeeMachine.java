package com.vending_machine;

public class CoffeeMachine extends VendingMachine {

    public Product serveProduct(Topping[] toppings, Product beverage) {
        int balance = this.getBalance();
        Product product = new ServeToppings().serveTopping(toppings, beverage);

        int total = product.productPrice();

        if (balance < total) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= total;

        this.setBalance(balance);

        return product;
    }
}
