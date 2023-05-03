import java.util.Arrays;

public class DecodeXORArray
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        // local vars to poss to param
        int first = 1;
        int[] encoded = new int[]{1,2,3};

        // calls method and prints out the result
        System.out.println(Arrays.toString(decode(encoded,first)));
    }


    public static int[] decode(int[] encoded, int first)
    {
        // create array to store decoded array
        int[] decoded = new int[encoded.length+1];

        // first element of decoded always given
        // in order to calculate rest of array
        decoded[0] = first;

        // for loop to iterate through encoded
        for (int i = 1; i <= encoded.length; i++)
        {
            // to decode a XOR operation you must know
            // one of the elements that was xored since
            // we received the first number of the decoded
            // array we can xor it with the encoded element
            // to get the original element this is a
            // fundamental property of the XOR bitwise operator
            decoded[i] = decoded[i-1] ^ encoded[i-1];
        }

        // return decoded
        return decoded;
    }
}
