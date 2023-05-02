// Kadanes algo
public class MaximumSubarray {
    // Main method to print out result of solution
    public static void main(String[] args) {

        // local variable for testing
        int[] nums = new int[]{ -2,1,-3,4,-1,2,1,-5,4 };

        // calls method and prints out the result
        System.out.println(maxSubArray(nums));
    }


    //Given an integer array nums, find the subarray
    //with the largest sum, and return its sums
    public static int maxSubArray( int[] nums)
    {
        // declaring a new array to represent the result
        int sum = 0;
        int minC = Integer.MIN_VALUE;
        int i = 0;

        // while loop to iterate through nums array
        while( i < nums.length )
        {
            // conditional statements that orders elements
            if ( sum < 0 && ( nums[i] >= sum ) )
            {
                sum = 0;
            }
            // finds sum of numbers in sub array
            sum+= nums[i];

            minC = Math.max(minC, sum);
            i++;
        }
        //return answer
        return minC;
    }
}
