/*
Given a string S , you need to reverse the words of the string and print it
Input: Apple Is Good
Output:elppA sI dooG

*/

import java.util.Scanner;

public class A{
    
    public static String reverseEachWord(String s){
        
        String[] arr=s.split(" ");
        StringBuilder result= new StringBuilder();
        
        for(String s1:arr){
            StringBuilder temp=new StringBuilder();
            for(int j=s1.length()-1; j>=0;j--){
                char ch=s1.charAt(j);
                temp=temp.append(ch);
            }
            result=result.append(temp).append(" ");
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String original=sc.nextLine();
        
        System.out.println(reverseEachWord(original));
    }
}

