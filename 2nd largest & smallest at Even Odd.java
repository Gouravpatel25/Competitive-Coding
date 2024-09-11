/*
You are required to implement the following function: def LargeSmallSum(arr)
The function accepts an integer array arr of size 'length' as its arguments. You are required to return the sum of:
Second largest element from the even positions and Second smallest from the odd positions of the given array arr.
Assumptions:
All array elements are unique.
Treat the 0th position as even.
Note:
Return 0 if the array is empty.
Return 0 if the array length is less than 3.
Example:
Input:
arr = [3, 2, 1, 7, 5, 4]
Output:
7
*/
// Approch 1 (Using extra space)
import java.util.ArrayList;
import java.util.Collections;

public class LargeSmallSum {

    public static int largeSmallSum(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }

        // Lists to store even and odd indexed elements
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        // Separate even and odd indexed elements
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenList.add(arr[i]);  // Elements at even indices
            } else {
                oddList.add(arr[i]);   // Elements at odd indices
            }
        }

        // Sort both lists
        Collections.sort(evenList);
        Collections.sort(oddList);

        // If we don't have at least two elements in either list, return 0
        if (evenList.size() < 2 || oddList.size() < 2) {
            return 0;
        }

        // Second largest from evenList and second smallest from oddList
        int secondLargestEven = evenList.get(evenList.size() - 2);
        int secondSmallestOdd = oddList.get(1);

        // Return the sum of second-largest from evenList and second-smallest from oddList
        return secondLargestEven + secondSmallestOdd;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        System.out.println(largeSmallSum(arr1));  // Output: 7

        int[] arr2 = {1, 8, 0, 2, 3, 5, 6};
        System.out.println(largeSmallSum(arr2));  // Output: 8
    }
}


//Approch 2 without using any extra space
public class LargeSmallSum {

    public static int largeSmallSum(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }

        // Initialize variables for even and odd positions
        int max1_even = Integer.MIN_VALUE, max2_even = Integer.MIN_VALUE;
        int min1_odd = Integer.MAX_VALUE, min2_odd = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {  // Even index
                if (arr[i] > max1_even) {
                    max2_even = max1_even;  // Update second-largest
                    max1_even = arr[i];     // Update largest
                } else if (arr[i] > max2_even) {
                    max2_even = arr[i];     // Update second-largest
                }
            } else {  // Odd index
                if (arr[i] < min1_odd) {
                    min2_odd = min1_odd;    // Update second-smallest
                    min1_odd = arr[i];      // Update smallest
                } else if (arr[i] < min2_odd) {
                    min2_odd = arr[i];      // Update second-smallest
                }
            }
        }

        // If no valid second-largest or second-smallest found, return 0
        if (max2_even == Integer.MIN_VALUE || min2_odd == Integer.MAX_VALUE) {
            return 0;
        }

        return max2_even + min2_odd;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        System.out.println(largeSmallSum(arr1));  // Output: 7

        int[] arr2 = {1, 8, 0, 2, 3, 5, 6};
        System.out.println(largeSmallSum(arr2));  // Output: 8
    }
}
