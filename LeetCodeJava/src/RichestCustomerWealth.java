public class RichestCustomerWealth
{


    // Main method to print out result of solution
    public static void main(String[] args) {

        //local var to pass as param
        int[][]  accounts = new int[][]{ {1,2,3}, {3,2,1} };


        // calls method and prints out the result
        System.out.println(maximumWealth(accounts));
    }

    // You are given an m x n integer grid accounts where accounts[i][j]
    // is the amount of money the i customer has in the j bank. Return
    // the wealth that the richest customer has.
    // A customer's wealth is the amount of money they have in all
    // their bank accounts. The richest customer is the customer
    // that has the maximum wealth.
    public static int maximumWealth( int[][] accounts)
    {
        // local variable to store result
        int result = 0;

        // for each loop to iterate through each array in accounts
        for (int[] account : accounts)
        {
            // assign sum variable inside loop to encapsulate data
            int sum =0;

            for (int i : account)
            {
                // calculate sum of each account in accounts
                sum += i;

                // if result is less than sum assign result to sum
                if ( result < sum )
                {
                    result = sum;
                }
            }
        }

        // return stored result
        return result;
    }
}
