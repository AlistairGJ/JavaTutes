/**
 * Created by alistairgj on 27/2/18.
 */
public class WeeklyDVD extends DVD
{
    public int getRentalFee()
    {
        return 5;
    }

    public int getRentalPeriod()
    {
        return 7;
    }

    public WeeklyDVD (int id, String title, boolean specialFeatures) //Constructor - compulsory parameters in ()
    {
        super(id, title, specialFeatures);
    }

    public WeeklyDVD (int id, String title, boolean specialFeatures, int year) //Overloading the constructor
    {
        super(id, title, specialFeatures, year);
    }

}
