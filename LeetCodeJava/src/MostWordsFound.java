public class MostWordsFound
{

    // Main method to print out result of solution
    public static void main(String[] args) {

        // local var to pass as param
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};

        // calls method and prints out the result
        System.out.println(mostWordsFound(sentences));
    }

    //A sentence is a list of words that are separated by
    // a single space with no leading or trailing spaces.
    //You are given an array of strings sentences, where
    // each sentences[i] represents a single sentence.
    //Return the maximum number of words that appear
    // in a single sentence.

    public static int mostWordsFound(String[] sentences) {
        // local var to store result
        int result = 0;

        // for loop to iterate through each element in sentences
        for (int i = 0; i < sentences.length; i++) {
            // split each sentence into array of words
            String[] words = sentences[i].split(" ");

            // Math.max to find largest of element of words
            // set result equal to the largest element
            result = Math.max(result, words.length);
        }

        // return result of func
        return result;
    }
}
