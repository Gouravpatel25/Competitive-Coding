/*
Given an array of integers ,find the nearest smallest number for every element such that the smaller element is on the left side
Input :{1,6,4,10,2,5}
Output:{-1,1,1,4,1,2}
*/

// Approch -1 Stack Based 
import java.util.Stack;

public class SmallerElementOnLeft {

    public static int[] smallerLeft(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty and top of stack is greater than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            // If stack is empty, then there is no smaller element on the left
            if (stack.isEmpty()) {
                temp[i] = -1;
            } else {
                temp[i] = stack.peek();
            }
            // Push the current element to stack
            stack.push(arr[i]);
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        int[] result = smallerLeft(arr);
        // Output should be: -1 1 1 4 1 2
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}


//Approch 2 - Nested Loops

public class SmallerElementOnLeft {

    public static int[] smallerLeft(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = -1; // Initialize with -1, assuming no smaller element exists
            for (int j = i - 1; j >= 0; j--) { // Check all elements to the left of arr[i]
                if (arr[j] < arr[i]) {
                    temp[i] = arr[j]; // Found a smaller element on the left
                    break; // Stop as we only need the nearest smaller element
                }
            }
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 4, 10, 2, 5};
        int[] result = smallerLeft(arr);
        // Output should be: -1 1 1 4 1 2
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
