package src;
import src.Customer;
import src.Account;

public class Banking {
    /*The banking class needs some fields for accessing the bank data
    What's the best way to store the Customer info?
    HashMap of Int -> Cust, Acc Tuples?
    Eventually, we should account for the fact the a customer can have mutliple
    accounts. Actually, it should only be Id to cust objects because the 
    banking app itself shouldn't have access the individual accounts for the sake
    of privacy.
    */

    public static void main (String[] args) {
        //We could replace the Account field with an account interface if we
        //wanted different account functionalities. 
    
    }
}

