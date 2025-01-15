/*
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].
Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.
Examples:
Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
Output: 6, 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.
Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
Output: 8, -1
Explanation: Floor of 10 is 8 but ceil of 10 is not possible.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
*/

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        
       int[] result = new int[2];
        TreeSet<Integer> set = new TreeSet<>();

        // Add all elements to the TreeSet
        for (int num : arr) {
            set.add(num);
        }

        // Find floor and ceil using TreeSet methods
        Integer floor1 = set.floor(x); // Largest element <= x
        Integer ceil1 = set.ceiling(x); // Smallest element >= x

        // If floor1 or ceil1 is null, replace with -1
        result[0] = (floor1 != null) ? floor1 : -1;
        result[1] = (ceil1 != null) ? ceil1 : -1;

        return result;
    }
}
