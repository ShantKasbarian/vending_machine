package com.vending_machine;

public class ServeSnacks {
    public Product serveSnack(Snack snack) {
        Product product;

        switch(snack) {
            case Snack.CHOCOLATE:
                product = new Chocolate();
                break;
            case Snack.CHIPS:
                product = new Chips();
                break;
            default:
                throw new RuntimeException("product not found");
        }

        return product;
    }
}
