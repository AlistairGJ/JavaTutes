/**
 * Created by alistairgj on 17/2/18.
 */
public abstract class Sale {

    private String address;
    private double actualPrice;

    abstract double computeCharge();

    // Constructor!!!
    public Sale(String address, double actualPrice)
    {
        this.address = address;
        this.actualPrice = actualPrice;
    }

    // Getter (accessor) for address
    public String getAddress()
    {
        return address;
    }

    // Getter (accessor) for price
    public double getActualPrice()
    {
        return actualPrice;
    }

}
