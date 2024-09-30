/*
Input: AbCDaB 
Output: aBcdAb
*/

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        // Input string
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        
        // Initialize a StringBuilder to store the result
        StringBuilder result = new StringBuilder();
        
        // Iterate over each character of the input string
        for (char ch : input.toCharArray()) {
            // Check if the character is uppercase, convert to lowercase
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } 
            // If it's lowercase, convert to uppercase
            else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } 
            // If it's not a letter, append it unchanged
            else {
                result.append(ch);
            }
        }
        
        // Output the transformed string
        System.out.println("Output: " + result.toString());
    }
}
