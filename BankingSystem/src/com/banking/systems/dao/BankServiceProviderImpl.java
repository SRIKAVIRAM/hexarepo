package com.banking.systems.dao;

import java.util.ArrayList;
import java.util.List;

import com.banking.systems.model.*;
import com.banking.systems.exception.*;

public class BankServiceProviderImpl implements IBankServiceProvider, ICustomerServiceProvider {

    private List<Account> accountList = new ArrayList<>();
    private static long lastAccountNumber = 1000;

    @Override
    public Account createAccount(Customer customer, long accNo, String accType, float balance) {
        Account account = null;
        if (accType.equalsIgnoreCase("Savings")) {
            if (balance < 500) {
                System.out.println("Minimum balance for Savings account is $500.");
                return null;
            }
            account = new SavingsAccount(++lastAccountNumber, balance, customer);
        } else if (accType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount(++lastAccountNumber, balance, customer);
        } else {
            System.out.println("Invalid account type.");
            return null;
        }

        accountList.add(account);
        System.out.println("Account created successfully!");
        return account;
    }

    @Override
    public float getAccountBalance(long accountNumber) {
        Account acc = findAccount(accountNumber);
        return acc != null ? acc.getBalance() : -1;
    }

    @Override
    public float deposit(long accountNumber, float amount) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.deposit(amount);
            return acc.getBalance();
        }
        System.out.println("Account not found.");
        return -1;
    }

    @Override
    public float withdraw(long accountNumber, float amount) throws InsufficientFundsException, AccountNotFoundException {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            if (acc.getBalance() < amount) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            }
            acc.withdraw(amount);
            return acc.getBalance();
        }
        throw new AccountNotFoundException("Account not found.");
    }

    @Override
    public void transfer(long fromAccountNumber, long toAccountNumber, float amount)
            throws InsufficientFundsException, AccountNotFoundException {
        Account from = findAccount(fromAccountNumber);
        Account to = findAccount(toAccountNumber);

        if (from == null || to == null) {
            throw new AccountNotFoundException("One of the accounts not found.");
        }

        if (from.getBalance() < amount) {
            throw new InsufficientFundsException("Insufficient funds in source account.");
        }

        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transfer successful!");
    }

    @Override
    public void getAccountDetails(long accountNumber) {
        Account acc = findAccount(accountNumber);
        if (acc != null) {
            acc.displayAccountInfo();
        } else {
            System.out.println("Account not found.");
        }
    }

    @Override
    public void listAccounts() {
        for (Account acc : accountList) {
            acc.displayAccountInfo();
            System.out.println("--------------------------");
        }
    }

    @Override
    public void calculateInterest() {
        for (Account acc : accountList) {
            float interest = acc.calculateInterest();
            if (interest > 0) {
                acc.deposit(interest);
                System.out.println("Interest $" + interest + " added to Account " + acc.getAccountNumber());
            }
        }
    }

    // 🔍 Helper method
    private Account findAccount(long accountNumber) {
        for (Account acc : accountList) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }
}
