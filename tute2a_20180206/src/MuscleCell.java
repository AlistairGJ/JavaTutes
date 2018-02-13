

public class MuscleCell extends CellClass {

    private double calcium;

    public MuscleCell(double atp, double cytosol, double calcium)
    {
        super(atp, cytosol, 6);
        this.calcium = calcium;
    }

    public void consumeATP(double concentrationATP, double seconds)
    {
        this.atp -= concentrationATP - seconds * 1.6; // 1.6 nm atp per second
    }

    public void expelSodium(double concentrationSodium, double seconds)
    {
        this.sodium += concentrationSodium + seconds * 2; // 2 nm Na per second
    }

    public String toString()
    {
        String s = "";
        s += super.toString();
        s += " Calcium = " + calcium;
        return s;
    }

}
