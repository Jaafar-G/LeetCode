import java.util.Arrays;


// solution to problem LeftRightDifference
public class LeftRightDifference {

    // // Main method to print out result of solution
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int[] nums = new int[]{10,4,8,3};

        // calls method and prints out the result
        System.out.println(leftRightDifference(nums));

    }

    // method to solve prompt
    public static int[] leftRightDifference(int[] nums){

        // local variables
        int[] ans = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        //array for leftSum
        for (int i =0; i < nums.length; i ++){
            if ( i==0 ){
                leftSum[0] =0;
            }
            else {
                leftSum[i] = nums[i-1] + leftSum[i-1];
            }
        }

        //
        for (int i = nums.length-1; i >= 0 ; i--){
            if ( i == nums.length-1){
                rightSum[ nums.length-1 ] = 0;
            }
            else {
                rightSum[i] = nums[i+1] + rightSum[i+1];
            }
        }

        for ( int n = 0; n < ans.length; n++){
            ans[n] = Math.abs(leftSum[n] - rightSum[n]);
        }
        return ans;
    }
}
