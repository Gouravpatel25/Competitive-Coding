/*
Given a sequence of strings, the task is to find out the second most repeated (or frequent) string in the given sequence.
Note: No two strings are the second most repeated, there will be always a single string.

Example 1:

Input:
N = 6
arr[] = {aaa, bbb, ccc, bbb, aaa, aaa}
Output: bbb
Explanation: "bbb" is the second most 
occurring string with frequency 2.

Example 2:

Input: 
N = 6
arr[] = {geek, for, geek, for, geek, aaa}
Output: for
Explanation: "for" is the second most
occurring string with frequency 2.
*/


class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        
        HashMap<String,Integer> map= new HashMap();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            
        }
        
        
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        
        for(int i:map.values()){
            if(i>max){
                secondmax=max;
                max=i;
            }
            
            if(i<max && i>secondmax){
                secondmax=i;
            }
        }
        
        String s="";
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == secondmax) {
                s=entry.getKey(); // Return the key if the value matches
            }
        }
        
        return s;
    }
}
