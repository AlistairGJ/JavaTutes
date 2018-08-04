import utilities.CalendarUtils;
import utilities.DateTime;

/**
 * Created by alistairgj on 28/7/18.
 */
public class TestHarness //Should this class be called main??? (no...)
{
    public static void main(String[] args)
    {
        // DateTime Harness
        // Need constructor
        //DateTime harnessDateTime = new DateTime(2);
        //int dayOfWeek = CalendarUtils.getDayOfWeek(harnessDateTime);
        //System.out.println(dayOfWeek);

        // Test Apartment
        // 1. Create Apartment(s)
        Apartment apartment = new Apartment("A_BobsDungeon", "13",
                "Scream Street", "Frankston", 2,
                PropertyStatus.AVAILABLE);

        // Print state
        System.out.println(apartment.toString());

        // 2. Rent Apartment out
        // Print state
        // 3. Check Apartment in
        // Print state
        // 4. Perform maintenance
        // Print state
        // 5. End maintenance
        // Print state

        // RentalRecord Harness
//        DateTime harnessRentDate = new DateTime(2);
//        DateTime harnessEstimatedReturnDate = new DateTime(6);
//        DateTime harnessActualReturnDate = new DateTime(5);
//        RentalRecord harnessRentalRecord = new RentalRecord(harnessRentDate,
//                harnessEstimatedReturnDate,
//                //harnessActualReturnDate,
//                null,
//                150,
//                15,
//                "AlistairGJ",
//                "LeeStreet");
//
//        System.out.println(harnessRentalRecord.toString());

    }
    // Calendar utils has been tested =)

}
