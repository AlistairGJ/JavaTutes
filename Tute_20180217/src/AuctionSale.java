/**
 * Created by alistairgj on 17/2/18.
 */
public class AuctionSale extends Sale
{
    private double basePrice;
    private double bonusRate;

    public AuctionSale(String address, double basePrice, double actualPrice, double bonusRate)
    {
        super(address, actualPrice);
        this.basePrice = basePrice;
        this.bonusRate = bonusRate;
    }

    public double computeCharge()
    {
        return (getActualPrice() - basePrice) * bonusRate + 2000;
    }
}
