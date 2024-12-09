package com.vending_machine;

public abstract class VendingMachine {
    private CoinValidator coinValidator;
    private int balance = 0;

    public VendingMachine() {
        this.coinValidator = new CoinValidator();
    }

    public void insertCoin(int coin) {
        balance += coinValidator.validate(coin);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
