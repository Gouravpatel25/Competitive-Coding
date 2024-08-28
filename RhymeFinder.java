/*
Given an array, String arr = {"gender", "blender", "blunder", "under"}

Input string is "thunder".
From the array, return the word that rhymes the most with the given word.
If two words rhyme the most, then return the word with fewer characters (for example, between "blunder" and "under", the output will be "under").
Example:

Input:

N = 4
Arr = ["gender", "blender", "blunder", "under"]
Input String = "thunder"
Output:

"under"

*/

public class RhymeFinder {

    // Method to find the word that rhymes the most with the input word
    public static String findRhymingWord(String[] arr, String input) {
        String bestMatch = "";
        int maxSuffixLength = 0;

        for (String word : arr) {
            int suffixLength = findCommonSuffixLength(word, input);

            // Check if this word has a longer suffix or if it has the same length but fewer characters
            if (suffixLength > maxSuffixLength || 
               (suffixLength == maxSuffixLength && word.length() < bestMatch.length())) {
                bestMatch = word;
                maxSuffixLength = suffixLength;
            }
        }

        return bestMatch;
    }

    // Method to find the length of the common suffix between two words using a while loop
    private static int findCommonSuffixLength(String word, String input) {
        int wordIndex = word.length() - 1;
        int inputIndex = input.length() - 1;
        int suffixLength = 0;

        // Continue while both indices are valid and characters match
        while (wordIndex >= 0 && inputIndex >= 0 && word.charAt(wordIndex) == input.charAt(inputIndex)) {
            suffixLength++;
            wordIndex--;
            inputIndex--;
        }

        return suffixLength;
    }

    public static void main(String[] args) {
        String[] arr = {"gender", "blender", "blunder", "under"};
        String input = "thunder";
        
        String result = findRhymingWord(arr, input);
        System.out.println(result);  // Output: under
    }
}
