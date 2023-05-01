import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {


    // Main method to print out result of solution
    public static void main(String[] args) {

        // local variables for parameters
        int[] candies = new int[]{2,3,5,1,3};
        int extraCandies = 3;

        // calls method and prints out the result
        System.out.println(kidswithCan(candies, extraCandies));

        // Output: [true,true,true,false,true]

    }

    // 1431. Kids With the Greatest Number of Candies
    // There are n kids with candies. You are given an integer array candies,
    // where each candies[i] represents the number of candies the ith kid has,
    // and an integer extraCandies, denoting the number of extra candies that you have.
    // Return a boolean array result of length n, where result[i] is true if,
    // after giving the ith kid all the extraCandies, they will have the
    // greatest number of candies among all the kids, or false otherwise.
    // Note that multiple kids can have the greatest number of candies.
    public static List<Boolean> kidswithCan( int[] candies, int extraCandies){

        // local variables for parameters
        int size = candies.length;
        System.out.println(size);

        ArrayList<Boolean> result = new ArrayList<>();

        // for loop to iterate through the int array candies
        for ( int i = 0 ; i < candies.length; i++ ){

            //for loop to iterate through the int array candies
            for (int j =0; j < candies.length; j++){

                // conditional statement to see if
                if( (candies[i] + extraCandies) <= candies[j] ){

                    result.set(i, false);
                    break;
                }

                // set index to true if
                //result.add(true);
            }
        }
        // return list of
        return result;
    }
}
