package org.banck;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.banck.exception.AccountNotFoundException;
import org.banck.exception.InsufficientBalanceException;
import org.banck.model.AccountStatus;
import org.banck.model.BankAccount;
import org.banck.model.CurrentAccount;
import org.banck.service.BanckAccountService;
import org.banck.service.BanckAccountServiceImpl;
import org.banck.utlis.DataTransformationUtlis;

import java.util.List;

public class App3 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        BanckAccountService banckAccountService = new BanckAccountServiceImpl();
        BankAccount acount1 =  new CurrentAccount("MAD",500,566);
        BankAccount acount2 =  new CurrentAccount("MAD",500,120);
        acount1.setAccountId("CC1");
        acount2.setAccountId("CC2");
        banckAccountService.addBankAccount(acount1);
        banckAccountService.addBankAccount(acount2);
        BankAccount acc1 = null;
        BankAccount acc2 = null;
        try {
             acc1 = banckAccountService.getAccountById("CC1");
             acc2 = banckAccountService.getAccountById("CC2");

            System.out.println(DataTransformationUtlis.toJson(acc1));
            System.out.println(DataTransformationUtlis.toJson(acc2));

            banckAccountService.debit(acc1.getAccountId(), 100);
            banckAccountService.credit(acc2.getAccountId(), 100);
            banckAccountService.transfere(acc1.getAccountId(),acc2.getAccountId(), 100);

        } catch (AccountNotFoundException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println(DataTransformationUtlis.toJson(acc1));
            System.out.println(DataTransformationUtlis.toJson(acc2));
        }
        System.out.println("=====================================================");

        banckAccountService.addRandomData(20);
        /*banckAccountService.getAllAccounts()
                .stream()
                .map(DataTransformationUtlis::toJson)
                .forEach(System.out::println);*/

        banckAccountService.getSavingAccounts()
                .stream()
                .map(DataTransformationUtlis::toJson)
                .forEach(System.out::println);
        System.out.println("=====================================================");
        banckAccountService.getCurrentsAccounts()
                .stream()
                .map(DataTransformationUtlis::toJson)
                .forEach(System.out::println);
        System.out.println("=====================================================");

        System.out.println(banckAccountService.getSavingAccounts().size());
        System.out.println(banckAccountService.getCurrentsAccounts().size());
        System.out.println(banckAccountService.getTotaleBalance());
        System.out.println("=====================================================");
        List<BankAccount> bankAccountList = banckAccountService.searchAccount(bankAccount -> bankAccount.getStatus().equals(AccountStatus.ACTIVATED));
        bankAccountList
                .stream()
                .map(DataTransformationUtlis::toJson)
                .forEach(System.out::println);

    }
}
