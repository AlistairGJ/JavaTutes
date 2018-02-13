/**
 * Created by alistairgj on 6/2/18.
 */
public abstract class CellClass {

    protected double atp;
    protected double cytosol;
    protected double sodium;

    public CellClass(double atp, double cytosol, double sodium)
    {
        this.atp = atp;
        this.cytosol = cytosol;
        this.sodium = sodium;
    }

    public abstract void consumeATP(double concentrationATP, double seconds);

    public abstract void expelSodium(double concentrationSodium, double seconds);

    public String toString()
    {
        return "nM of ATP = " + atp + ", nM of Sodium = " + sodium +
                ", nL of Cytosol " + cytosol;
    }

}
