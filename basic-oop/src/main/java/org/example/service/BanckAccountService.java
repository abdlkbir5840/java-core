package org.example.service;

import org.example.exception.AccountNotFoundException;
import org.example.exception.InsufficientBalanceException;
import org.example.model.BankAccount;

import java.util.List;
import java.util.function.Predicate;

public interface BanckAccountService {
    List<BankAccount> getAllAccounts();
    BankAccount getAccountById(String id) throws AccountNotFoundException;
    BankAccount addBankAccount (BankAccount bankAccount);
    void addRandomData(int size);
    void credit(String accountId, double amount) throws AccountNotFoundException;
    void debit(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException;
    void transfere(String accountSource, String accountDistination, double amount) throws InsufficientBalanceException, AccountNotFoundException;
    List<BankAccount> getSavingAccounts();
    List<BankAccount> getCurrentsAccounts();
    double getTotaleBalance();
    List<BankAccount> searchAccount(Predicate<BankAccount> filer);

}
