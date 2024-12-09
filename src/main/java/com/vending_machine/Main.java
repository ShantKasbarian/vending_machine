package com.vending_machine;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.insertCoin(200);
        coffeeMachine.insertCoin(50);

        Topping[] toppings = {Topping.MILK};

        Product coffee = coffeeMachine.serveProduct(toppings, new Tea());
        System.out.println("your new balance = " + coffeeMachine.getBalance());
        System.out.println(coffee.getDescription());

        SnackMachine snackMachine = new SnackMachine();

        snackMachine.insertCoin(500);
        Product product = snackMachine.serveProduct(Snack.CHIPS);

        System.out.println(product.getDescription());
        System.out.println("your new balance = " + snackMachine.getBalance());
    }
}