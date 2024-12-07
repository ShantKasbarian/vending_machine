package com.vending_machine;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertCoin(500);

        Topping[] toppings = {Topping.MILK, Topping.SUGAR};
        Product coffee = coffeeMachine.serveProduct(toppings, new Coffee(new ArrayList<>()));
        System.out.println("your new balance = " + coffeeMachine.getBalance());

        SnackMachine snackMachine = new SnackMachine();

        snackMachine.insertCoin(500);
        Product product = snackMachine.serveProduct("chips");

        System.out.println(product.productDescription());
        System.out.println("your new balance = " + snackMachine.getBalance());
    }
}