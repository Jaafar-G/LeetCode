import java.util.Arrays;
import java.util.HashMap;

public class ShuffleString
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        //local variables used as params to test method
        String s = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};

        // calls method and prints out the result
        System.out.println(restoreString(s,indices));
    }

    //You are given a string s and an integer array indices of the same length.
    // The string s will be shuffled such that the character at the ith position
    // moves to indices[i] in the shuffled string.
    public static String restoreString(String s, int[] indices)
    {
        char[] charArr = new char[indices.length];

        for ( int i = 0; i < indices.length; i++ )
        {
            charArr[indices[i]] = s.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (char element: charArr
             ) {
            stringBuilder.append(element);
        }
        
        return stringBuilder.toString();
    }
}
