package com.vending_machine;

public class ServeSnacks {
    public Product serveSnack(String productName) {
        Product product;

        switch(productName.toLowerCase()) {
            case "chocolate":
                product = new Chocolate();
                break;
            case "chips":
                product = new Chips();
                break;
            default:
                throw new RuntimeException("product not found");
        }

        return product;
    }
}
