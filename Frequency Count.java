/*
Frequency Count:

Given the string, find the frequency of each character in it.

The input string contains only lowercase letters. The output string should contain a letter followed by its frequency, in the alphabetical order (from a - z).

Input 1: babdc

Output 1: a1b2c1d1

Input 2: cbd

Output 2: b1c1d1

*/


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
