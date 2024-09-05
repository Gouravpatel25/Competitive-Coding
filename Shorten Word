/*
Problem Statement:
A young boy finds it difficult to read words that are more than 10 letters long. To help him, you need to write a program that shortens such words. Specifically, for any word longer than 10 letters, the program should convert it into a format where only the first letter, the number of letters in between, and the last letter are kept.

For example, the word "demonstration" becomes "d11n".

Your task is to implement a program that will take a sentence as input and produce a modified sentence according to the rules described.

Input: "The demonstration of government laws makes it difficult to understand"
Output: "the d11n of g8t laws makes it difficult to u8d"

Overall time complexity is O(n+k), which simplifies to O(n).

*/

import java.util.*;

public class A {
    
    public static String shortenWord(String s){
        if(s.length()>=10){
          return s.charAt(0)+String.valueOf(s.length()-2)+s.charAt(s.length()-1)+" ";
        }
        
        return s+" ";
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        
        String[] words=sentence.split(" ");
        
        StringBuilder result= new StringBuilder();
        
        for (int i=0; i<words.length ; i++){
            result.append(shortenWord(words[i]));
        }
        
        System.out.println(result.toString());

    }
}
