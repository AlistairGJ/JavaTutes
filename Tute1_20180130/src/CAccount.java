/**
 * Created by alistairgj on 6/2/18.
 */
public class CAccount extends Account {

    private double ODLimit;
    private double ODAmount;

    public void withdraw(double amt)
    {
        if (balance - amt >= 0) // Normal Withdrawal
        {
            balance -= amt;
        }
        else if (balance - amt >= ODLimit) // Overdraft Withdrawal
        {
            ODAmount = balance - amt;
        }
        else // Withdrawal denied
        {

        }
    }

    public CAccount(String name, String ID, double balance, double ODLimit)
    {
        super(name, ID, balance);
        this.ODLimit = ODLimit;
    }

}
