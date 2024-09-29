/*
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
            return "";
        }
        
        StringBuilder ans = new StringBuilder();
        
        // For traversing all characters of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            boolean match = true;

            // For comparing ch with the rest of the strings
            for (int j = 1; j < strs.length; j++) {
                // Check if the current string is shorter or characters don't match
                if (strs[j].length() <= i || strs[j].charAt(i) != ch) {
                    match = false;
                    break;
                }
            }

            if (!match) {
                break;
            } else {
                ans.append(ch);
            }
        }
        
        return ans.toString();
    }
}
