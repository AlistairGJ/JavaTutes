/**
 * Created by alistairgj on 21/2/18.
 */
public class ReverseArray
{

    public static Object[] reverse(Object[] array)
    {
        Object[] newArray = new Object[array.length];

        for(int source = array.length; source > 1; source--)
        {
            int destination = 0;
            newArray[destination] = array[source];
        }
        return newArray;
    }


    // Don't need TWO LOOPS, just need TWO COUNTERS (one points to SOURCE, copy &
    // one points to DESTINATION, paste)

    public static void main(String args[])
    {
        Integer[] newArray = new Integer[6];

        newArray[0] = new Integer(2);
        newArray[1] = new Integer(4);
        newArray[2] = new Integer(1);
        newArray[3] = new Integer(10);
        newArray[4] = new Integer(15);
        newArray[5] = new Integer(20);

        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i]);
        }

        ReverseArray.reverse(newArray);

        for (int i = 0; i < newArray.length; i++)
        {
            System.out.println(newArray[i]);
        }

    }
}

// "Array of objects comes in, array of objects comes out"