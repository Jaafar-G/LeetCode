public class DefangingIPAddress
{


    // Main method to print out result of solution
    public static void main(String[] args)
    {

        // Test Variable
        String  address = "1.1.1.1";

        // calls method and prints out the result
        System.out.println(lastTwo(address));
    }

    public static String lastTwo(String str)
    {
        // Local Variables
        int length = str.length();
        char last = str.charAt(length-1);
        char secondLast = str.charAt(length-2);



    }
}
