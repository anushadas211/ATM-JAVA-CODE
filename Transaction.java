package myjava.atm.java;
import java.util.Date;

public abstract class Transaction {
    protected String transactionID;
    protected Date date;
    protected double amount;
    protected Card card;

    public Transaction(String transactionID, double amount, Card card) {
        this.transactionID = transactionID;
        this.date = new Date();
        this.amount = amount;
        this.card = card;
    }

    public abstract void execute();
}
