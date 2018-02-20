/**
 * Created by alistairgj on 20/2/18.
 */
//public class Two
//{
//    public static void main(String args[])
//    {
//        try
//        {
//            statement1;
//            statement2;
//            statement3;
//        }
//
//        catch (Exception1 e1)
//        {
//
//        }
//
//        catch (Exception2 e2)
//        {
//
//        }
//
//        finally
//        {
//            statement4;
//        }
//
//        statement5;
//    }
//}

// Does NOT execute statement3, because the expection from statement2 has thrown us out of the try
// If the exception is NOT caught, the system will crash (exception will propagate to the OS)
// Statement 5 IS executed if the exception is caught in the catch clause
// True - statement four is executed (in general statement 4 will always be executed)