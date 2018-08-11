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
        Apartment apartment_bobsDungeon = new Apartment("A_BobsDungeon", "13",
                "Scream Street", "Frankston", 2,
                PropertyStatus.Available);

        // Print state
        System.out.println(apartment_bobsDungeon.toString());

        //Print details
        System.out.println(apartment_bobsDungeon.getDetails());

        // 2. Rent Apartment out
        // Print state
        apartment_bobsDungeon.rent("Alistair", new DateTime(8,8,2018), 5);

        // Print state
        System.out.println(apartment_bobsDungeon.toString());

        //Print details
        System.out.println(apartment_bobsDungeon.getDetails());



        // Test Apartment
        // 1. Create PS
        PremiumSuite premiumSuite_bobsHome = new PremiumSuite("A_BobsDungeon", "13",
                "Scream Street", "Frankston", PropertyStatus.Available, new DateTime(1,8,2018));

        // Print state
        System.out.println(premiumSuite_bobsHome.toString());

        //Print details
        System.out.println(premiumSuite_bobsHome.getDetails());

        // 2. Rent Apartment out
        // Print state
        premiumSuite_bobsHome.rent("Alistair", new DateTime(12,8,2018), 5);

        // Print state
        System.out.println(premiumSuite_bobsHome.toString());

        //Print details
        System.out.println(premiumSuite_bobsHome.getDetails());

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
