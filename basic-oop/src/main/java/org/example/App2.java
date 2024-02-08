package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.BankAccount;
import org.example.model.CurrentAccount;
import org.example.model.SavingAccount;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App2 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        BankAccount [] bankAccounts = new BankAccount[4];
        
        bankAccounts[0] = new CurrentAccount("MAD",55467,566);
        bankAccounts[1] = new CurrentAccount("MAD",23242,459);
        bankAccounts[2] = new SavingAccount("MAD",6577, 1.2);
        bankAccounts[3] = new SavingAccount("MAD",35364, 2.2);

        for(BankAccount b: bankAccounts){
            System.out.println(mapper.writeValueAsString(b));
        }
        System.out.println("--------------------- List --------------------------------------");
        List<BankAccount> bankAccountList = new ArrayList<>();
        bankAccountList.add(new CurrentAccount("MAD",55467,566));
        bankAccountList.add(new CurrentAccount("MAD",23242,459));
        bankAccountList.add(new SavingAccount("MAD",6577, 1.2));
        bankAccountList.add(new SavingAccount("MAD",35364, 2.2));

        for(BankAccount b: bankAccountList){
            System.out.println(mapper.writeValueAsString(b));
        }
        System.out.println("--------------------- Map --------------------------------------");
        Map<String, BankAccount> accounts = new HashMap<>();
        accounts.put("CC1", new CurrentAccount("MAD",55467,566));
        accounts.put("CC2", new CurrentAccount("MAD",23242,459));
        accounts.put("CC3", new SavingAccount("MAD",6577, 1.2));
        accounts.put("CC4", new SavingAccount("MAD",35364, 2.2));
        System.out.println("--------------------- Map Key --------------------------------------");
        for (String key: accounts.keySet()){
            System.out.println(mapper.writeValueAsString(accounts.get(key)));
        }
        System.out.println("--------------------- Map Value --------------------------------------");
        for(BankAccount bankAccount:accounts.values()){
            System.out.println(mapper.writeValueAsString(bankAccount));
        }
    }
}
