/*
Extract the Number from the String
Given a sentence containing several words and numbers. Find the largest number among them which does not contain 9. If no such number exists, return -1.
Note: Numbers and words are separated by spaces only. It is guaranteed that there are no leading zeroes in the answer.
Examples :
Input: sentence="This is alpha 5057 and 97"
Output: 5057
Explanation: 5057 is the only number that does not have a 9.

Input: sentence="Another input 9007"
Output: -1
Explanation: Since there is no number that does not contain a 9,output is -1.

Expected Time Complexity: O(n)
Expected Auxillary Space: O(n)
*/

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        
        long maxNum = -1;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isDigit(ch)) {
                // Append digit to the StringBuilder
                s.append(ch);
            } else {
                if (s.length() > 0) {
                    String numStr = s.toString();
                    if (!numStr.contains("9")) {
                        long num = Long.parseLong(numStr);
                        maxNum = Math.max(maxNum, num);
                    }
                    s.setLength(0); // Clear the StringBuilder
                }
            }
        }

        // Process the last number if the sentence ends with digits
        if (s.length() > 0) {
            String numStr = s.toString();
            if (!numStr.contains("9")) {
                long num = Long.parseLong(numStr);
                maxNum = Math.max(maxNum, num);
            }
        }

        return maxNum;
    }
}
