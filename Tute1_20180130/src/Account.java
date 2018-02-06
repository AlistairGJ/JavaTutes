/**
 * Created by alistairgj on 30/1/18.
 */
public class Account
{
    private String name;
    private String ID;
    protected double balance; //Public accessor is sufficient

    public Account(String name, String ID, double balance)
    {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void withdraw(double amt)
    {
        if (balance - amt < 0)
        {
            System.out.println("Insufficient funds");
        }
        else
        {
            balance -= amt;
        }
    }

    public void deposit(double amt)
    {
        balance += amt;
    }

    public String getName()
    {
        return name;
    }
}
