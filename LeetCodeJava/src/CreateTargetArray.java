import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray
{
    // Main method to print out result of solution
    public static void main(String[] args)
    {

        //local vars for param
        int[] nums = new int[]{1};
        int[] index = new int[]{0};


        // calls method and prints out the result
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }


//    Given two arrays of integers nums and index. Your task is to
//    create target array under the following rules:
//    Initially target array is empty.
//    From left to right read nums[i] and index[i], insert at
//    index index[i] the value nums[i] in target array.
//    Repeat the previous step until there are no elements to read in nums and index.

    public static int[] createTargetArray(int[] nums, int[] index)
    {
        // create arraylist to fill other array
        ArrayList<Integer> arrayList = new ArrayList<>();

        // local var to store result
        int[] result = new int[nums.length];

        // for loop to iterate through arrayList,
        // while assigning the correct values
        for (int i = 0; i < result.length; i++)
        {
            // arraylist is used as it adds element to
            // correct index, and if there is a current
            // element at index it increments the current
            // element to the index after
            arrayList.add(index[i], nums[i]);
        }
        for (int i = 0; i < result.length; i++)
        {
            // copy elements of arraylist that are
            // in correct order into result array
            result[i] = arrayList.get(i);
        }
        // return result
        return result;
    }
}
