/*
You are given a string S, and your task is to find and return the count of permutations formed by fixing the positions of the vowels present in the string.
Input : "ybgkhiahebuyiob"
Output:3360
*/


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static long countPermutations(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); 
        vowels.add('e'); 
        vowels.add('i');
        vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I');
        vowels.add('O'); vowels.add('U');

        Map<Character, Integer> consonantCount = new HashMap<>();
        int totalConsonants = 0;

        // Count consonants and their frequencies
        for (char c : s.toCharArray()) {
            if (!vowels.contains(c) && Character.isLetter(c)) {
                consonantCount.put(c, consonantCount.getOrDefault(c, 0) + 1);
                totalConsonants++;
            }
        }

        // If there are no consonants, return 0
        if (totalConsonants == 0) {
            return 0;
        }

        // Calculate the total permutations (same as before)
        long permutations = factorial(totalConsonants);
        for (int count : consonantCount.values()) {
            if (count > 0) {
                permutations /= factorial(count);
            }
        }

        return permutations;
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String s = "ybgkhiahebuyiob";
        System.out.println(countPermutations(s));
    }
}
