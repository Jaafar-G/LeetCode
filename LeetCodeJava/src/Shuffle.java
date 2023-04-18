import java.util.Arrays;


// solution to problem shuffle
public class Shuffle {

    // Main method to print out result of solution
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int[] nums = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        // calls method and prints out the result
        System.out.println(Arrays.toString(shuffle(nums, 1)));

    }

    // method to solve prompt
    public static int[] shuffle(int[] nums, int n) {

        //local variables
        int[] ans = new int[nums.length];
        int evenCount = 0;

        // for loop that iterates through array starting from element 0 to end
        for (int i = 0; i < ans.length; i++) {

            // conditional statement that
            if (i % 2 == 0) {
                ans[i] = nums[evenCount];
                evenCount++;
            }

            //
            else {
                ans[i] = nums[(n)];
                n++;
            }
        }

        // returns answer array
        return ans;
    }
}
