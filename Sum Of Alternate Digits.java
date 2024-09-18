/*
The question asks for a program that takes two inputs, dice and num, and performs the following:
If dice is even, print the sum of the digits at odd indices of num.
If dice is odd, print the sum of the digits at even indices of num.
Input:
dice = 2
num = 1234
Output: 6
*/

import java.util.Scanner;

public class SumOfAlternateDigits {
    public static void main(String[] args) {
        // Creating a Scanner object to take inputs
        Scanner sc = new Scanner(System.in);

        // Input dice and num
        System.out.print("Enter the value of dice: ");
        int dice = sc.nextInt();
        
        System.out.print("Enter the number: ");
        int num = sc.nextInt(); // num is taken as an integer now

        // Convert the integer to a string to easily access its digits
        String numStr = Integer.toString(num);

        int sum = 0; // To store the result of the sum (either odd or even indexed digits)

        // Check if dice is even or odd
        if (dice % 2 == 0) {
            // Dice is even, we sum digits at odd indices (1, 3, 5,...)
            for (int i = 1; i < numStr.length(); i += 2) {
                int digit = numStr.charAt(i) - '0'; // Convert character to digit
                sum += digit; // Sum the digits at odd indices
            }
            System.out.println("Sum of digits at odd indices: " + sum);
        } else {
            // Dice is odd, we sum digits at even indices (0, 2, 4,...)
            for (int i = 0; i < numStr.length(); i += 2) {
                int digit = numStr.charAt(i) - '0'; // Convert character to digit
                sum += digit; // Sum the digits at even indices
            }
            System.out.println("Sum of digits at even indices: " + sum);
        }

        // Close scanner
        sc.close();
    }
}
