package com.vending_machine;

public class SugarDecorator extends BeverageDecorator {
    private Product product;

    public SugarDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String productName() {
        return "sugar";
    }

    @Override
    public int productPrice() {
        return this.product.productPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.product.getDescription() + " and sugar";
    }
}
