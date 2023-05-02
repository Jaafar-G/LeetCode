import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies
{


    // Main method to print out result of solution
    public static void main(String[] args)
    {
        // local vars
        // input parameter
        int[] candies = new int[]{4,2,1,1,2};
        int extraCandies = 1;


        // calls method and prints out the result
        System.out.println(kidsWithCandies( candies, extraCandies) );
    }

    //There are n kids with candies. You are given an integer array candies,
    // where each candies[i] represents the number of candies the ith kid has,
    // and an integer extraCandies, denoting the number of extra candies that you have.
    //Return a boolean array result of length n, where result[i] is true if,
    // after giving the ith kid all the extraCandies, they will have the greatest
    // number of candies among all the kids, or false otherwise.
    //Note that multiple kids can have the greatest number of candies.
    public static List<Boolean> kidsWithCandies( int[] candies, int extraCandies)
    {
        // local variables
        List<Boolean> result = new ArrayList<>();

        int max = 0;
        //  iterate through list to find max
        for ( int elements : candies)
        {
            // assign max as var
            max = Math.max(max, elements);
        }
            // iterate through to meet problem condition
            for (int candy : candies)
            {
                // total variable to test condition
                int total = candy + extraCandies;

                // if total is less than max number
                // in the array then add false to res
                if ( total < max  )
                {
                    result.add(false);
                }

                // if conition is met then add true
                // to the res length
                else if ( total >= max )
                {
                    result.add(true);
                }
            }
        // return result as ArrayList
        return result;
    }
}
