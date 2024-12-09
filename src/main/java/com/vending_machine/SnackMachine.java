package com.vending_machine;

public class SnackMachine extends VendingMachine {
    private ServeSnacks serveSnacks;

    public SnackMachine() {
        this.serveSnacks = new ServeSnacks();
    }

    public Product serveProduct(Snack snack) {
        int balance = this.getBalance();

        Product product = serveSnacks.serveSnack(snack);

        if (balance < product.productPrice()) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= product.productPrice();

        setBalance(balance);

        return product;
    }
}
