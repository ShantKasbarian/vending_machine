package com.vending_machine;

public class Tea extends Product{

    public Tea() {
        this.setDescription("tea made with our finest herbs");
    }

    @Override
    public String productName() {
        return "tea";
    }

    @Override
    public int productPrice() {
        return 150;
    }
}
