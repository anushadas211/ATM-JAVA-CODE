package myjava.atm.java;
import java.util.HashMap;

public class Bank {
    private String name;
    private String bankCode;
    private HashMap<String, Account> accounts = new HashMap<>();

    public Bank(String name, String bankCode) {
        this.name = name;
        this.bankCode = bankCode;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public boolean validatePin(String accountNumber, String pin) {
        Account acc = accounts.get(accountNumber);
        return acc != null && acc.validatePin(pin);
    }
}

