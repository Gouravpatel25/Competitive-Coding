/*
You are given a binary string composed of sequences of 1s and 0s. The sequences of 1s represent encoded characters, and the 0s act as separators between the encoded values. Your task is to decode the binary string into its corresponding ASCII characters using the following rules:

Each sequence of 1s in the binary string corresponds to a letter in the alphabet.
The number of 1s in each sequence determines which letter it is. For example:
A single 1 corresponds to the letter 'A' (ASCII value 65).
Two 1s correspond to the letter 'B' (ASCII value 66).
Three 1s correspond to the letter 'C' (ASCII value 67).
And so on...
The sequences of 1s are separated by 0s, which act as delimiters.
Write a function that takes in the binary string and returns the decoded string of characters.

Input: 11101101111110
Output: CBF

*/

import java.util.*;
public class A{
    
    public static String decodeString(String input){
        
        String[] arr= input.split("0");
        StringBuilder decodedString= new StringBuilder();
        
        for(String s:arr){
            int noOfOnes=s.length();
            char ch= (char)(noOfOnes+64);
            
            decodedString.append(ch);
        }
        
        return decodedString.toString();
    }
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        String input= sc.nextLine();
        
        System.out.println(decodeString(input));
    }
}
