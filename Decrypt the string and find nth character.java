/* Write a function to decrypt the string and find nth character of the decrypted string. If no character exists at that position then return "-1".

For example: if the input string is "a2b3", the decrypted string will be "aabbb"

Note: The frequency of encrypted string can not be greater than single digit i.e < 10.

Example 1:

Input 1: a2b2c2d1 //string

Input 2:5 //value of n

Output: c
*/


import java.util.*;

public class A{
    public static String compressedString(String str,int n){
        
        StringBuilder sb=new StringBuilder(); //creating a StringBuilder to store the decompressed string
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            
            if(Character.isDigit(ch)){
                int freq=Character.getNumericValue(ch);
                char preChar=str.charAt(i-1);
                //to append the repeating characters in the StringBuilder
                for(int j=0;j<freq;j++){
                    sb.append(preChar);
                }
            }
        }
        
        if(n<=sb.length()){
            return Character.toString(sb.charAt(n-1));
        }
        else{
            return "-1";
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        int n=sc.nextInt();
        
        System.out.println(compressedString(s,n));
    }
}
