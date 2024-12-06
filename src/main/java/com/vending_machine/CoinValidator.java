package com.vending_machine;

public class CoinValidator {
    public int validate(int coin) {
        if (coin == 50 || coin == 100 || coin == 200 || coin == 500) {
            return coin;
        }

        throw new RuntimeException("Invalid coin");
    }
}
