package src;

public class Customer {
    private String custName;
    private Account account;

    public Customer (String name, Account account) {
        this.custName = name;
        this.account = account;
    }


    public Boolean hasAccount() {
        return true;
    }

    /*
    Note: Need methods that retrieve the name and account info from the customer
    */
}
