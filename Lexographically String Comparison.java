/*
Given two strings that contain both uppercase and lowercase characters, determine the lexicographically smaller string.
Convert both strings to lowercase for comparison.
Return:
-1 if the first string is lexicographically smaller.
1 if the second string is lexicographically smaller.
0 if both strings are equal.
Example:
Input:
String 1: "SHOuRYa"
String 2: "SauraBH"
Output:
1
*/

/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;  // Import the Scanner class

public class A {
    
    public static int checkLexographically(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        int result = a.compareTo(b);
        
         if (result < 0) {
            return -1;
        }
        // If second string is lexicographically smaller
        else if (result > 0) {
            return 1;
        }
        // If both strings are equal
        else {
            return 0;
        }    
        
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  // Corrected: Added Scanner import
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        System.out.println(checkLexographically(a, b));
    }
}
