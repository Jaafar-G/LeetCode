import java.util.Arrays;

// solution to problem GetConcatenation
public class GetConcatenation {

    // Main method to print out result of solution
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int nums[] = new int[]{0,1,2,3,4,5,6,7,8,9,10};

        // calls method and prints out the result
        System.out.println(Arrays.toString(getConcatenation(nums)));

    }
    public static int[] getConcatenation(int[] nums){
        int[] ans = new int[nums.length*2];
        int n = nums.length;
        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}
