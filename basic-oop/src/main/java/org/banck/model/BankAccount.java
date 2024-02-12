package org.banck.model;

import java.util.Objects;
import java.util.UUID;

public abstract class BankAccount {
    private String accountId;
    private double balance;
    private String currency;
    private AccountStatus status;
    public BankAccount() {
        this.accountId = UUID.randomUUID().toString();
        this.status = AccountStatus.CREATED;
    }
    public BankAccount(String currency, double initailBalance) {
        this();
        this.currency = currency;
        this.balance = initailBalance;
    }
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public AccountStatus getStatus() {
        return status;
    }
    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        BankAccount that = (BankAccount) obj;
        return Objects.equals(getAccountId(),that.getAccountId())&&
             Objects.equals(getBalance(),that.getBalance())&&
             Objects.equals(getCurrency(),that.getCurrency())&&
             Objects.equals(getStatus(),that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountId(), getCurrency(), getStatus(), getBalance());
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", status=" + status +
                '}';
    }

    public abstract String getType();
}
