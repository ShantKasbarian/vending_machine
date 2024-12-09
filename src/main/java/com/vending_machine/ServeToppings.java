package com.vending_machine;

public class ServeToppings {
    public Product serveTopping(Topping[] toppings, Product product) {

        if (toppings == null) {
            return product;
        }

        for (Topping topping : toppings) {
            switch (topping) {
                case Topping.MILK:
                    product = new MilkDecorator(product);
                    break;
                case Topping.SUGAR:
                    product = new SugarDecorator(product);
                    break;
            }
        }

        return product;
    }


}
