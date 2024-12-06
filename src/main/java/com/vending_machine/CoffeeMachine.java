package com.vending_machine;

public class CoffeeMachine extends VendingMachine {

    public Product serveProduct(String[] productName, Coffee coffee) {
        int balance = this.getBalance();
        Product product = new ServeToppings().serveTopping(productName, coffee);

        if (balance < product.productPrice()) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= product.productPrice();

        setBalance(balance);

        return product;
    }
}
