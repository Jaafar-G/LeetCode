import java.util.Arrays;

public class RunningSum
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // local vars to pass to param
        int[] nums = new int[]{1,2,3,4};

        // calls method and prints out the result
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    //Given an array nums. We define a running sum of an
    // array as runningSum[i] = sum(nums[0]…nums[i]).
    //Return the running sum of nums.
    public static int[] runningSum( int[] nums)
    {
        // local variables to store result
        int[] result = new int[nums.length];

        // these values will always be the same
        // due to nature of problem
        result[0] = nums[0];

        // for loop to assign each value
        for ( int i = 1; i <= result.length-1; i++ )
        {
            // calculation
            result[i] = nums[i] + result[i-1] ;
        }

        // recursive call
        return result;
    }
}
