package com.banking.systems.model;

public class CurrentAccount extends Account {

    public CurrentAccount(long accountNumber, float balance, Customer customer) {
        super(accountNumber, balance, customer);
    }

    @Override
    public float calculateInterest() {
        return 0; // No interest for current accounts
    }
}
