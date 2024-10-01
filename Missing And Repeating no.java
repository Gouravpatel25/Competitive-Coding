/*
Input: [4, 3, 6, 2, 1, 1]
Output: 5 
        1
*/

import java.util.HashMap;

public class FindMissingAndRepeating {
    public static void findMissingAndRepeating(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Store frequencies of each element in the hashmap
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        // Find the repeating number
        int repeating = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                repeating = key;
                break;
            }
        }
        
        // Calculate the sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        // Calculate the missing number
        int missing = expectedSum - (actualSum - repeating);
        
        System.out.println("Missing number: " + missing);
        System.out.println("Repeating number: " + repeating);
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        findMissingAndRepeating(arr);
    }
}
