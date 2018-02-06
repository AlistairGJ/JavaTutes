/**
 * Created by alistairgj on 6/2/18.
 */
public class NerveCell extends Cell{

    public NerveCell(double atp, double cytosol, double sodium)
    {
        super(atp, cytosol, sodium);
    }

    public void consumeATP(double concentrationATP, double seconds)
    {
        this.atp -= concentrationATP - seconds * .2; // .2 nm atp per second
    }

    public void expelSodium(double concentrationSodium, double seconds)
    {
        double Rate = 5; // Default of 5 nm per second
        if (cytosol > 300)
        {
            Rate = 2;
        }
        this.sodium += concentrationSodium + seconds * Rate; // 5 nm Na per second

    }



}
