package src;

public class Account {
    //customer-given account name
    private String accName;
    //Randomly generated account ID
    private Integer accId;
    //Cash balance remaining in the account
    private Double balance;

    //Account class constructor
    public Account (String name, Integer num, Double starting){
        //Let's say that this bank requires a minimum amount to open an account
        this.accName = name;
        this.accId = num; 
        if (starting >= 500) {
            this.balance = starting;
        } else {
            throw new IllegalArgumentException("Starting amount is too low");
            //Note this might be a scenario where we loop back into the loop
            //The entire program shouldn't close here, so this is temporary
        }
        
    }
    /**
     * depositAmount increases the balance of a given account
     * @param deposit - The amount of money that a user wants to deposit.
     */
    public void depositAmount (Double deposit) {
        this.balance += deposit;
        System.out.println("Your balance is now: " + balance);
    }

    /**
     * withdrawAmount increases the balance of a given account
     * @param deposit - The amount of money that a user wants to deposit.
     */
    public void withdrawAmount (Double remove) {
        if (remove > balance) {
            System.out.println("Your account will overdraw.");
        } else {
            this.balance -= remove;
            System.out.println("Your balance is now: " + balance);
        }
    }

    /**
     * Remember to throw exceptions for account operatations(i.e overdrawing)
     * 
     * Randomly generate account ID - make it so all accounts begin with 442??
     */
}
