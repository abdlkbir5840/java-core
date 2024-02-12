package org.banck;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.banck.exception.AccountNotFoundException;
import org.banck.model.BankAccount;
import org.banck.model.CurrentAccount;
import org.banck.model.SavingAccount;
import org.banck.service.BanckAccountService;
import org.banck.service.BanckAccountServiceImpl;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        BankAccount acount1 =  new CurrentAccount("MAD",55467,566);
        BankAccount acount2 =  new CurrentAccount("MAD",23242,459);
        BankAccount acount3 =  new SavingAccount("MAD",6577, 1.2);
        BankAccount acount4 =  new SavingAccount("MAD",35364, 2.2);
        BankAccount acount5 =  new SavingAccount("MAD",7654, 3.01);
        acount5.setAccountId("CC1");
        BanckAccountService banckAccountService = new BanckAccountServiceImpl();
        banckAccountService.addBankAccount(acount1);
        banckAccountService.addBankAccount(acount2);
        banckAccountService.addBankAccount(acount3);
        banckAccountService.addBankAccount(acount4);
        banckAccountService.addBankAccount(acount5);
        for(BankAccount bankAccount: banckAccountService.getAllAccounts()){
            System.out.println(mapper.writeValueAsString(bankAccount));
        }
        System.out.println("============================================");

        try {
            System.out.println(mapper.writeValueAsString(banckAccountService.getAccountById("CCa1")));
        } catch (AccountNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Suit de programme");


    }
}