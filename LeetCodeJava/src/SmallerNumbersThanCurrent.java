import java.util.Arrays;

public class SmallerNumbersThanCurrent
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // init local var for param
        int[] nums = new int[]{8,1,2,2,3};

        // calls method and prints out the result
        System.out.println(Arrays.toString(smallerNumberThanCurrent(nums)));
    }

    // Given the array nums, for each nums[i] find out
    // how many numbers in the array are smaller than it.
    // That is, for each nums[i] you have to count the
    // number of valid j's such that j != i and nums[j] < nums[i].
    public static int[] smallerNumberThanCurrent(int[] nums)
    {
        // local var to store result
        int [] result = new int[nums.length];

        // first for loop used as pointer
        for (int i =0; i <= nums.length-1; i++)
        {
            // var to keep count of numbers less than element
            int count =0;

            // nested for loop used as second pointer
            for ( int j =0; j <= nums.length-1; j++)
            {
                // conditional statement to increment count when lower number encounter
                if (nums[i] > nums[j])
                {
                    count++;
                }
            }
            // set count at each element
            result[i] = count;
        }
        // returns result
        return result;
    }
}
