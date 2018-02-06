/**
 * Created by alistairgj on 6/2/18.
 */
import java.util.ArrayList;
public class CellSimulator {

    public static void main(String[] args)
    {
        MuscleCell muscleCell1 = new MuscleCell(10, 500, 8);
        MuscleCell muscleCell2 = new MuscleCell(20, 250, 2);
        NerveCell nerveCell1 = new NerveCell(2, 400, 50);
        NerveCell nerveCell2 = new NerveCell(8, 200, 45);

        ArrayList<Cell> cells = new ArrayList<>();
        cells.add(muscleCell1);
        cells.add(muscleCell2);
        cells.add(nerveCell1);
        cells.add(nerveCell2);

        for (Cell cell: cells)
        {
            System.out.println(cell.toString());
        }

        for (Cell cell: cells)
        {
            cell.consumeATP(10, 20);
        }

        for (Cell cell: cells)
        {
            System.out.println(cell.toString());
        }

        for (Cell cell: cells)
        {
            cell.expelSodium(15, 20);
        }

        for (Cell cell: cells)
        {
            System.out.println(cell.toString());
        }
    }




}
