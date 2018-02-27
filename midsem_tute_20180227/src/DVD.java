/**
 * Created by alistairgj on 27/2/18.
 */
public abstract class DVD extends Movie
{
    private boolean specialFeatures;

    public DVD (int id, String title, boolean specialFeatures) //Constructor - compulsory parameters in ()
    {
        super(id, title);
        this.specialFeatures = specialFeatures;
    }

    public DVD (int id, String title, boolean specialFeatures, int year) //Overloading the constructor
    {
        super(id, title, year);
        this.specialFeatures = specialFeatures;
    }

    public boolean isSpecialFeatures()
    {
        return specialFeatures;
    }

}
