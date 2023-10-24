import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConvertArrayInto2D
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // local var to pass as param
        int[] nums = new int[]{1,3,4,1,2,3,1};


        // calls method and prints out the result
        System.out.println(findMatrix(nums));
    }

    // You are given an integer array nums.
    // You need to create a 2D array from nums
    // satisfying the following conditions:
    // The 2D array should contain only the
    // elements of the array nums.
    // Each row in the 2D array contains
    // distinct integers.
    // The number of rows in the 2D array
    // should be minimal.
    public static List<List<Integer>> findMatrix(int[] nums)
    {
        // create var to store result
        List<List<Integer>> result = new ArrayList<>();

        // create hashmap for fastest solution
        HashMap map = new HashMap<>();
        


        // return result
        return result;
    }
}
