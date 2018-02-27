import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by alistairgj on 27/2/18.
 */
public abstract class Movie
{
    private int id;
    private String title;
    private int year;
    private boolean available;
    private int numDaysOut;


    public Movie (int id, String title) //Constructor - compulsory parameters in ()
    {
        this.id = id;
        this.title = title;
    }

    public Movie (int id, String title, int year) //Overloading the constructor
    {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public abstract int getRentalPeriod(); // Details of how works up to subclass

    public abstract int getRentalFee(); // Subclass implementation

    public int getId() // Standard accessor
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year) // SETTER - 'Garden Variety' setter
    {
        this.year = year;
    }

    public boolean isAvailable()
    {
        return available;
    }

    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public int getNumDaysOut()
    {
        return numDaysOut;
    }

    public void setNumDaysOut(int numDaysOut)
    {
        this.numDaysOut = numDaysOut;
    }

    public int calcLateFee() // Brackets () indicate method (even if empty)
    {
        int numDaysLate = numDaysOut - getRentalPeriod();
        int lateFee = numDaysLate * getRentalFee();
        return lateFee;
    }

}
