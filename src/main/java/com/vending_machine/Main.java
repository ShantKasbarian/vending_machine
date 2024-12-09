package com.vending_machine;

public class Main {
    public static void main(String[] args) {
        BeverageMachine beverageMachine = new BeverageMachine();
        beverageMachine.insertCoin(200);
        beverageMachine.insertCoin(50);

        Topping[] toppings = {Topping.MILK};

        Product coffee = beverageMachine.serveProduct(toppings, new Tea());
        System.out.println("your new balance = " + beverageMachine.getBalance());
        System.out.println(coffee.getDescription());
        System.out.println("=======================");

        SnackMachine snackMachine = new SnackMachine();

        snackMachine.insertCoin(500);
        Product product = snackMachine.serveProduct(Snack.CHIPS);

        System.out.println(product.getDescription());
        System.out.println("your new balance = " + snackMachine.getBalance());
    }
}