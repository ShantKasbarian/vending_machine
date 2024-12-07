package com.vending_machine;

public class CoffeeMachine extends VendingMachine {

    public Product serveProduct(Topping[] toppings, Coffee coffee) {
        int balance = this.getBalance();
        Coffee product = new ServeToppings().serveTopping(toppings, coffee);

        int total = product.productPrice();

        StringBuffer description = new StringBuffer();
        description.append(product.productDescription());

        for(CoffeeDecorator coffeeDecorator: product.getToppings()) {
            total+= coffeeDecorator.productPrice();
            description.append(coffeeDecorator.productDescription());
        }

        if (balance < total) {
            throw new RuntimeException("insufficient funds");
        }

        balance -= total;

        setBalance(balance);

        System.out.println(description);

        return product;
    }
}
