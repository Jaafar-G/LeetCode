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

    // 1470. Shuffle the Array
    // Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    //Return the array in the form [x1,y1,x2,y2,...,xn,yn].
    public static int[] shuffle(int[] nums, int n) {

        //local variables
        int[] ans = new int[nums.length];
        int evenCount = 0;

        // for loop that iterates through array starting from element 0 to end
        for (int i = 0; i < ans.length; i++) {

            // conditional statement that checks to see if current index i is even
            if (i % 2 == 0) {

                // if even then place element from first half of array into current index
                ans[i] = nums[evenCount];

                // increment var that corresponds to the index of even numbers
                evenCount++;
            }

            // if current index i is odd then execute this code block
            else {

                // assign odd index to the var n which is half of array size
                ans[i] = nums[(n)];

                // increment the var that corresponds to the second half of array
                n++;
            }
        }

        // returns answer array
        return ans;
    }
}
