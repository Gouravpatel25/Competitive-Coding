/*
Input:10111011
Output:ACB
*/

import java.io.*;
import java.util.*;

public class A {

    public static String decodeString(String s) {
        String finalString = ""; 
        
        String[] arr = s.split("0");  
        
       
        for (int i = 0; i < arr.length; i++) {
            int count = arr[i].length();  
            finalString += (char) ('A' + count - 1); 
        }

        return finalString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "10111011";  
        System.out.println(decodeString(s)); 
    }
}
