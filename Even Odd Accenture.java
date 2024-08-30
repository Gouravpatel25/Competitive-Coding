/*
Given N as input , you need to determine if it is even or odd. If the no is even then find the sum of the digits of the number & if the no is odd then find the product of the digits of the number and return it .

Input : 16 //even no
Output : 7

Input : 55 //odd no
Output: 25
*/

import java.util.*;

public class A {
    public static int evenOdd(int n) {
        int result;
        
        if (n % 2 == 0) {
            result = 0; // Initialize for sum
            while (n != 0) {
                int digit = n % 10;
                result += digit; // Sum the digits
                n /= 10;
            }
        } else {
            result = 1; // Initialize for product
            while (n != 0) {
                int digit = n % 10;
                result *= digit; // Multiply the digits
                n /= 10;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(evenOdd(N));
    }
}
