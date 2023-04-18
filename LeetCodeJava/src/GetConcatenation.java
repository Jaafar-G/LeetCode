import java.util.Arrays;

// solution to problem GetConcatenation
public class GetConcatenation {

    // Main method to print out result of solution
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        // calls method and prints out the result
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }

    // method to solve prompt
    public static int[] getConcatenation(int[] nums){

        //local variables
        int[] ans = new int[nums.length*2];
        int n = nums.length;

        // for loop that iterates through array starting from element 0 to end
        for (int i = 0; i < nums.length; i++){

            // assign each element of param array to corresponding element of answer array
            ans[i] = nums[i];

            // assign each element of param array to second half of answer array to mimic concatenation
            ans[i + n] = nums[i];
        }

        // returns answer array
        return ans;
    }
}
