package org.example.factory;

public class Main {
    public static void main(String[] args) {

            PaymentProcessor paymentProcessor1 = PaymentProcessorFactory.createPaymentProcessor("CREDIT_CARD");
            PaymentProcessor paymentProcessor2 = PaymentProcessorFactory.createPaymentProcessor("BANK_TRANSFER");
            paymentProcessor1.processpayment(400);
            paymentProcessor2.processpayment(400);
        try {
            PaymentProcessor paymentProcessor3 = PaymentProcessorFactory.createPaymentProcessor("");
            paymentProcessor3.processpayment(400);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
