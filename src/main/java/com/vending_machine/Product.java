package com.vending_machine;

public abstract class Product {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String productName();
    public abstract int productPrice();
}
