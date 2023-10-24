import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle
{


    // Main method to print out result of solution
    public static void main(String[] args)
    {

        //test variable
        int numRows = 5;

        // calls method and prints out the result
        System.out.println(generate(5));
    }

    //
    //
    public static List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> ans = new ArrayList<>();

        if ( ans.size() > numRows)
        {
            return ans;
        }
        return ans;
    }
}
