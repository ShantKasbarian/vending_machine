package com.vending_machine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertCoin(200);

        Product coffee = coffeeMachine.serveProduct(new String[0], new Coffee());
        System.out.println(coffeeMachine.getBalance());
        System.out.println(coffee.productDescription());

        SnackMachine snackMachine = new SnackMachine();

        snackMachine.insertCoin(500);
        Product product = snackMachine.serveProduct("chips");

        System.out.println(product.productDescription());
        System.out.println(snackMachine.getBalance());
    }
}