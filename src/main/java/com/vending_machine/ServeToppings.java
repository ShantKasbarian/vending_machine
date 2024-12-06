package com.vending_machine;

public class ServeToppings {
    public Coffee serveTopping(String[] toppings, Coffee coffee) {

        if (toppings == null) {
            return coffee;
        }

        for (String topping : toppings) {
            switch (topping.toLowerCase()) {
                case "milk":
                    coffee.addTopping(new MilkDecorator(coffee));
                    break;
                case "sugar":
                    coffee.addTopping(new SugarDecorator(coffee));
                    break;
            }
        }

        return coffee;
    }


}
