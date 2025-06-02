package myjava.atm.java;
public class Card {
    private String cardNumber;
    private Account account;

    public Card(String cardNumber, Account account) {
        this.cardNumber = cardNumber;
        this.account = account;
    }

    public boolean deposit(double amount) {
        account.deposit(amount);
        return true;
    }

    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    public double getBalance() {
        return account.getBalance();
    }

    public Account getAccount() {
        return account;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}

