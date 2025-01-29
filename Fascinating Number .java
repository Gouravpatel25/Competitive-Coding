/*
Given a number n. Your task is to check whether it is fascinating or not.
Fascinating Number: A number with 3 or more digits is considered fascinating if, when it is multiplied by 2 and 3, and the resulting products are concatenated with the original number, 
the final sequence contains all the digits from 1 to 9 exactly once.

Note:  If a number is fascinating, return true. Otherwise, return false.

Examples:
Input: n = 192
Output: true
Explanation: After multiplication with 2 and 3, and concatenating with original number, number will become 192384576 which contains all digits from 1 to 9.

Input: n = 853
Output: false
Explanation: It is not a fascinating number
*/

class Solution {
    boolean fascinating(long n) {
        // code here
        
        if (n < 100) {
            return false;
        }
        
        // Multiply the number by 2 and 3
        long pro1 = n * 2;
        long pro2 = n * 3;

        // Concatenate the original number, pro1, and pro2
        String concatenated = n + String.valueOf(pro1) + String.valueOf(pro2);

        // If the concatenated string is not of length 9, it cannot be fascinating
        if (concatenated.length() != 9) {
            return false;
        }

        // Create a HashMap to track the frequency of digits
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c = '1'; c <= '9'; c++) {
            map.put(c, 0);
        }

        // Count the frequency of digits in the concatenated string
        for (int i = 0; i < concatenated.length(); i++) {
            char currentChar = concatenated.charAt(i);
            if (currentChar < '1' || currentChar > '9') {
                return false; // Contains an invalid digit
            }
            map.put(currentChar, map.get(currentChar) + 1);
        }

        // Check if all digits from 1 to 9 are present exactly once
        for (char c = '1'; c <= '9'; c++) {
            if (map.get(c) != 1) {
                return false;
            }
        }

        return true;
    }
}
