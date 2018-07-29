import java.util.ArrayList;

public class Apartment extends RentalProperty
{
    //Constructor
    public Apartment(String propertyID, String streetNum, String streetName,
                          String suburb, int numBedrooms, PropertyStatus currentPropertyStatus)
    //Super because we are calling the constructor from the super class
    {
        super(propertyID, streetNum, streetName, suburb, numBedrooms, currentPropertyStatus);
    }

    @Override
    public double getRentalRate()
    {
        if (getNumBedrooms() == 1)
        {
            return 143;
        }
        else if (getNumBedrooms() == 2)
        {
            return 210;
        }
        else
        {
            return 319;
        }
    }
}
