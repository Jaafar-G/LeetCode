import java.util.Arrays;

// solution to problem Build Array
public class BuildArray {

    // Main method to print out result of solution
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int nums[] = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        // calls method and prints out the result
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    // method to solve prompt
    public static int[] buildArray(int[] nums) {

        // local variables
        int[] ans = new int[nums.length];

        // for loop that iterates through nums array starting from element 0 to end
        for (int i = 0; i < nums.length; i++) {

            // assign each element of param array to corresponding element of ans array
            ans[i] = nums[nums[i]];
        }

        // returns the answer array
        return ans;
    }
}
