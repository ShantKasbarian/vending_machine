package com.vending_machine;

public abstract class VendingMachine {
    private int balance = 0;

    public void insertCoin(int coin) {
        balance += new CoinValidator().validate(coin);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
