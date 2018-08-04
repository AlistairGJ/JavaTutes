
public abstract class PremiumSuite extends RentalProperty
{
    //Constructor
    public PremiumSuite(String propertyID, String streetNum, String streetName,
                     String suburb, PropertyStatus currentPropertyStatus)
    //Super because we are calling the constructor from the super class
    //Premium suite always has 3 bedrooms, so can remove from the parameter (above)
    {
        super(propertyID, streetNum, streetName, suburb, 3, currentPropertyStatus);
    }

    @Override
    public double getRentalRate()
    {
        return 554;
    }
}