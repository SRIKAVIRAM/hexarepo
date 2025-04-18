package com.banking.systems.dao;

public interface ICustomerServiceProvider {
    void listAccounts();
    void getAccountDetails(long accountNumber);
}
