import utilities.CalendarUtils;
import utilities.DateTime;

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
    public String getPropertyType()
    {
        return "Apartment";
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

    //"Conditions for renting"
    public boolean rent(String customerID, DateTime rentDate, int numOfRentDay)
    {
        if (getCurrentPropertyStatus() != PropertyStatus.Available)
        {
            return false;
        }

        if (CalendarUtils.getDayOfWeek(rentDate) >= CalendarUtils.SUNDAY &&
                CalendarUtils.getDayOfWeek(rentDate) <= CalendarUtils.THURSDAY &&
                numOfRentDay < 2)
        {
            return false;
        }

        if (CalendarUtils.getDayOfWeek(rentDate) >= CalendarUtils.FRIDAY &&
                CalendarUtils.getDayOfWeek(rentDate) <= CalendarUtils.SATURDAY &&
                numOfRentDay < 3)
        {
            return false;
        }

        if (numOfRentDay > 28)
        {
            return false;
        }

        //1. Updating the property status, COMMON
        //2. Creating a new rental record, COMMON
        //3. Updating the rental record array, COMMON
        //4. and any other operations you consider necessary.

        // We will add a ... (method)

        doRent(customerID, rentDate, numOfRentDay);

        return true;
    }

    public String getDetails()
    {
        String s = super.getDetails();
        s += getRentalRecordDetails();
        return s;
    }

}

