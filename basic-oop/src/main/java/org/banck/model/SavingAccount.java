package org.banck.model;

public class SavingAccount extends BankAccount{
    private double interestRate;

    public SavingAccount() {
        super();
    }

    public SavingAccount(String currency, double initailBalance, double interestRate) {
        super(currency, initailBalance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "interestRate=" + interestRate  + '\''+
                super.toString()+
                '}';
    }

    @Override
    public String getType() {
        return "SAVING_ACCOUNT";
    }
}
