package com.vending_machine;

public class SnackMachine extends VendingMachine {

    public Product serveProduct(Snack snack) {
        int balance = this.getBalance();

        Product product = new ServeSnacks().serveSnack(snack);

        if (balance < product.productPrice()) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= product.productPrice();

        setBalance(balance);

        return product;
    }
}
