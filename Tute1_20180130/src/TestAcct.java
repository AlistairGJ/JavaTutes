/**
 * Created by alistairgj on 30/1/18.
 */
public class TestAcct
{
    public static void main(String args[])
    {
        Account a1 = new Account("Tan", "S123", 24.5);
        Account a2 = new Account("Smith", "S124", 1200.0);
        a1.deposit(100.0);
        a1.withdraw(2000);
        a2.deposit(120);
        a2.withdraw(80);
        System.out.println("Balance for" + a1.getName() + "is" + a1.getBalance());
        System.out.println("Balance for" + a2.getName() + "is" + a2.getBalance());
    }
}
