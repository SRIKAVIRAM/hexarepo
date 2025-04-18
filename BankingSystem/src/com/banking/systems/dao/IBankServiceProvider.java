package com.banking.systems.dao;

import com.banking.systems.model.*;

public interface IBankServiceProvider {
    Account createAccount(Customer customer, long accNo, String accType, float balance);
    float deposit(long accountNumber, float amount);
    float withdraw(long accountNumber, float amount) throws Exception;
    void transfer(long fromAccountNumber, long toAccountNumber, float amount) throws Exception;
    float getAccountBalance(long accountNumber);
    void getAccountDetails(long accountNumber);
    void listAccounts();
    void calculateInterest();
}
