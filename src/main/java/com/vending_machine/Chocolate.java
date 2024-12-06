package com.vending_machine;

public class Chocolate implements Product {

    @Override
    public String productName() {
        return "chocolate bar";
    }

    @Override
    public int productPrice() {
        return 300;
    }

    @Override
    public String productDescription() {
        return "A rich and indulgent treat made with smooth, high-quality chocolate";
    }
}
