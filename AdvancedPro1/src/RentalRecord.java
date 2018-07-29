import utilities.DateTime;

public class RentalRecord
{
    //Defining the attributes
    private String recordID;
    private DateTime rentDate;
    private DateTime estimatedReturnDate;
    private DateTime actualReturnDate;
    private double rentalFee;
    private double lateFee;
    private String customerID;

    //Constructor
    public RentalRecord(DateTime rentDate, DateTime estimatedReturnDate, DateTime actualReturnDate,
                        double rentalFee, double lateFee, String customerID, String propertyID)
    {
        this.rentDate = rentDate;
        this.estimatedReturnDate = estimatedReturnDate;
        this.actualReturnDate = actualReturnDate;
        this.rentalFee = rentalFee;
        this.lateFee = lateFee;
        this.customerID = customerID;
        this.recordID = propertyID + "_" + customerID + "_" + rentDate.getEightDigitDate();
    }

    //Need accessors - getters
    public String getRecordID()
    {
        return recordID;
    }

    public DateTime getRentDate()
    {
        return rentDate;
    }

    public DateTime getEstimatedReturnDate()
    {
        return estimatedReturnDate;
    }

    public DateTime getActualReturnDate()
    {
        return actualReturnDate;
    }

    public double getRentalFee()
    {
        return rentalFee;
    }

    public double getLateFee()
    {
        return lateFee;
    }

    public String getCustomerID()
    {
        return customerID;
    }

    //ToString - get a string representation of an object
    //Useful because can print straight away
    public String toString()
    {
        String s = recordID + ":" + rentDate + ":" + estimatedReturnDate + ":";

        if (actualReturnDate == null)
        {
            s += "none:none:none";
        }

        else
        {
            s += actualReturnDate + ":" + rentalFee + ":" + lateFee;
        }

        return s;
    }

    //getFormattedDate()

}
