/*
First Repeated Character
Given a string s. The task is to find the first repeated character in it.
We need to find the character that occurs more than once and whose index of second occurrence is smallest. s contains only lowercase letters.
Examples :
Input: s ="geeksforgeeks"
Output: "e"
Explanation: 'e' repeats at third position.
Input: s ="hellogeeks"
Output: "l"
Explanation: 'l' repeats at fourth position.
Input: s ="abc"
Output: "-1"
Explanation: There is no repeated character.
*/

class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        
        HashSet<Character> set= new HashSet();
        String sreturn= "-1";
        
        for(int i=0; i<s.length(); i++){
            
            char ch=s.charAt(i);
            
            if(set.contains(ch)){
                sreturn=String.valueOf(ch);
                break;
            }
            
            set.add(ch);
        }
        
        
        return sreturn;
    }
} 
