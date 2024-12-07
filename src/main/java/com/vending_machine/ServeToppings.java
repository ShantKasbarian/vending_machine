package com.vending_machine;

public class ServeToppings {
    public Coffee serveTopping(Topping[] toppings, Coffee coffee) {

        if (toppings == null) {
            return coffee;
        }

        for (Topping topping : toppings) {
            switch (topping) {
                case Topping.MILK:
                    coffee.addTopping(new MilkDecorator(coffee));
                    break;
                case Topping.SUGAR:
                    coffee.addTopping(new SugarDecorator(coffee));
                    break;
            }
        }

        return coffee;
    }


}
