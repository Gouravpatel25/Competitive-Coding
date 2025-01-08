/*
You are given an array of strings arr of size n. You have to find out if it is possible to make a palindromic string by concatenating all the strings in any order. 
Provided that all the strings given in the array are of equal length.
Example 1:
Input:
n = 4
arr = {"djfh", "gadt", "hfjd", "tdag"}
Output:
YES
Explanation:
You can make the string "djfhgadttdaghfjd", by concatenating the given strings which is a palindrome.

Example 2:
Input:
n = 3
arr = {"jhjdf", "sftas", "fgsdf"}
Output:
NO
Explanation:
You can't make a palindromic string with this strings.
Your Task:
You don't need to read input or print anything. Your task is to complete the function makePalindrome() which takes an integer n and an array of strings arr respectively and returns true or false.

Expected Time Complexity: O(n * len(arr[i]))
Expected Space Complexity: O(n * len(arr[i]))


*/

class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        HashSet<String> set = new HashSet<>();

        // Iterate through all strings in the array
        for (int i = 0; i < n; i++) {
            StringBuilder str = new StringBuilder(arr[i]);
            String reversed = str.reverse().toString(); // Get the reverse of the current string

            // Check if the reverse is already in the set
            if (set.contains(arr[i])) {
                // Remove the reverse pair if found
                set.remove(arr[i]);
            } else {
                // Otherwise, add the reversed string to the set
                set.add(reversed);
            }
        }

        // Analyze the set size to determine if a palindrome is possible
        if (set.size() == 0) {
            return true; // All strings are paired
        } else if (set.size() > 1) {
            return false; // More than one unmatched string
        } else {
            // Exactly one unmatched string, check if it is a palindrome
            for (String s : set) {
                StringBuilder str = new StringBuilder(s);
                String reversed = str.reverse().toString();

                if (s.equals(reversed)) {
                    return true; // Single unmatched string is a palindrome
                }
            }
        }

        return false; // No valid conditions met
    }
}
