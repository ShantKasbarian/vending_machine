package com.vending_machine;

public class MilkDecorator extends BeverageDecorator {
    private Product product;

    public MilkDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String productName() {
        return "milk";
    }

    @Override
    public int productPrice() {
        return this.product.productPrice() + 50;
    }

    @Override
    public String getDescription() {
        return this.product.getDescription() + " and milk";
    }
}
