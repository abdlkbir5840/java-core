package org.example.factory;

public class CreditCardProcessor implements PaymentProcessor{
    @Override
    public void processpayment(double amount) {
        System.out.println("Processing payment via Credit Card for amount: "+ amount);
    }
}
