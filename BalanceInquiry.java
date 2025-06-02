package myjava.atm.java;
public class BalanceInquiry extends Transaction {
    public BalanceInquiry(String transactionID, Card card) {
        super(transactionID, 0, card);
    }

    @Override
    public void execute() {
        System.out.println("Your balance is: $" + card.getBalance());
    }
}
