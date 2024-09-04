/*
Given a string as input, which consists of words separated by full stops (.), return the word with the largest size.

Example:

Input: "hello.my.name.is.shaurya"
Output: "shaurya"
*/

import java.util.*;

public class A {

    public static String longestString(String s) {
        String[] arr = s.split("\\.");
        String maxLenStr = arr[0]; // Initialize with the first string

        for (String i : arr) {
            if (i.length() > maxLenStr.length()) {
                maxLenStr = i; // Update the longest string
            }
        }

        return maxLenStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(longestString(s));
    }
}
