package myjava.atm.java;
public class Deposit extends Transaction {
    public Deposit(String transactionID, double amount, Card card) {
        super(transactionID, amount, card);
    }

    @Override
    public void execute() {
        card.deposit(amount);
        System.out.println("Deposit of $" + amount + " successful.");
    }
}
