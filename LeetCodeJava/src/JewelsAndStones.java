import java.util.HashMap;

public class JewelsAndStones
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // local vars to pass as params
        String jewels = "aA";
        String stones = "aAAbbbb";


        // calls method and prints out the result
        System.out.println(numJewelsInStones(jewels, stones));
    }

    //You're given strings jewels representing the types of stones that are jewels,
    // and stones representing the stones you have. Each character in stones is a
    // type of stone you have. You want to know how many of the stones you have are also jewels.
    //Letters are case-sensitive, so "a" is considered a different type of stone from "A".

    public static int numJewelsInStones( String jewels, String stones )
    {
        // local variable for result
        int result = 0;

        // loop to iterate throught string
        for ( int i = 0; i < stones.length(); i++ )
        {
            // if condition to count jewels in stones
            if ( jewels.indexOf(stones.charAt(i)) > -1 )
         {
             result++;
         }
        }
        // return answer
        return result;
    }
}
