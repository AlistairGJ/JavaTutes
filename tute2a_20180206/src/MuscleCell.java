/**
 * Created by alistairgj on 6/2/18.
 */
public class MuscleCell extends Cell {

    public MuscleCell(double atp, double cytosol, double sodium)
    {
        super(atp, cytosol, sodium);
    }

    public void consumeATP(double concentrationATP, double seconds)
    {
        this.atp -= concentrationATP - seconds * 1.6; // 1.6 nm atp per second
    }

    public void expelSodium(double concentrationSodium, double seconds)
    {
        this.sodium += concentrationSodium + seconds * 2; // 2 nm Na per second
    }

}
