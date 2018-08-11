import utilities.DateTime;

public class PremiumSuite extends RentalProperty
{
    private DateTime lastMaintenanceDate;
    //Constructor
    public PremiumSuite(String propertyID, String streetNum, String streetName,
                     String suburb, PropertyStatus currentPropertyStatus, DateTime lastMaintenanceDate)
    //Super because we are calling the constructor from the super class
    //Premium suite always has 3 bedrooms, so can remove from the parameter (above)
    {
        super(propertyID, streetNum, streetName, suburb, 3, currentPropertyStatus);
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public String getDetails()
    {
        String s = super.getDetails();
        s += "Last Maintenance:  " + lastMaintenanceDate + '\n';
        s += getRentalRecordDetails();
        return s;
    }

    @Override
    public String getPropertyType()
    {
        return "Premium Suite";
    }

    @Override
    public double getRentalRate()
    {
        return 554;
    }

    @Override
    public boolean rent(String customerID, DateTime rentDate, int numOfRentDay)
    {
        return false;
    }
}