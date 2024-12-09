package com.vending_machine;

public class Chocolate extends Product {

    @Override
    public String productName() {
        return "chocolate bar";
    }

    @Override
    public int productPrice() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "A rich and indulgent treat made with smooth, high-quality chocolate";
    }
}
