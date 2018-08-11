import utilities.DateTime;

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
    private RentalRecord[] rentalHistory; //As per instruction MUST be type array (list would have allowed
    //old values to drop without extra code...
    private int countOfRecord;

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
        this.rentalHistory = new RentalRecord[10];
        countOfRecord = 0; //Count will always start at 0 for our system
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

    public abstract String getPropertyType();

    //Placeholder for countOfRecord accessor!

    public abstract double getRentalRate(); //Abstract because 'rental property' doesn't
    //"know what this is" BUT the subclasses do "know what this is"
    //Method to construct the ID - MUST be unique

    public void addRentalRecord(RentalRecord newRecord)
    {
        if (countOfRecord == 10)
        {
            countOfRecord = 9;
        }

        for (int index = countOfRecord; index >= 1; index--)
        {
            rentalHistory[index] = rentalHistory[index - 1];
        }

        rentalHistory[0] = newRecord;
        countOfRecord++;
    }

    //Logic for loop above
    // Count = 0
    // if count = 0
    // add at index 0
    // count
    // count = 1
    // if count = 1
    // move 0 to 1
    // add at index 0
    // count
    // if count = 2
    // move 1 to 2
    // move 0 to 1
    // add at index 0
    // count
    // if count = 3
    // move index 2 to 3
    // move index 1 to 2
    // move index 0 to 1
    // add at index 0 nb


    //"Conditions for renting"
    public abstract boolean rent(String customerID, DateTime rentDate, int numOfRentDay);

    protected void doRent(String customerID, DateTime rentDate, int numOfRentDay)
    {
        //1. Updating the property status, COMMON
        currentPropertyStatus = PropertyStatus.Rented;

        //2. Creating a new rental record, COMMON
        // Call the RentalRecord constructor

        double rentalFee = getRentalRate() * numOfRentDay;

        DateTime estReturnDate = new DateTime(rentDate, numOfRentDay);

        RentalRecord aRecordi = new RentalRecord(rentDate, estReturnDate,
                null, rentalFee,
                0.0, customerID, propertyID);

        //3. Updating the rental record array, COMMON
        addRentalRecord(aRecordi);

        //4. and any other operations you consider necessary.
        // From checking the rest of this class, nothing else
    }

    public String toString()
    {
        String s = propertyID + ":" + streetNum + ":" + streetName + ":" +
                suburb + ":" + getPropertyType() + ":" + numBedrooms + ":" +
                currentPropertyStatus;

        return s;
    }

    public String getDetails()
    {
        String s = "Property ID:       " + propertyID + '\n';
        s +=       "Address:           " + streetNum + " " + streetName + " " + suburb + '\n';
        s +=       "Type:              " + getPropertyType() + '\n';
        s +=       "Bedroom:           " + numBedrooms + '\n';
        s +=       "Status:            " + currentPropertyStatus + '\n';
        return s;
    }

    protected String getRentalRecordDetails()
    {
        String s =  "RENTAL RECORD" + (countOfRecord == 0 ? ":     empty" : "") + '\n';

        for (int index = 0; index < countOfRecord; index++)
        {
            s += rentalHistory[index].getDetails(); //We now 'have access' to all the stuff in rental rec.
            s += "--------------------------------------";
        }
        return s;
    }

}





    /*void constructID(){
        String Apartment;
        if(propertyType == Apartment)
            ();//allocate A_
        else {
            //allocate S_
            ();
        }
    }*/