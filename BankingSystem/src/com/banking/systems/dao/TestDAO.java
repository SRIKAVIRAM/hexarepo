package com.banking.systems.dao;

import com.banking.systems.dao.*;
import com.banking.systems.model.*;
import com.banking.systems.exception.*;

public class TestDAO {
    public static void main(String[] args) {
        BankServiceProviderImpl service = new BankServiceProviderImpl();

        Customer customer = new Customer("Alice Smith", "456 Park Ave", "alice@example.com");

        Account savings = service.createAccount(customer, 0, "Savings", 1000f);
        Account current = service.createAccount(customer, 0, "Current", 2000f);

        System.out.println("\n--- Initial Account Details ---");
        service.getAccountDetails(savings.getAccountNumber());
        service.getAccountDetails(current.getAccountNumber());

        service.deposit(savings.getAccountNumber(), 500f);

        try {
            service.withdraw(savings.getAccountNumber(), 2000f); // Will likely throw exception
        } catch (InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Withdraw failed: " + e.getMessage());
        }

        try {
            service.transfer(current.getAccountNumber(), savings.getAccountNumber(), 1000f);
        } catch (InsufficientFundsException | AccountNotFoundException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }

        System.out.println("\n--- Final Account Details ---");
        service.listAccounts();

        System.out.println("\n--- Interest Calculation ---");
        service.calculateInterest();
    }
}
