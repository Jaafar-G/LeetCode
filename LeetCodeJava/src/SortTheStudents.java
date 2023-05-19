import java.util. *;

public class SortTheStudents {


    // Main method to print out result of solution
    public static void main(String[] args) {

        // test data to pass as parameters for test case
        int[][] score = new int[][] { {10,6,9,1}, {7,5,11,2}, {4,8,3,15} };
        int k = 2;


        // calls method and prints out the result
        System.out.println((Arrays.deepToString(sortTheStudents(score, k))));
    }

    //There is a class with m students and n exams.
    // You are given a 0-indexed m x n integer matrix score,
    // where each row represents one student and score[i][j]
    // denotes the score the ith student got in the jth exam.
    // The matrix score contains distinct integers only.
    //You are also given an integer k. Sort the students (
    // i.e., the rows of the matrix) by their scores in the kth
    // (0-indexed) exam from the highest to the lowest.
    public static int[][] sortTheStudents(int[][] score, int k)
    {
        // create an array to store elements
        // create hashmap to map K,V pairs
        int[] kElements = new int[score.length];
        HashMap map = new HashMap<>();

        // for loop to iterate through the score and
        // add each element at kth element to
        // hashmap. Hashmap used for fast access
        // as well as associated kth element with
        // index of kth element
        for ( int i =0; i < score.length; i++ )
        {
            kElements[i] = score[i][k];
            map.put(kElements[i], score[i]);

        }

        // sort array with best time complexity
        Arrays.sort(kElements);

        // two pointer for loop to maximize efficiency
        // first pointer to iterate forward through first
        // array of matrix second pointer to iterate
        // backward through sorted array to grab greatest element
        // hasmap used for most efficient access of K,V pair
        // score reused for maximum memory efficiency
        for ( int i = score.length-1, j=0 ; i >= 0; i-- )
        {
            score[j] = (int[]) map.get(kElements[i]);
            j++;
        }

        // return sorted matrix for answer
        return score;
    }
}
