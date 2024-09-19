/*
There is a sequence of colorful stones. The color of each stone is one of red, green, or blue. You are given a string s. The i-th (1-based) character of s represents the color of the i-th stone. If the character is "R", "G", or "B", the color of the corresponding stone is red, green, or blue, respectively.
Initially Squirrel Liss is standing on the first stone. You perform instructions one or more times.
Each instruction is one of the three types: "RED", "GREEN", or "BLUE". After an instruction c, if Liss is standing on a stone whose colors is c, Liss will move one stone forward, else she will not move.
You are given a string t. The number of instructions is equal to the length of t, and the i-th character of t represents the i-th instruction.
Calculate the final position of Liss (the number of the stone she is going to stand on in the end) after performing all the instructions, and print its 1-based position. It is guaranteed that Liss don't move out of the sequence.
Input:
RGB
RRR
Output: 2

Input:
RRRBGBRBBB
BBBRR
Output:3
*/

import java.io.*; 
import java.util.*; 

public class ColourfulStones {
    
    public static int findStandingPosition(String s, String t){
        int position = 0;  // 0-based index to track current stone position
        
        for(int i = 0; i < t.length(); i++){
            // Check if the current instruction matches the stone color
            if(s.charAt(position) == t.charAt(i)){
                position++;  // Move to the next stone if the colors match
            }
            // Note: Do not increment position if colors do not match
        }
        
        // Return the final position in 1-based index
        return position + 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();  // Input the sequence of stones
        String t = sc.nextLine();  // Input the sequence of instructions

        // Output the final 1-based position
        System.out.println(findStandingPosition(s, t));     
    }
}
