package myjava.atm.java;
public class Withdrawal extends Transaction {
    public Withdrawal(String transactionID, double amount, Card card) {
        super(transactionID, amount, card);
    }

    @Override
    public void execute() {
        if (card.withdraw(amount)) {
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
