package com.banking.systems.model;

import com.banking.systems.model.Customer;
import com.banking.systems.model.SavingsAccount;
import com.banking.systems.model.CurrentAccount;

public class TestModel {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", "john@example.com");

        SavingsAccount savings = new SavingsAccount(1001, 1000.0f, customer);
        savings.deposit(500);
        savings.withdraw(200);
        savings.displayAccountInfo();

        float interest = savings.calculateInterest();
        System.out.println("Interest: $" + interest);

        System.out.println("--------------------------------");

        CurrentAccount current = new CurrentAccount(1002, 5000.0f, customer);
        current.displayAccountInfo();
        System.out.println("Interest: $" + current.calculateInterest());
    }
}
