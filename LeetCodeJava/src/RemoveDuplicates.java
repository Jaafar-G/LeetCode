import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {


    // Main method to print out result of solution
    public static void main(String[] args) {

        // test variable initialized
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        // calls method and prints out the result
        System.out.println(removeDuplicates(nums));
    }

    // Given an integer array nums sorted in non-decreasing order, remove
    // the duplicates in-place such that each unique element appears only once.
    // The relative order of the elements should be kept the same. Then
    // return the number of unique elements in nums.
    public static int removeDuplicates(int[] nums) {

        if (nums.length==0)
            return 0;

        // local variables, start at 1 since 0th element cant be duplicate
        int unique = 1;

        // for loop to iterate through array
        for ( int i = 0; i < nums.length-1; i++ )
        {
            // if condition to see wethere value is duplicate
            // since values are not decreasing in order
            if ( nums[i] < nums[i+1] )
            {
                // set different value to index after iteration
                // and increase unique value counter for array size
                nums[unique] = nums[i+1];
                unique++;
            }
        }
        // return unique number of nums
        return unique;
    }
}
