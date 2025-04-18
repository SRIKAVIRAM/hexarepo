package com.banking.systems.model;

public abstract class Account {
    protected long accountNumber;
    protected float balance;
    protected Customer customer;

    public Account(long accountNumber, float balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        balance -= amount;
    }

    public abstract float calculateInterest();

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Customer: " + customer.getName());
    }
}
