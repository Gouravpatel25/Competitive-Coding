/*
Given two strings s1 and s2, check if these two strings are isomorphic to each other.
If the characters in s1 can be changed to get s2, then two strings, s1 and s2, are isomorphic.
A character must be completely swapped out for another character while maintaining the order of the characters. A character may map to itself, but no two characters may map to the same character.

Examples:

Input: s1 = "aab", s2 = "xxy"
Output: true
Explanation: There are two different characters in aab and xxy, i.e a and b with frequency 2 and 1 respectively.

Input: s1 = "aab", s2 = "xyz"
Output: false
Explanation:  There are two different characters in aab but there are three different charactersin xyz. So there won't be one to one mapping between s1and s2.
*/

class Solution {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s1, String s2) {
        // Your code here
        
        if(s1.length() != s2.length()){
            return false;
        }
        
        
        HashMap<Character,Character> map= new HashMap();
        HashSet<Character> set=new HashSet();
        
        for(int i=0; i<s1.length(); i++){
            char char1=s1.charAt(i);
            char char2=s2.charAt(i);
            
            if(map.containsKey(char1)){
                if(map.get(char1) != char2){
                    return false;
                }
            }
            
            else{
                if(set.contains(char2)){
                    return false;
                }
                
                map.put(char1,char2);
                set.add(char2);
            }
            
            
        }
        
        return true;
    }
}
