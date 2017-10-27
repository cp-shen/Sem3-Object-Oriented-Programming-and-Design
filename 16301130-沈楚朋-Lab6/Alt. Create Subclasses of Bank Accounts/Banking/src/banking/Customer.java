package banking;

public class Customer
{
    private String firstName , lastName;

    private SavingsAccount savingsAccount = null;
    private CheckingAccount checkingAccount = null;


    public SavingsAccount getSavings() {
        return savingsAccount;
    }
    public CheckingAccount getChecking() {
        return checkingAccount;
    }
    public void setSavings(SavingsAccount savingsAccount) {
        this.savingsAccount = savingsAccount;
    }
    public void setChecking(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }


    public String getFirstName () {
        return firstName;
    }
    public String getLastName () {
        return lastName;
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

    }
}
