package banking.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer
{
    private String firstName , lastName;

    private List<Account> accounts = null ;

    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public Account getAccount(int i){
        return accounts.get(i);
    }
    public Iterator<Account> getAccounts(){
        return accounts.iterator();
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }

    /**
     * @param f fist name
     * @param l last name
     * initializes the accounts array with maximum size as 6
     */
    public Customer(String f , String l)
    {
        firstName = f;
        lastName = l;
        accounts = new ArrayList<>();
    }
}
