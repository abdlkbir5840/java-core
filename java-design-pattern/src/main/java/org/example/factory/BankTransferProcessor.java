package org.example.factory;

public class BankTransferProcessor implements PaymentProcessor{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing payment via Bank Transfer for amount: "+ amount);
    }
}
