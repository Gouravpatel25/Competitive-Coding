/*
Problem Statement:
You are given a decimal number N. Your task is to:

Convert it to binary.
Return the sum of the binary digits.
Example:
For N = 10:

Binary of 10 is 1010.
Sum of digits is 1 + 0 + 1 + 0 = 2.
Output: 2
*/

import java.util.*;

public class A {

    public static int sumOfBinary(int n) {
        int sum = 0;
        
        // Directly sum the binary digits
        while (n > 0) {
            sum += n % 2;  // Add the remainder (binary digit)
            n = n / 2;     // Update n to the next quotient
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int n = sc.nextInt();
        
        System.out.println("Sum of binary digits: " + sumOfBinary(n));
    }
}

