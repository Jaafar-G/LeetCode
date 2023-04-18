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
        int ans = 0;

        for ( int i =0; i < operations.length; i++){
            if ( operations[i].contains("+") ){
                ans++;
            }
            if ( operations[i].contains("-") ) {
                ans--;
            }
        }
        return ans;
    }
}
