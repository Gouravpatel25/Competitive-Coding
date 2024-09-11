/*
Question:
Write a Java program that reads n integers from user input, removes any duplicate values, and then outputs the second largest and second smallest unique integer.
Input Example:
6  
3 1 2 3 4 1
Output Example:
2
3
*/

import java.util.*;

public class A {

    public static void secondLargestSecondSmallest(int n, int[] arr) {
        // Using HashSet to store unique elements (no duplicates)
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements to HashSet
        for (int i : arr) {
            set.add(i);
        }
        
        // Convert HashSet to a List and sort it
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);  // Sort the unique elements

        // Check if the list contains enough unique elements
        if (sortedList.size() < 2) {
            System.out.println("Not enough unique elements to find second largest and second smallest");
            return;
        }
        
        // Get the second smallest (index 1) and second largest (second last index)
        int secondSmallest = sortedList.get(1);
        int secondLargest = sortedList.get(sortedList.size() - 2);
        
        System.out.println(secondSmallest);
        System.out.println (secondLargest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input size
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read the input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } 
        
        // Call the method
        secondLargestSecondSmallest(n, arr);
    }
}
