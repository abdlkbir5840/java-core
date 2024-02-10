package org.example.factory;

public class PaymentProcessorFactory {
    public static PaymentProcessor createPaymentProcessor(String method){
        switch (method){
            case "CREDIT_CARD":
                return new CreditCardProcessor();
            case "BANK_TRANSFER":
                return new BankTransferProcessor();
            default:
                throw new IllegalArgumentException("Invalid payment method"+method);
        }
    }
}
