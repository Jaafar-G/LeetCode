import java.util.*;

public class GroupThePeople
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // test data to pass as parameters for test case
        int[] groupSizes = new int[]{3,3,3,3,3,1,3};

        // calls method and prints out the result
        System.out.println(groupThePeople(groupSizes));
    }

    //You are given an integer array groupSizes, where groupSizes[i]
    // is the size of the group that person i is in. For example,
    // if groupSizes[1] = 3, then person 1 must be in a group of size 3.
    public static List<List<Integer>> groupThePeople (int[] groupSizes)
    {
        // create var to store the result
        // create var to store entries
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for ( int i = 0; i < groupSizes.length; i++ )
        {
            map.putIfAbsent(groupSizes[i], new ArrayList<Integer>());
            map.get(groupSizes[i]).add(i);
        }
        // return result
        return result;
    }
}
