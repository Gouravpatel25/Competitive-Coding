/*
Sandwiched_Vowels
For a given string s comprising only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants(sandwiched between two immediately adjacent consonants). Return the new string.
Examples:
Input : s = "bab"
Output : bb
Explanation: 'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.
Input : s = "ceghij"
Output : cghj
Explanation: 'e' and 'i' are sandwitched vowels.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(1).
*/

class Complete{
    
   
    public static String Sandwiched_Vowel(String str) 
    { 
        // Complete function
        StringBuilder sfinal = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        
        // Add vowels to the set
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() - 1) {
                // Always add the first and last characters
                sfinal.append(str.charAt(i));
            } else {
                // Check if the current character is a sandwiched vowel
                if (set.contains(str.charAt(i)) && 
                    !set.contains(str.charAt(i - 1)) && 
                    !set.contains(str.charAt(i + 1))) {
                    // Skip the vowel
                    continue;
                }
                // Add the character if it is not a sandwiched vowel
                sfinal.append(str.charAt(i));
            }
        }
        
        return sfinal.toString();
    } 
}
