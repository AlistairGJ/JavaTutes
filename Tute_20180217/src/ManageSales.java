/**
 * Created by alistairgj on 17/2/18.
 */
public class ManageSales {

    public static void main(String args[])
    {
        Sale s[] = new Sale[4];
        s[0] = new NegotiatedSale("34 Kew crt", 340000, 0.05);
        s[1] = new AuctionSale("5 Bet crt", 560000, 565000, 0.10);
        s[2] = new AuctionSale("12 Ron dr", 240000, 290000, 0.15);
        s[3] = new NegotiatedSale("2 John st", 420000, 0.03);

        for (int i=0; i <4; i++)
        {
            System.out.print("For the sale of ");
            System.out.print(s[i].getAddress());
            System.out.print(" the commission was ");
            System.out.println(s[i].computeCharge());
        }
    }
}
