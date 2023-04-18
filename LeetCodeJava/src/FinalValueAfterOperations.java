import java.util.Arrays;

// solution to problem FinalValueAfterOperations
public class FinalValueAfterOperations {

    // Main method to print out result of solution
    public static void main(String[] args) {

        // creates array to be passed in as parameter
        String[] operations = new String[]{"--X","X++","X++"};

        // calls method and print out the result
        System.out.println(finalValueAfterOperations(operations));
    }

    //solution to Final Value of Variable After Performing Operations
    public static int finalValueAfterOperations(String[] operations){

        // local variables
        int ans = 0;

        // for loop that iterates through array starting from element 0 to end
        for ( int i =0; i < operations.length; i++){

            //condition that adds 1 to answer everytime an element contains a "+"
            if ( operations[i].contains("+") ){
                ans++;
            }

            //condition that subtracts 1 to answer everytime an element contains a "-"
            if ( operations[i].contains("-") ) {
                ans--;
            }
        }
        // returns integer ans
        return ans;
    }
}
