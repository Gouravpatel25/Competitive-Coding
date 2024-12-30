/*
Given a string s without spaces, a character ch and an integer count. Your task is to return the substring that remains after the character ch has appeared count number of times.
Note:  Assume upper case and lower case alphabets are different. “”(Empty string) should be returned if it is not possible, or the remaining substring is empty.

Examples:

Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng
Explanation: The remaining substring of s after the 3rd
occurrence of 'i' is "ng", hence the output is ng.
Input: s = "Thisisdemostri", ch = 'i', count = 3
Output: ""
Explanation: The 3rd occurence of 'i' is at the last index. In this case the remaining substring is empty, hence we return empty string.
*/

class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        
        if(s.indexOf(ch)==-1){
            return "";
            
        }
        
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                count--;
                
                if(count==0){
                    return s.substring(i+1);
                }
                
                else if(count ==0 && i==(s.length()-1)){
                    return "";
                }
            }
            
        }
        
        return "";
    }
}
