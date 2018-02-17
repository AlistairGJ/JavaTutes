

public class NegotiatedSale extends Sale
{

    private double commissionRate;

    public NegotiatedSale(String address, double actualPrice, double commissionRate)
    {
        super(address, actualPrice);
        this.commissionRate = commissionRate;
    }

    public double computeCharge()
    {
        return getActualPrice() * commissionRate;
    }

}

