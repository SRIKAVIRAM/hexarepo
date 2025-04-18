package com.banking.systems.model;

public class SavingsAccount extends Account {

    public SavingsAccount(long accountNumber, float balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public float calculateInterest() {
        return balance * 0.04f; // 4% interest
    }
}
