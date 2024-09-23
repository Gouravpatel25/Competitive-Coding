/*
Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
Return the maximum product you can get.
Example 1:
Input: n = 2
Output: 1
Explanation: 2 = 1 + 1, 1 × 1 = 1.
Example 2:
Input: n = 10
Output: 36
Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
*/
class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1; // Special case
        }
        if (n == 3) {
            return 2; // Special case
        }
        
        int q = n / 3;
        int r = n % 3;
        int product = 1;
        
        if (r == 0) {
            product = (int) Math.pow(3, q);
        } else if (r == 1) {
            product = (int) Math.pow(3, q - 1) * 4;
        } else if (r == 2) {
            product = (int) Math.pow(3, q) * 2;
        }
        
        return product;
    }
}
