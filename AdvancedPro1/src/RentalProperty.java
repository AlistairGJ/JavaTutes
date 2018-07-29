import java.util.ArrayList;

/**
 * Created by alistairgj on 28/7/18.
 */

//The RentalProperty class has 7 attributes and 2 methods

abstract class RentalProperty //Abstract class as will never instantiate 'property'
{
    //Defining the ATTRIBUTES
    private String propertyID; //Need to add Apartment ID (A_) or Premium ID (S_)
    private String streetNum; //Could be 55A
    private String streetName;
    private String suburb;
    private int numBedrooms; //ONLY 1, 2 or 3
    //private String propertyType; //ONLY Apartment (A_) or Premium Suite (S_)
    //Property type will not be a field (this will come from CLASS)
    //"Instead of checking by field, you check by asking 'instance of' ANS = 'Instance
    //of one of the classes' - more flexibility
    private PropertyStatus currentPropertyStatus; //ONLY Available, Rented, Maintenance
    private ArrayList<RentalRecord> rentalHistory;

    //Constructor
    public RentalProperty(String propertyID, String streetNum, String streetName,
                          String suburb, int numBedrooms, PropertyStatus currentPropertyStatus)
    //Create Constructor (which is taking 6 arguments)
    {
        this.propertyID = propertyID;
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.suburb = suburb;
        this.numBedrooms = numBedrooms;
        this.currentPropertyStatus = currentPropertyStatus;
        this.rentalHistory = new ArrayList<RentalRecord>();
    }

    //Need accessors - getters
    public String getPropertyID()
    {
        return propertyID;
    }

    public String getStreetNum()
    {
        return streetNum;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public String getSuburb()
    {
        return suburb;
    }

    public int getNumBedrooms()
    {
        return numBedrooms;
    }

    public PropertyStatus getCurrentPropertyStatus()
    {
        return currentPropertyStatus;
    }

    public abstract double getRentalRate(); //Abstract because 'rental property' doesn't
    //"know what this is" BUT the subclasses do "know what this is"

    //Method to construct the ID - MUST be unique
    /*void constructID(){
        String Apartment;
        if(propertyType == Apartment)
            ();//allocate A_
        else {
            //allocate S_
            ();
        }
    }*/



}
