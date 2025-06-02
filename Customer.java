
package myjava.atm.java;
public class Customer {
    private String name;
    private String customerID;
    private Account account;

    public Customer(String name, String customerID, Account account) {
        this.name = name;
        this.customerID = customerID;
        this.account = account;
    }

    public void requestTransaction(Transaction transaction) {
        transaction.execute();
    }

    public Account getAccount() {
        return account;
    }
}
