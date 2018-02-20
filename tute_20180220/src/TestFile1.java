/**
 * Created by alistairgj on 20/2/18.
 */


import java.util.*;
import java.io.*;

public class TestFile1
{
    public static void main(String args[]) throws IOException
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter file name : ");
        String fName = console.nextLine();
        System.out.print("Enter string to match : ");
        String match = console.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(fName));
        String s;
        System.out.println("Matching lines are ");
        s = br.readLine();
        while (s != null)
        {
            if(s.indexOf(match) >= 0)
            {
                System.out.println(s);
            }
            s = br.readLine();
        }
        br.close();
    }
}

// The program will go through the file line by line.
// If it finds a match, it will print the line.
// It will then jump to the next line