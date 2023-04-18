public class GoodPairs {

    // Main method to print out result of numIdenticalPairs
    public static void main(String[] args) {

        // Create array that will be passed as param to method
        int[]  nums = new int[]{1,2,3,1,1,3};

        // calls method and prints out the result
        System.out.println((numIdenticalPairs(nums)));
    }

    // Given an array of integers nums, return the number of good pairs.
    // A pair (i, j) is called good if nums[i] == nums[j] and i < j.
    public static int numIdenticalPairs(int[] nums) {

        // local variable to keep track of number of good pairs
        int answer = 0;

        // for loop to iterate through nums from index 0 to end
        for (int i = 0; i < nums.length; i++){

            // nested loop to iterate through the second element of nums to end
            for (int j = 1; j <nums.length; j++){

                // conditional statement to check that num at index i is
                // equal to num at index j
                if ( nums[i] == nums[j] ){

                    // conditional statement to check if i < j
                    if ( i < j ){

                        // if conditions are met the answer is incremented
                        // to represent the number of good pairs in array
                        answer++;
                    }
                }
            }
        }

        // returns the number of good pairs
        return answer;
    }
}
