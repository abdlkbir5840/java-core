package org.banck.service;

import org.banck.exception.AccountNotFoundException;
import org.banck.exception.InsufficientBalanceException;
import org.banck.model.AccountStatus;
import org.banck.model.BankAccount;
import org.banck.model.CurrentAccount;
import org.banck.model.SavingAccount;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BanckAccountServiceImpl implements BanckAccountService{
    private final List<BankAccount> accounts = new ArrayList<>();
    @Override
    public List<BankAccount> getAllAccounts() {
        return accounts;
    }

    @Override
    public BankAccount getAccountById(String id) throws AccountNotFoundException {
        return accounts
                .stream()
                .filter(accounts -> accounts.getAccountId().equals(id))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("Bank account not found"));
    }

    @Override
    public BankAccount addBankAccount(BankAccount bankAccount) {
        accounts.add(bankAccount);
        return bankAccount;
    }

    @Override
    public void addRandomData(int size) {
        AccountStatus [] statuses = AccountStatus.values();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            BankAccount bankAccount;
            if(Math.random()>0.5){
                bankAccount = new CurrentAccount(Math.random()>0.5?"MAD":"USD",Math.random()*100000,Math.random()*50000);
            }else {
                bankAccount = new SavingAccount(Math.random()>0.5?"MAD":"USD",Math.random()*100000,3+Math.random()*7);
            }
            bankAccount.setStatus(statuses[random.nextInt(statuses.length)]);
            accounts.add(bankAccount);
        }
    }

    @Override
    public void credit(String accountId, double amount) throws AccountNotFoundException {
        BankAccount bankAccount = getAccountById(accountId);
        bankAccount.setBalance(bankAccount.getBalance()+amount);
    }

    @Override
    public void debit(String accountId, double amount) throws AccountNotFoundException, InsufficientBalanceException {
        BankAccount bankAccount = getAccountById(accountId);
        if(bankAccount.getBalance() < amount) throw  new InsufficientBalanceException("Insufficient Balance Exception");
        bankAccount.setBalance(bankAccount.getBalance()-amount);
    }

    @Override
    public void transfere(String accountSource, String accountDistination, double amount) throws InsufficientBalanceException, AccountNotFoundException {
        try {
            debit(accountSource, amount);
            credit(accountDistination, amount);
        }catch (InsufficientBalanceException | AccountNotFoundException e){
            //just pour rendre transactionnelle
            try {
                credit(accountSource, amount);
            }catch (AccountNotFoundException ex){
                throw ex;
            }
            throw e;
        }
    }

    @Override
    public List<BankAccount> getSavingAccounts() {
        return accounts
                .stream()
                .filter((account)->account.getType().equals("SAVING_ACCOUNT"))
                .collect(Collectors.toList());
    }

    @Override
    public List<BankAccount> getCurrentsAccounts() {
        return accounts
                .stream()
                .filter((account)->account.getType().equals("CURRENT_ACCOUNT"))
                .collect(Collectors.toList());
    }

    @Override
    public double getTotaleBalance() {
        return accounts
                .stream()
                .mapToDouble(BankAccount::getBalance)
                .sum();
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> filer) {
        List<BankAccount> bankAccountList = accounts
                .stream()
                .filter(filer::test)
                .collect(Collectors.toList());
        return bankAccountList;
    }
}
