package myjava.atm.java;
public class ATM {
    private String location;
    private String atmID;

    public ATM(String location, String atmID) {
        this.location = location;
        this.atmID = atmID;
    }

    public boolean validateCard(Card card) {
        return card != null;
    }

    public boolean authenticateUser(String pin, Account account, Bank bank) {
        return bank.validatePin(account.getAccountNumber(), pin);
    }

    public void performTransaction(Transaction transaction) {
        transaction.execute();
    }
}

