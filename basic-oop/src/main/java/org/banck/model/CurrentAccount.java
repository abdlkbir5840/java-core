package org.banck.model;

public class CurrentAccount extends BankAccount{
    private double overDraft;

    public CurrentAccount() {
        super();
    }

    public CurrentAccount(String currency, double initailBalance, double overDraft) {
        super(currency, initailBalance);
        this.overDraft = overDraft;
    }

    public double getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(double overDraft) {
        this.overDraft = overDraft;
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "overDraft=" + overDraft + '\''+
                super.toString()+
                '}';
    }

    @Override
    public String getType() {
        return "CURRENT_ACCOUNT";
    }
}
