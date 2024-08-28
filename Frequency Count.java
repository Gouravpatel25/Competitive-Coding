/*
Frequency Count:

Given the string, find the frequency of each character in it.

The input string contains only lowercase letters. The output string should contain a letter followed by its frequency, in the alphabetical order (from a - z).

Input 1: babdc

Output 1: a1b2c1d1

Input 2: cbd

Output 2: b1c1d1

*/

//METHOD 1
// Time Complexity : O(nlogn)
//Space Complexity:  O(n)

import java.util.*;

public class A{
    public static String frequencyCount(String str){
        
        char[] arr=str.toCharArray();
        StringBuilder sb=new StringBuilder();
        Arrays.sort(arr);
        
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1 && arr[i]==arr[i+1]){
                count++;
            }
            else{
                sb.append(arr[i]).append(count);
                count=1;
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        
        
        System.out.println(frequencyCount(s));
    }
}


//METHOD 2 using HashMap
//Time Complexity & Space Complexity =O(n)

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {
    public static String frequencyCount(String str) {
        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each character in the string
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        // Use StringBuilder to build the output string
        StringBuilder sb = new StringBuilder();
        
        // Loop through characters from 'a' to 'z' to ensure alphabetical order
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (frequencyMap.containsKey(ch)) {
                sb.append(ch).append(frequencyMap.get(ch));
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        
        // Print the result of frequency count
        System.out.println(frequencyCount(s));
        
        sc.close();
    }
}

