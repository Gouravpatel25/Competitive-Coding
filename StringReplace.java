/*
Input :
apples   string
a         ch1
p         ch2

Output: paales

*/


import java.util.*;

    public class StringReplace {

        public static String stringReplace(String s, char ch1, char ch2) {
            // Create a new StringBuilder to modify the string
            StringBuilder result = new StringBuilder(s);

            // Iterate through the string and swap characters as needed
            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == ch1) {
                    result.setCharAt(i, ch2);
                } else if (result.charAt(i) == ch2) {
                    result.setCharAt(i, ch1);
                }
            }

            // Convert StringBuilder back to String and return it
            return result.toString();
        }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            char ch1 = sc.next().charAt(0);
            char ch2 = sc.next().charAt(0);

            System.out.println(stringReplace(s, ch1, ch2));
            sc.close();
        }
    }


/* PROCESS 2 FOR SOLVING

import java.util.*;

public class StringReplace {

    public static String stringReplace(String s, char ch1, char ch2) {
        // Step 1: Replace all occurrences of ch1 with a placeholder character (let's say '\0')
        String temp = s.replace(ch1, '\0');
        // Step 2: Replace all occurrences of ch2 with ch1
        temp = temp.replace(ch2, ch1);
        // Step 3: Replace the placeholder character with ch2
        return temp.replace('\0', ch2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.println(stringReplace(s, ch1, ch2));
        sc.close();
    }
}

 */
