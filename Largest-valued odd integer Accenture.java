/*
Given a string S, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string S.
Note: A substring is a contiguous sequence of characters within a string. A null string ("") is also a valid substring.
Example 1:
Input: S = "504"
Output: "5"
Example 2:
Input: S = "30752"
Output: "3075"
*/

class Solution {
    public String largestOddNumber(String S) {
        
        for (int i = S.length() - 1; i >= 0; i--) {
            char currentChar = S.charAt(i);
           
            if ((currentChar - '0') % 2 == 1) {
                return S.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        String S1 = "504";
        System.out.println(solution.largestOddNumber(S1));  // Output: "5"
        
        // Example 2
        String S2 = "30752";
        System.out.println(solution.largestOddNumber(S2));  // Output: "3075"
    }
}
